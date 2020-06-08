package com.carrot.recell;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RecellApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(RecellApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("서버시작");
		System.out.println("env = ");
	}
}
