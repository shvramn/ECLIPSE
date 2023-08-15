package com.setterinjection.MyFirstMaven;
//for lists
//import java.util.List;

//for sets
//import java.util.Set;

//for map
import java.util.Map;

public class Customer {
	private String name;
	private String contact;
	//for list
	//private List<String> address;
	
	//for sets
    //private Set<String> address;
	
	//for maps
	private Map<String,String> address;
    
    
	public String getName()
	{
		return name;
	}
	public String getContact()
	{
		return contact;
	}
	//for list
	/*public List<String> getAddress()
	{
		return address;
	}*/
	
	//for set
	/*public Set<String> getAddress()
	{
		return address;
	}
	*/
	
	//for maps
	public Map<String,String> getAddress() {
		return address;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setContact(String contact)
	{
		this.contact=contact;
	}
	
	
	
	//for list
	/*public void setAddress(List<String> address)
	{
		this.address = address;
	}*/
	
	//for set
	/*public void setAddress(Set<String> address)
	{
		this.address= address;
	}
	*/
	
	//for maps
	public void setAddress(Map<String,String> address) {
		this.address = address;
	}
	 
	

}
