package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.DI.Customer;

@SpringBootApplication
public class SpeqtoBackkupApplication {

	public static void main(String[] args) {
	
	ConfigurableApplicationContext ctx=SpringApplication.run(SpeqtoBackkupApplication.class, args);
	Customer c=ctx.getBean(Customer.class);
	
	c.display();
	
	}

}
