package com.ebbi.rest.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.ebbi.rest")
@EnableJpaRepositories("com.ebbi.rest.dao")
@EntityScan("com.ebbi.rest")
public class BookingServiceJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingServiceJpaApplication.class, args);
	}

}
