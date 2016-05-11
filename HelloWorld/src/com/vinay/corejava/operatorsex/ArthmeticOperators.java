package com.vinay.corejava.operatorsex;

public class ArthmeticOperators {
	public static void main(String[] args) {
		// &,|,^ applicable for both boolean & integral types
		// ~ applicable for only integral types but not for boolean
		// ! applicable for only boolean & not integral types

		// ArithmeticException is RTE
		// comes in integer not float and only when we use / or %
		// System.out.println(10/0);
		// System.out.println(0/0);
		System.out.println(10 / 0.0);
		System.out.println(-10 / 0.0);
		System.out.println(0.0 / 0);
		System.out.println(-0.0 / 0);

		System.out.println(10 < Float.NaN);
		System.out.println(10 <= Float.NaN);
		System.out.println(10 > Float.NaN);
		System.out.println(10 >= Float.NaN);
		System.out.println(10 == Float.NaN);
		System.out.println(Float.NaN == Float.NaN);
		System.out.println(10 != Float.NaN);
		System.out.println(Float.NaN != Float.NaN);

		System.out.println('a' + 'b');
		System.out.println('a' + 0.62);

		System.out.println(!false);
	}
}
