package com.bhoper.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bhoper.dto.Greetings;

import java.security.Principal;

@RestController
@RequestMapping("/greetings-api/greetings")
public class GreetingsRestController {

    @GetMapping
    public Greetings getGreetings(Principal principal) {
        return new Greetings("Hello, %s!"
                .formatted(principal != null ? principal.getName() : "Default User"));
    }
}
