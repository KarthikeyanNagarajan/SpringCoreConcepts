package com.spring.practice.AnnotationXML.Autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.practice.AnnotationXML.Autowire.A;

public class main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("AnnotationXMLAutowire.xml");
		A obj_a = context.getBean("a-obj" , A.class);
		obj_a.display();
	}

}
