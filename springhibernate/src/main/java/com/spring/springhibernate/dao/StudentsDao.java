package com.spring.springhibernate.dao;

import java.util.List;

import com.spring.springhibernate.entities.Students;

public interface StudentsDao {
	
	public void save(Students students);
	public void update(Students students);
	public void delete(Students students);
	public Students findById(int row);
	public List<Students> findAll();

}
