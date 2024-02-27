package com.springboot.springbootcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.springbootcrud.dto.StudentDto;

@Repository
public interface StudentRepo extends JpaRepository<StudentDto, Integer>{

}
