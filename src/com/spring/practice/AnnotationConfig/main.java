package com.spring.practice.AnnotationConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.practice.AnnotationConfig.A;

public class main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		A obj_a = context.getBean("a-obj" , A.class);
		obj_a.display();
		context.close();
	}

}
