package com.ex;

import java.util.Iterator;
import java.util.Set;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		Resource res= new ClassPathResource("spring.xml");
		BeanFactory bean = new XmlBeanFactory(res);		
		Student rx=(Student)bean.getBean("rahul");
		System.out.println(rx.getStudentId()+ " "+rx.getStudentName()+ " "+rx.getCourse().getCourseName()+" "+rx.getCourse().getCoursePrice());
		
	}

}
