package com.fabriciolondero.Spring.Batch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBatchApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringBatchApplication.class, args);
		System.exit(SpringApplication.exit(SpringApplication.run(SpringBatchApplication.class, args)));
	}

}
