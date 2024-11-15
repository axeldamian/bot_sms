package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.services.SmsService;

@RestController
public class SmsController {

        @Autowired
        private SmsService service;

        @GetMapping(value = "/send")
        public ResponseEntity<String> send() {

                String smsMsg = "hola";
                service.enviarSms(smsMsg);
                //Twilio.init("AC4208250e8f2c32941881dccf41f8a2b8", "dbac745b605672108de176757912870f");

                //Message.creator(new PhoneNumber("+541164968085"),
                //                new PhoneNumber("+12029291012"), "Hello from Twilio 📞").create();

                return new ResponseEntity<String>("Message sent successfully", HttpStatus.OK);
        }
}
