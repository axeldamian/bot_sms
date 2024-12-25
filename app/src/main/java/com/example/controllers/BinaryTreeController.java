package com.example.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.services.BinaryTreeService;

@RestController
public class BinaryTreeController {

    Logger log = LogManager.getLogger(this.getClass().getSimpleName());

    @Autowired
     private BinaryTreeService service;

    @GetMapping("/binarytree")
    public ResponseEntity<Integer> getHeight() {
        log.info("call to endpoint /binarytree");
        Integer h = service.getBinaryTreeHeight();
        return new ResponseEntity<>( h , HttpStatus.OK);
    }
    
}
