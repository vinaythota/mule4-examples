package com.test;

import javax.annotation.PostConstruct;

public class Greeting {

	public String name = "UNKNOWN";
	
	public String greet(String prefix) {
		return prefix + "," + name;
	}
	
	public static String greet(Greeting greeting, String prefix) {
		return greeting.greet(prefix);
	}

	@PostConstruct
	public void initialize() {
		System.out.println("### Post Construct Called ###");
		//In Reality, we read the name (or) any other properties based on configuration of this bean
		this.name = "Vinay";
	}
}
