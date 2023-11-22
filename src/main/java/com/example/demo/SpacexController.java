package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpacexController {

    @GetMapping("getmsg")
    public String getMsg(){
        return "I am WINNER master";
    }
}
