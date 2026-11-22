package com.project.PRism.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HealthCheck {
    
    @GetMapping("/health")
    public String health() {
        return "ok";
    }
    
}
