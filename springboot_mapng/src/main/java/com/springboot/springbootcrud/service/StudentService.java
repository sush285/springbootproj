package com.springboot.springbootcrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.springbootcrud.dao.StudentDao;
import com.springboot.springbootcrud.dto.StudentDto;

@Service
public class StudentService {

	@Autowired
	StudentDao sdao;
	
	public String insertStudent(StudentDto dto) {
		return sdao.insertStudent(dto);
	}
	
	public StudentDto fetchStudentById(int id) {
		Optional<StudentDto> od=sdao.fetchStudentById(id);
		if(od.isPresent()) {
			return od.get();
		}
		else
			return null;
	}
	
	public List<StudentDto> fetchAllStudent() {
		List<StudentDto> list=sdao.fetchAllStudent();
		if(list.isEmpty()) {
			return null;
		}
		else
			return list;
	}
}
