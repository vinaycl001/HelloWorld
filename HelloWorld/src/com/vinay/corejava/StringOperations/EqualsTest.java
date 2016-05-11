package com.vinay.corejava.StringOperations;

public class EqualsTest {
	static String s4;
	public static void main(String[] args) {
		String s1 = new String("vinay");
		String s2 = new String("vinay");
		String s3 = null;
		System.out.println(s1==s2);//checks for reference
		System.out.println(s1.equals(s2));//checks for content
		System.out.println(s1==null);//always false for any object reference
		System.out.println(null==null);//always true
		System.out.println(s3==null);//not pointing to any object
		System.out.println(s4==null);//default value of instance variable is null
	}
}
