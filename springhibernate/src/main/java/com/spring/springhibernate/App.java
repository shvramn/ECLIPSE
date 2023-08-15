package com.spring.springhibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.springhibernate.business.StudentsBusiness;
import com.spring.springhibernate.business.StudentsBusinessImpl;
import com.spring.springhibernate.entities.Students;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("configmetadata.xml");
    	
    	
        StudentsBusiness studentsBusiness = (StudentsBusinessImpl)context.getBean("studentsBusiness");
        
    
   Students students= new Students();
   students.setCity("warangal");
   students.setName("ramarao");
   students.setRow(24);
   
   studentsBusiness.save(students); 
    		
    	  
    }
}
