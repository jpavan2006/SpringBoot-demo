package com.pavan.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {
    private static ConfigurableApplicationContext context;
	public static void main(String[] args) {

		context=SpringApplication.run(DemoApplication.class, args);
	}

}
