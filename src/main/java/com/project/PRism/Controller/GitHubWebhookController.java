package com.project.PRism.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/webhook")
public class GitHubWebhookController {
    @PostMapping
    public ResponseEntity<Void> handleWebhook(
        @RequestHeader("X-GitHub-Event") String event,
        @RequestHeader("X-GitHub-Delivery") String deliveryId,
        @RequestBody String payload) {
        
        System.out.println("Event: " + event);
        System.out.println("Delivery ID: " + deliveryId);
        System.out.println("Payload: " + payload);

        if ("pull_request".equals(event)) {
            System.out.println("Received a Pull Request event!");
        }
        return ResponseEntity.ok().build();
    }
}