package com.example.demo;

import demo.ReadObjectDemo1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		ReadObjectDemo1 readObjectDemo1 = new ReadObjectDemo1();
		readObjectDemo1.readObject();
	}
}
