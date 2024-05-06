package com.rafa.rafa.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController{

    @GetMapping("/health")
    public ResponseEntity<String> healthCheck() {
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = dateFormat.format(currentDate);
        String response = "I am healthy! Current date: " + formattedDate;
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}