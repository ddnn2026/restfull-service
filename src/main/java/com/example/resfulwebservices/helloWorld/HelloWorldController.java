package com.example.resfulwebservices.helloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Hello david";
    }

    @GetMapping("/hello-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello world bean");
    }

    @GetMapping("/hello-bean/path-variable/{name}")
    public HelloWorldBean helloWorldBeanPath(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }

    @GetMapping(path = "/hello-world-internationalized")
    public String helloWorldInternationalized(){
        return "Good Morning";
    }
}
