package com.vinay.corejava.operatorsex;

public class StringConcatTest {
	public static void main(String[] args) {
		String s = "vinay";
		int a = 10, b = 20, c = 30;
		// java doesn't support operator overloading but only + is overloaded
		System.out.println("ab" + "cd");
		System.out.println(a + b);
		System.out.println(s + a + b + c);
		System.out.println(a + b + c + s);
		System.out.println(a + b + s + c);
		System.out.println(a + s + b + c);
		// a = s+a+b;
		s = s + a + b;
		// b = s+b+c;
		b = a + b + c;
	}
}
