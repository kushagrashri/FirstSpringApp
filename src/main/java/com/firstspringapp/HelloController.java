package com.firstspringapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    //UC-1
    @GetMapping("/hello1")
    public String sayHello1(){
        return "Hello from BridgeLabz";
    }

    //UC-2
    @GetMapping("/hello2")
    public String saYHello2(Model model){
        model.addAttribute("message", "Hello from BridgeLabz");
        return "hello";
    }

    //UC-3
    @GetMapping("/hello3")
    public String sayHello3(){
        return "Hello from BridgeLabz";
    }
}
