package com.spring.springjdbc.business;

import java.util.List;

import org.springframework.stereotype.Component;

import com.spring.springjdbc.dao.StudentsDao;
import com.spring.springjdbc.dto.Students;

@Component
public class StudentsBusinessImpl implements StudentsBusiness {
	
	//creating a variable of Students dao
   
    
	private StudentsDao studentsDao;
	
	

	public StudentsDao getStudentsDao() {
		return studentsDao;
	}



	public void setStudentsDao(StudentsDao studentsDao) {
		this.studentsDao = studentsDao;
	}



	public void printStudentsHikes() {
		//ask dao for students data
		List<Students> student = studentsDao.findAllStudents();
		
		//chech each student and print hike 
		//here we write our business logic
		
		try {
			if(student!=null)
			{
			for(Students students : student)
			{
				if(students.getRoll()>15)
				{
					System.out.println(students.getName()+ " ");
				}
				else if(students.getRoll()>10)
				{
					System.out.println(students.getName()+ " ");	
				}
				else if(students.getRoll()>5)
				{
					System.out.println(students.getName()+ " ");
				}
				else
				{
					System.out.println(students.getName());
				}
			}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}



	public void insertStudents(Students students) {
		studentsDao.insertStudents(students);
		
	}

}
