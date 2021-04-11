package com.ex;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		Resource res= new ClassPathResource("spring.xml");
		BeanFactory bean = new XmlBeanFactory(res);
//		Resource res1= new ClassPathResource("spring1.xml");
//		BeanFactory bean1 = new XmlBeanFactory(res1);
		
		Journey j = (Journey)bean.getBean("makemytrip");
		
		j.startJourney();
	}

}
