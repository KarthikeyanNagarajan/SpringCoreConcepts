package com.spring.practice.AnnotationXML.Autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class A implements ABC {

	private int A;
	B B;	
		
	@Autowired
	public void setB(B b) {
		this.B = b;
	}
	
	@Value("${A.A}")
	public void setA(int a) {
		this.A = a;
	}
	public void display() {		
		System.out.println("Class A value is : " + A);
		B.display();		
	}

}
