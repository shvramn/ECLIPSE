package com.spring.springhibernate.business;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.springhibernate.dao.StudentsDao;
import com.spring.springhibernate.entities.Students;

@Component
public class StudentsBusinessImpl implements StudentsBusiness {
	
	@Autowired
	private StudentsDao studentsDao;

	public void save(Students students) {
		studentsDao.save(students);
	}

	public void update(Students students) {
		studentsDao.update(students);
		
	}

	public void delete(Students students) {
		studentsDao.delete(students);
		
	}

	public Students findById(int row) {
		return null;
	}

	public List<Students> findAll() {
		return null;
	}

}
