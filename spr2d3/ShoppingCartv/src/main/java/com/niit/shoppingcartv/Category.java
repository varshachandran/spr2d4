package com.niit.shoppingcartv;

import org.springframework.stereotype.Component;

@Component(value="catObject")

public class Category {
	private String id;
	private String name;
	private int salary;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
