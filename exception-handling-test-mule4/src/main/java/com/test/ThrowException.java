package com.test;

public class ThrowException {
	
	public static void raiseException(String errorDesc) throws Exception{
		
		System.out.println("Invoked Static Method to raise Exception with Desc: " + errorDesc);
		
		throw new MyException("Invoked Static Method to raise Exception with Desc: " + errorDesc);
	}

	private static class MyException extends Exception {
		
		private static final long serialVersionUID = 1L;

		public MyException(String desc) {
			super(desc);
		}
	}

}
