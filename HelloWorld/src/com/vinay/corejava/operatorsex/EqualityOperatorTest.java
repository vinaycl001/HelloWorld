package com.vinay.corejava.operatorsex;

public class EqualityOperatorTest {

	public static void main(String[] args) {
		System.out.println(10==20);
		System.out.println('a'=='b');
		System.out.println('a'== 97.0);
		System.out.println(false==false);
		
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		Thread t3 = t1;
		String s = "test";
		Object o = new Object();
		System.out.println(t1==t2);
		System.out.println(t1==t3);
		System.out.println(t1==o);
		System.out.println(o==s);
//		System.out.println(s==t1);// some relation should be there b/w objects.

	}

}
