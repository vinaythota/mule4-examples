package com.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Random;

public class PayloadGenerator {
	
	public static void main(String[] args) throws IOException {
		
		//generateXMLPayload("orders.xml", 2000000);
		//generateXMLPayload("orders.xml", 5);
		generateCSVPayload("orders-1000.csv", 1000);
		
	}
	
	private static void generateCSVPayload(String fileName, int noOfRecords) throws IOException {
		
		System.out.println("Started Preparing CSV Payload");
		
		try (Writer writer = new BufferedWriter(new FileWriter(new File(fileName)));) {

			Random r1 = new Random();
			writer.write("ID" + "," + "VALUE" + "\n");
			for (int i = 1; i <= noOfRecords; i++) {
				writer.write("ORD:" + i + "," + r1.nextInt(10000) + "\n");
			}
			writer.flush();
		}
		
		System.out.println("Completed Preparing CSV Payload");
	}
	
	private static void generateXMLPayload(String fileName, int noOfRecords) throws IOException {
		
		System.out.println("## Started Preparing XML Payload");
		
		String orderTmp = "	<order><value></order>\n";
		try (Writer writer = new BufferedWriter(new FileWriter(new File(fileName)));) {

			Random r1 = new Random();
			writer.write("<orders>\n");
			for (int i = 1; i <= noOfRecords; i++) {
				writer.write(orderTmp.replace("<value>", String.valueOf(i)));
			}
			writer.write("</orders>");
			writer.flush();
		}
		
		System.out.println("## Completed Preparing XML Payload");
	}

}
