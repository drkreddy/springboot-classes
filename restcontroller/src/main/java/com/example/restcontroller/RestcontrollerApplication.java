package com.example.restcontroller;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.annotation.Order;

@SpringBootApplication
public class RestcontrollerApplication implements CommandLineRunner, ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(RestcontrollerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("===========================APPLICATION HAS STARTED SUCCESSFULLY<<<<<<<<<<<<<<<<<<<<<<<<<,");
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("===========================I am SCHEDULING SOME WORKERS<<<<<<<<<<<<<<<<<<<<<<<<<,");

	}
}
