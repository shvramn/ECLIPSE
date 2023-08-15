 package com.spring.springhibernate.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.spring.springhibernate.entities.Students;

@Component
public class StudentsDaoImpl implements StudentsDao {
	
	@Autowired
	 private HibernateTemplate hibernateTemplate;

	public void save(Students students) {
		hibernateTemplate.save(students);
	}

	public void update(Students students) {
		hibernateTemplate.update(students);
	}

	public void delete(Students students) {
		hibernateTemplate.delete(students);
	}

	public Students findById(int row) {
		Students stu=hibernateTemplate.get(Students.class,row);
		return stu;
	}

	public List<Students> findAll() {
		return hibernateTemplate.loadAll(Students.class);
	}
	 

}
