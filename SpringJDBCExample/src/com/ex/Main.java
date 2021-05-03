package com.ex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); 
		Student x = (Student)context.getBean(Student.class);
		System.out.println(x.getStudentId()+" "+x.getStudentName()+" "+x.getMarks());
		}

}
