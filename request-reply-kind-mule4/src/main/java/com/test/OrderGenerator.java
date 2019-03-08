package com.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Random;

public class OrderGenerator {
	
	public static void main(String[] args) throws IOException {
		
		int numOfRecords = 100;
		String fileName = "orders.txt";
		
		if(args.length != 0) {
			numOfRecords = Integer.parseInt(args[0]);
		}
		if(args.length > 1) {
			fileName = args[1];
		}
		
		try(Writer writer = new BufferedWriter(
				new FileWriter("src/main/resources/" + fileName)); )
		{
			StringBuilder record = new StringBuilder();
			Random random = new Random();
			for(int i=1; i <= numOfRecords ; i++) {
				record.append("Order");
				record.append(i);
				record.append(",");
				record.append(random.nextInt(1000));
				writer.write(record.toString());
				
				record.replace(0, record.length()-1, "");
				record.append("\n");
			}
			
			writer.flush();
		}finally {
			System.out.println("Generataion of records completed successfully");
		}
	}

}
