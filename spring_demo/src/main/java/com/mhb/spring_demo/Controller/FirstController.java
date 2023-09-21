package com.mhb.spring_demo.Controller;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @Value("${msg.value}")
    private String welcomeMessage;

    @GetMapping("/root")
    public String helloWorld() {
        return welcomeMessage ;
    }

}