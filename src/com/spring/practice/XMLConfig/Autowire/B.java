package com.spring.practice.XMLConfig.Autowire;

public class B implements ABC {
	
	private int B;
	C C;
	private String D;

	public B(String d) {
		this.D = d;
	}

	public void setB(int b) {
		this.B = b;
	}
	
	public void setC(C c) {
		this.C = c;
	}

	public void display() {
		System.out.println("Class B value is : " + B);
		C.display();
		System.out.println("Class D value is : " + D);
	}

}
