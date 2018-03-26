package org.redrock.mysc.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "forezp-hi",fallback = SchedualServiceTestHystric.class)
public interface SchedualServiceTest {
    @RequestMapping(value = "/mysctest",method = RequestMethod.GET)
    String myscTestFromClientOne(@RequestParam(value = "name") String name);
}