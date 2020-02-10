package com.epam.calculator;

public class subtraction extends addition {

	void sub(double a,double b) {
		if(a>b) {
			System.out.println("sub = :"+(a-b));
		} else {
			System.out.println("sub = :"+(b-a));
		}

	}

}
