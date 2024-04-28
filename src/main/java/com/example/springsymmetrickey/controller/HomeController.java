package com.example.springsymmetrickey.controller;

import org.springframework.boot.autoconfigure.pulsar.PulsarProperties;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.Authenticator;
import java.security.Principal;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(Authentication authentication) {
        return "Hello, " + authentication.getName();
    }
}
