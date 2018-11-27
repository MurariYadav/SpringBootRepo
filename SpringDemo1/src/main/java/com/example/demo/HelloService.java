package com.example.demo;

import org.springframework.stereotype.Service;

@Service("HS")
public class HelloService {
public String sayHello(String name) {
	return "Hello " +name+ " welcome to spring boot";
}
}
 