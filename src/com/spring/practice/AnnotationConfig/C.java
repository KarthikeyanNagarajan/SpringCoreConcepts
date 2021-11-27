package com.spring.practice.AnnotationConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("c-obj")
public class C implements ABC {

	private String C;
	
	@Value("${C.C}")
	public void setC(String c) {
		this.C = c;
	}
	public void display() {
		System.out.println("Class C value is : " + C);
	}

}
