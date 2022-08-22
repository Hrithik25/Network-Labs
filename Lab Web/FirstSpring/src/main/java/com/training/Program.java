package com.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("beans.xml");
		
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		System.out.println(obj.getMessage());
		
		Employee emp = (Employee) context.getBean("employee");
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		
		System.out.println(emp);
		
	}
}
