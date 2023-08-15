package com.spring.springjdbc.dao;

import java.util.List;

import com.spring.springjdbc.dto.Students;

public interface StudentsDao {
	void insertStudents(Students students);
	List<Students>findAllStudents();
	Students getStudentsByName(String name);
	
	
	
	

}
