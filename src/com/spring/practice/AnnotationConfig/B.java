package com.spring.practice.AnnotationConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("b-obj")
public class B implements ABC {
	
	private int B;
	C C;
	private String D;

	@Value("${D.D}")
	public void setD(String d) {
		this.D = d;
	}
	
	@Value("${B.B}")
	public void setB(int b) {
		this.B = b;
	}
	
	@Autowired
	public void setC(C c) {
		this.C = c;
	}

	public void display() {
		System.out.println("Class B value is : " + B);
		C.display();
		System.out.println("Class D value is : " + D);
	}

}
