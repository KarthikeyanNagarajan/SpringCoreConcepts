package com.spring.practice.AnnotationXML.Autowire;

public class C implements ABC {

	private String C;
		
	public C(String c) {
		this.C = c;
	}
	public void display() {
		System.out.println("Class C value is : " + C);
	}

}
