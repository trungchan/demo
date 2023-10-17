package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class HelloController {

    @GetMapping("hello")
    public ResponseEntity<?> hello(){

        return new ResponseEntity<>("hello", HttpStatus.OK);
    }

    @GetMapping("demo")
    public ResponseEntity<?> demo(){

        return new ResponseEntity<>("demo", HttpStatus.OK);
    }
}
