package com.example.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EntityScan(basePackages = {"com.example.library.entity"})
@EnableDiscoveryClient
public class LibraryprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryprojectApplication.class, args);
	}

}
