package com.exp.springcloudalibaba;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/init")
    public String test(){
        return "hello spring boot";
    }
}
