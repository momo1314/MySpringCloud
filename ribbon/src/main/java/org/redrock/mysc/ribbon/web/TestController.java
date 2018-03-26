package org.redrock.mysc.ribbon.web;

import org.redrock.mysc.ribbon.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    TestService testService;

    @RequestMapping(value = "mysctest")
    public String mysctest(@RequestParam String name ) {
        return testService.testService(name);
    }
}
