package com.ms.intro.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/resources/health")
public class HealthChecker {

    @GetMapping("/liveness")
    public ResponseEntity<String> liveness() {
        return ResponseEntity.ok("UP");
    }

    @GetMapping("/readiness")
    public ResponseEntity<String> readiness() {
        return ResponseEntity.ok("UP");
    }

    @GetMapping("/startup")
    public ResponseEntity<String> startup() {
        return ResponseEntity.ok("UP");
    }
}
