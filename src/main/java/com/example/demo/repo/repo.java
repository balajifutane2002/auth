package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entitiy.StudentTable;


@Repository
public interface repo extends JpaRepository<StudentTable,Integer> {

}
