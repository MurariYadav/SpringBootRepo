package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemo1Application {
	
		
	
	

	public static void main(String[] args) {
	ApplicationContext ac=	SpringApplication.run(SpringDemo1Application.class, args);
	
	HelloService service=ac.getBean("HS",HelloService.class);
	System.out.println(service.sayHello("Murari"));
	System.out.println(ac.getBeanDefinitionCount());
	
	String names[]=ac.getBeanDefinitionNames();
	for(String name:names)
	{
		System.out.println(name);
	}
		
	}

	
	}
