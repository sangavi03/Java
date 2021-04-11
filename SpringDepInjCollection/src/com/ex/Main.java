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
		System.out.println(rx.getStudentId()+ " "+rx.getStudentName());
		//Map m=rx.getCourses
		//Set se=s.entrySet();
		Set s=rx.getCourses();
		Iterator i =s.iterator();
		while(i.hasNext()) {
			//Map.Entry me=(Map.Entry)i.next();
			//System.out.println(me.getKey()+" "+me.getValue());
			System.out.println(i.next());
		}
	}

}
