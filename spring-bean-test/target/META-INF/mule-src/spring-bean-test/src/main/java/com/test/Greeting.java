package com.test;

import javax.annotation.PostConstruct;

public class Greeting {

	public String name;
	
	public Greeting(String name) {
		this.name = name;
	}
	
	public String sayHello() {
		return "Hello," + name;
	}
	
	public String sayHello(String prefix) {
		return prefix + "," + name;
	}
	
	public static String getValue(Greeting greeting, String prefix) {
		
		return greeting.sayHello(prefix);
	}
	
	public static String testValue(String prefix) {
		
		return prefix + ", Tested";
	}
	
	@PostConstruct
	public void initialize() {
		this.name = "Vinay";
		System.out.println("### Post Construct Called ###");
	}
}
