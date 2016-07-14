package com.niit.shoppingcartv;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingcartv");
		context.refresh();
		Product p= (Product)context.getBean("proObject");
		p.setId("101");
		p.setName("mobile");
		p.setPrice(10000);
		System.out.println(p.getId()+p.getName()+p.getPrice());
		
		System.out.println("product is created");
		Category c=(Category)context.getBean("catObject");
		c.setId("1234");
		c.setName("abc");
		c.setSalary(20000);
		
		System.out.println(c.getId()+c.getName()+c.getSalary());
		System.out.println("category is created");
	}

}
