package com.czx.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:consumer.xml")
public class DubboSpringConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboSpringConsumerApplication.class, args);
	}
}
