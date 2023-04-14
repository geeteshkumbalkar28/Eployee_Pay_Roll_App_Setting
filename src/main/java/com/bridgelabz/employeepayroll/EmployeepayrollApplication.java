package com.bridgelabz.employeepayroll;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.function.ServerResponse;

import javax.naming.Context;

@SpringBootApplication
@Slf4j
public class EmployeepayrollApplication {
	public static void main(String[] args) {
		SpringApplication.run(EmployeepayrollApplication.class, args);
		log.info("Application is Started");
	}
}
