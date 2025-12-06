package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	
	
	
	@GetMapping("/login")
	String login() {
		
		
		return "Login SUcessfullyyyyyyyyyyyyyyyyyyyyy";
	}
	

}

//spring.application.name=AuthicationApi-1
//server.port=${PORT:8080}  
//
//spring.datasource.url=jdbc:postgresql://db.lgthpynxbgdegqhjoyck.supabase.co:5432/postgres?sslmode=require
//
//spring.datasource.username=postgres
//spring.datasource.password=Balaji@1337
//spring.datasource.driver-class-name=org.postgresql.Driver
//
//spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
//
//spring.jpa.hibernate.ddl-auto=update
//spring.jpa.show-sql=true