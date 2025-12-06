package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entitiy.StudentTable;

public interface repo extends JpaRepository<StudentTable,Integer> {

}
