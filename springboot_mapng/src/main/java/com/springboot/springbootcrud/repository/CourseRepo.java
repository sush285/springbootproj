package com.springboot.springbootcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.springbootcrud.dto.CourseDto;

@Repository
public interface CourseRepo extends JpaRepository<CourseDto, String>{

}
