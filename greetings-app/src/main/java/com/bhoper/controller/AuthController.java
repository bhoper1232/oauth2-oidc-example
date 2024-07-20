package com.bhoper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping("/custom-login")
    public String customLogin() {
        return "custom-login";
    }

}
