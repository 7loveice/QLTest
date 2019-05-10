package com.example.demo;

import demo.ReadObjectDemo1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
//491FD196A973BBED0C10438D75D1CA81


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		SpringApplication.run(DemoApplication.class, args);
		ReadObjectDemo1 readObjectDemo1 = new ReadObjectDemo1();
		readObjectDemo1.readObject(null);
	}
}
