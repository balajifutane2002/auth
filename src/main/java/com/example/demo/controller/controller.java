package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entitiy.StudentTable;
import com.example.demo.services.studentServices;

@RestController
public class controller {
	
	
	@Autowired
	studentServices r;
	
	@PostMapping("/add")
	String login(StudentTable s) {
		
		
		return r.addstudent(s);
		
		
		
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





