package com.sha.awscodedeploydemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    public ResponseEntity<?> healthCheck(){
        return ResponseEntity.ok("Works Successfully.");
    }
}