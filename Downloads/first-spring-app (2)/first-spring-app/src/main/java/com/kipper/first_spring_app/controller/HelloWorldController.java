package com.kipper.first_spring_app.controller;

import com.kipper.first_spring_app.configuration.SDKAWS; // Certifique-se de que esta classe existe
import com.kipper.first_spring_app.domain.User; // Certifique-se de que a classe User está no pacote correto
import com.kipper.first_spring_app.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world") // Mapeia as requisições para "/hello-world"
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @Autowired
    private SDKAWS sdkAWS;

    @GetMapping
    public String helloWorld() {
        return helloWorldService.helloWorld("Kipper");
    }

    @PostMapping
    public String helloWorldPost(@RequestBody User body) {
        return "Hello World " + body.getName();
    }
}