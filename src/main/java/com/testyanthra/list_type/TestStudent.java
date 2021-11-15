package com.testyanthra.list_type;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/testyanthra/list_type/config.xml");
	Student std= (Student)context.getBean("student");
	System.out.println(std);
	}

}
