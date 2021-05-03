package com.ex;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainLogic {

	public static void main(String[] args) {
		Resource res= new ClassPathResource("spring.xml");
		BeanFactory bean = new XmlBeanFactory(res);
		HdfcBank hb =(HdfcBank)bean.getBean("pfb");
		hb.withdraw();
		hb.deposit();
	}

}
