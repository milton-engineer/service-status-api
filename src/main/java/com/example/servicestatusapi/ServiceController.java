package com.example.servicestatusapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ServiceController {

    @GetMapping("/status")
    public Map<String, String> serviceStatus() {

        Map<String, String> response = new HashMap<>();

        response.put("service", "Authentication Service");
        response.put("status", "RUNNING");

        return response;
    }
}
