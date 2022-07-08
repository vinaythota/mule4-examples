package com.vinay;

import com.vinay.internal.Add;

public class Calculator {

	public long runOperation(long a, long b, int type) {
		switch (type) {
		case 1:
			return Add.add(a, b);
		default:
			throw new IllegalArgumentException("Invalid Operation Type");
		}
	}
}
