package com.progress;

import org.apache.log4j.Logger;

public class Calculator {
	
	Logger logger = Logger.getLogger(Calculator.class);

	
	public long addition(long a, long b) {
		logger.info("add");
		System.out.println("addition");
		return a+b;
	}
	
	public long substraction(long a, long b) {
		return a-b;
	}
	
	public long multiplication(long a, long b) {
		return a*b;
	}
	
	public long division(long a, long b) {
		return a/b;
	}

}
