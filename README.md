# bot_sms
java bot que envía sms usando la Api de Twilio, hay varias Apis pero twilio me parecío la mejor.


precio en Argentina de twilio:
https://www.twilio.com/es-mx/sms/pricing/ar


Registrarse en twilio y te da 15 dolares gratis, despues te cobran.


Una vez levantada esta api en spring java:
realizar un Get a /send

la base url es localhost:8080

falta el applications.properties con las credenciales de Twilio ubicado en ```/src/main/resources/```

```
spring.application.name=jueguito
spring.profiles.active=nube

twilio.accountsid=AC.....
twilio.authtoken=....
twilio.tonumber=+5411...
twilio.fromnumber=+...
```

El toNumber es el número al que se quiere enviar el mensaje.

Twilio también permite mensajes dde whatsapp y correo electrónico, no solo SMS.


Las credenciales de twilio son información sensible, no es publica, no tiene que estar aca, capaz encriptada o en una variable de entorno.

Donde conseguir la info, el accountSid, el token y el número virtual propio desde donde se mandan los mensajes, el fromNumber:
https://console.twilio.com/?frameUrl=%2Fconsole%3Fx-target-region%3Dus1

borrar 

```
        log.info(accountSid);
        log.info(authToken);
        log.info(toNumber);
        log.info(fromNumber);
        log.info("----");
```
Ubicado en la clase SmsService en el método enviarSms, loguea información sensible, lo puse para testear si funcionaba bien.

