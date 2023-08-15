package com.setterinjection.MyFirstMaven;
//import java.util.*;


public class Order {
	
	private String productid;
	private String productname;
	
	private Customer customer;
	
	public String getProductId()
	{
		return productid;
	}
	public String getProductName()
	{
		return productname;
	}
	/*
	public Date getOrderDate()
	{
		return orderdate;
	}*/
	public Customer getCustomer()
	{
		return customer;
	}
	
	public void setProductId(String productid)
	{
		this.productid=productid;
	}
	public void setProductName(String productname)
	{
		this.productname=productname;
	}
	/*
	public void setOrderDate(Date orderdate)
	{
		this.orderdate=orderdate;
	}*/
	public void setCustomer(Customer customer)
	{
		this.customer=customer;
	}
	
	

}
