package com.fundamentosplatzi.springboot.fundamentos.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
public class TestController {
    
    @RequestMapping
    @ResponseBody
    public ResponseEntity<String> test() {
        return new ResponseEntity<>("Hola Mundo dos", HttpStatus.OK);
    }
}
