package com.setterinjection.MyFirstMaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
      //creating spring container
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/setterinjection/MyFirstMaven/configmetadata.xml");
    	
    	
    	/*
    	//getting customer object
    	Customer customer = (Customer)context.getBean("cus");
    	
    	System.out.println("Name:" + customer.getName());
    	System.out.println("Contact:" + customer.getContact());
    	System.out.println("Addresses:" + customer.getAddress());
    	*/
    	
    	//getting order object
    	Order order = (Order)context.getBean("ord");
    	System.out.println("Product id:"+order.getProductId());
    	System.out.println("Product name:"+order.getProductName());
    	System.out.println("Customer  :"+order.getCustomer().getName());
    	
    	
    	

    }
}
