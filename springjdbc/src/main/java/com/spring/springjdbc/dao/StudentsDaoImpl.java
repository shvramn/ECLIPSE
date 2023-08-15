package com.spring.springjdbc.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.spring.springjdbc.dao.rowmappers.StudentsRowMapper;
import com.spring.springjdbc.dto.Students;


@Component("StudentsBusiness")
public class StudentsDaoImpl implements StudentsDao  {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void insertStudents(Students students) {
//code to insert students object into database
		
		String sql="insert into students values(?,?,?)"; 
		System.out.println("Query:" +sql);
		jdbcTemplate.update(sql,students.getRoll(),students.getName(),students.getCity()); 
	}

	

	public List<Students> findAllStudents() {
		
		StudentsRowMapper rowMapper= new StudentsRowMapper();
		List<Students> students = jdbcTemplate.query("select * from students", rowMapper);
		
		return students;
	}

	public Students getStudentsByName(String name) {
		
		//code to return a student name from students table by calling his name
		return null;
	}

}
