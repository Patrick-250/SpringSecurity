package com.codewithty.springudemy.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${author.name}")
    private String authorName;

    @Value("${job.name}")
    private String jobName;

    //endpoints to use above values... call it developer info lols

    @GetMapping("/developerinfo")
    public String developerInfo() {
        return authorName + ", " + jobName;
    }
    //expose main route to give Hello World
    @GetMapping("/")
    public String SayHello() {
        return "Hello World!";
    }
    //new ednpoint
    @GetMapping("/workout")
    public String SayWorkout() {
        return "burn those calories!";
    }
    @GetMapping("/sit")
    public String SaySit() {
        return "go ahead and sit";
    }

}
