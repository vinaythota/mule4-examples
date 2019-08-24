package com.test;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryComponent {
	
	private static List<String> values  = new ArrayList<String>();
	
	public static void fillMemory() {
	
		for(int i=1; i >= 1 ; i++ ) {
			values.add("Value" + i);
		}
	}

}
