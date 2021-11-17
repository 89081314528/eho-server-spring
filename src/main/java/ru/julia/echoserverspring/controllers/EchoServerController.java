package ru.julia.echoserverspring.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoServerController {
    @RequestMapping("/echo/{message}")
    public String echoPathVariable(@PathVariable String message) {
        return message;
    }

    @RequestMapping("/echo")
    public String echoRequestParam(@RequestParam("message") String message) {
        return message;
    }
}
