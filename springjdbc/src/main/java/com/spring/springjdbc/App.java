package com.spring.springjdbc;

import org.springframework.context.ApplicationContext; 

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.springjdbc.business.StudentsBusiness;
import com.spring.springjdbc.business.StudentsBusinessImpl;
import com.spring.springjdbc.dto.Students;


public class App 
{
    public static void main( String[] args )
    {
    	
    	//creating spring container
ApplicationContext context = new ClassPathXmlApplicationContext("configmetadata.xml");
    	
    	
          StudentsBusiness studentsBusiness = (StudentsBusinessImpl)context.getBean("studentsBusiness");
          
          //Students stu = new Students(17,"shv","naidu");
          //studentsBusiness.insertStudents(stu);
          
          
          
          
          studentsBusiness.printStudentsHikes();
          
          
          
          
    	
    }
}
