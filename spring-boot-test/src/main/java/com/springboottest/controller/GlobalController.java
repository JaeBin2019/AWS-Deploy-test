package com.springboottest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GlobalController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/health")
    public ResponseEntity<String> healthCheck() {
        return ResponseEntity.status(200)
                .body("health check ok");
    }

    @GetMapping("/db")
    public ResponseEntity<String> dbCheck() {
        try {
            jdbcTemplate.execute("SELECT 1");
            return new ResponseEntity<>("Database is connected", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Database is not connected", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
