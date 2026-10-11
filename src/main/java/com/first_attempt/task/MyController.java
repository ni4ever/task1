package com.first_attempt.task; // Пакет

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    // 1 запрос: http://localhost:8080/welcome
    @GetMapping("/welcome")
    public String getWelcomeMessage() {
        return "Hello! My first server Spring Boot.";
    }

    // 2 запрос: http://localhost:8080/status
    @GetMapping("/status")
    public String getStatus() {
        return "Server is working! All complet.";
    }
}
