package com.spring.springhibernate.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Students {
	
	@Id
	private int row;
	
	@Column(name="name")
	private String name;
	private String city;
	
	public Students()
	{
		
	}

	public Students(int row, String name, String city) {
		super();
		this.row = row;
		this.name = name;
		this.city = city;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	

}
