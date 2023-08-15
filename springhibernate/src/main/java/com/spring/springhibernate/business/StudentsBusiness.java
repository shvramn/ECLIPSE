package com.spring.springhibernate.business;

import java.util.List;

import com.spring.springhibernate.entities.Students;

public interface StudentsBusiness {
	
	public void save(Students students);
	public void update(Students students);
	public void delete(Students students);
	public Students findById(int row);
	public List<Students> findAll();

}
