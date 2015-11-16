package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
		Student student = (Student)applicationContext.getBean("student");
		
		System.out.println("Name : " + student.getName());
		System.out.println("Age : " + student.getAge());
		
		((AbstractApplicationContext)applicationContext).close();
	}

}
