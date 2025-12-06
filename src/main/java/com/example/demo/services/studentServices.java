package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entitiy.StudentTable;
import com.example.demo.repo.repo;

@Service
public class studentServices {
	
	@Autowired
	repo r;
	
	public String addstudent(StudentTable s) {
		
		
		r.save(s);
		
		return "Student added sucessfully";
		
	}
	
	

}
