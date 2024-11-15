package com.example.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.twilio.Twilio;
import com.twilio.type.PhoneNumber;

@Service
public class SmsService {

    private static final Logger log = LogManager.getLogger(SmsService.class);
    
    @Value("${twilio.accountsid}")
    private String accountSid;
    
    @Value("${twilio.authtoken}")
    private String authToken;
    
    @Value("${twilio.tonumber}")
    private String toNumber;
    
    @Value("${twilio.fromnumber}")
    private String fromNumber;

    public void enviarSms(String mensaje) {
        log.info(accountSid);
        log.info(authToken);
        log.info(toNumber);
        log.info(fromNumber);
        log.info("----");
    Twilio.init(accountSid, authToken);
    com.twilio.rest.api.v2010.account.Message message = com.twilio.rest.api.v2010.account.Message.creator(
            new PhoneNumber(toNumber),
            new PhoneNumber(fromNumber),
            mensaje
        ).create();
        String smsStatus = message.getStatus().toString();
        log.info(smsStatus);
        String msg = "SMS enviado a " + toNumber;
        log.info(msg);
    }

}
