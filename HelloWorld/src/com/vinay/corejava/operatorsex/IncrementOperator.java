package com.vinay.corejava.operatorsex;

public class IncrementOperator {
	public static void main(String[] args) {
		byte b = 5;
		b = (byte) (b + 1);
		b++;//internal type casting done by default (type of b)(b+1) for increment/decrement	
		System.out.println(b);
		byte a=10;
//		byte c = a+b; //possible loss of precision max(int,type of a,type of b).
	}
}
