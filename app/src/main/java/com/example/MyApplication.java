package com.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class MyApplication {

	 private static final Logger log = LogManager.getLogger(MyApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MyApplication.class, args);
		log.info("start application");
	}

	@EventListener
	public void shutdown(ContextClosedEvent event) {
		log.info("shutdown application");
	}
}
