package com.example.demo;

import demo.ReadObjectDemo1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
//ba00e74b6e2acf660c0d4b215abbcbb7faf482291


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		SpringApplication.run(DemoApplication.class, args);
		ReadObjectDemo1 readObjectDemo1 = new ReadObjectDemo1();
		readObjectDemo1.readObject(null);
	}
}
