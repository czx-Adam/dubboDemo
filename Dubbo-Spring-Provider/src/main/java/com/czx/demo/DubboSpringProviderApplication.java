package com.czx.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:provider.xml")
public class DubboSpringProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboSpringProviderApplication.class, args);
	}
}
