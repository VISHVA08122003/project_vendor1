package com.example.spring.project.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/v1/order")
@Tag(name = "order")
public class OrderController {
	@GetMapping("/hello")
    public ResponseEntity<String> hello(){
		return ResponseEntity.status(200).body("hello");
	}

}
