package com.spring.practice.XMLConfig;

public class A implements ABC {

	private int A;
	B B;	
		
	public void setB(B b) {
		this.B = b;
	}
	public void setA(int a) {
		this.A = a;
	}
	public void display() {		
		System.out.println("Class A value is : " + A);
		B.display();		
	}

}
