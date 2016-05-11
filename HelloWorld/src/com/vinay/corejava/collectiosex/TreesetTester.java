package com.vinay.corejava.collectiosex;

import java.util.TreeSet;

public class TreesetTester {
	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add(0);
		t.add(21);
		t.add(15);
		t.add(1);
		t.add(10);
		System.out.println(t);
		TreeSet t1 = new TreeSet(new MyComparator());
		t1.add(0);
		t1.add(21);
		t1.add(15);
		t1.add(1);
		t1.add(10);
		System.out.println(t1);
		TreeSet t2 = new TreeSet(new MyStringComparator());
		t2.add("abhi");
		t2.add("vinay");
		t2.add("pallavi");
		t2.add("ramu");
		t2.add("anil");
		System.out.println(t2);
	}
}
