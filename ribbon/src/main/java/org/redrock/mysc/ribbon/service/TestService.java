package org.redrock.mysc.ribbon.service;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TestService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "something")
    public String testService(String name) {
        return restTemplate.getForObject("http://FOREZP-HI/mysctest?name="+name,String.class);
    }

    public String something(String name) {
        return "something you can do? Is it?"+name;
    }
}
