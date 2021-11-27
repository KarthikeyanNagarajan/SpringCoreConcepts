package com.spring.practice.XMLConfig.Autowire;

public class A implements ABC {

	private int A;
	B bb;	
		
	public void setBb(B b) {
		this.bb = b;
	}
	public void setA(int a) {
		this.A = a;
	}
	public void display() {		
		System.out.println("Class A value is : " + A);
		if(bb != null)
		{
			bb.display();
		}
		else
		{
			System.out.println("B is null");
		}
	}

}
