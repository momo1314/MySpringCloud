package org.redrock.mysc.feign.service;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceTestHystric implements SchedualServiceTest {
    @Override
    public String myscTestFromClientOne(String name) {
        return "sorry "+name;
    }
}
