package com.myspr.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Student {
	private int rollNO;
	private String name;
	
	private Address address;
	
	
	public Student(int rollNO, String name, Address address) {
		super();
		this.rollNO = rollNO;
		this.name = name;
		this.address = address;
	}
	
	public Address getAddress() {
		return address;
	}
@Qualifier("address2")
@Autowired
@Required
	public void setAddress(Address address) {
		this.address = address;
	}


	public int getRollNO() {
		return rollNO;
	}
	public void setRollNO(int rollNO) {
		this.rollNO = rollNO;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	//c1
	public Student(String name, int rollNO) {
		super();
		this.rollNO = rollNO;
		this.name = name;
		System.out.println("String name,int rollNo");
	}
	
	//c2
	public Student(int rollNO, String name) {
		super();
		this.rollNO = rollNO;
		this.name = name;
		System.out.println("int rollNo, String name,");
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [rollNO=" + rollNO + ", name=" + name + ", address=" + address + "]";
	}
	
	}
	


