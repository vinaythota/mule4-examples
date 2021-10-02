package com.test;

import com.test.internal.CalculatorUtil;

public class Calculator {

	public static int add(int a, int b) {
		return a+b;
	}
	
	public static int multiply(int a, int b) {
		return CalculatorUtil.multiply(a, b);
	}
}
