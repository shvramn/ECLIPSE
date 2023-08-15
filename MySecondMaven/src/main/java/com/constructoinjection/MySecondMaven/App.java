package com.constructoinjection.MySecondMaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/constructoinjection/MySecondMaven/configdata.xml");
        
        
        Customer customer = (Customer) context.getBean("customer");
        System.out.println("customer :" +customer.toString());
        
        Order order = (Order) context.getBean("order");
        System.out.println("Order : "+order.toString());
        
        
        
    }
}
