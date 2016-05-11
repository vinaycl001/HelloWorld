package com.vinay.corejava.collectiosex;

import java.util.HashSet;

public class HashsetTester {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("B");
		hs.add("C");
		hs.add(10);
		hs.add("D");
		hs.add(null);
		hs.add("Z");
		
		System.out.println(hs.add(null));
		System.out.println(hs.add("Z"));
		System.out.println(hs);
		HashSet hs1 = new HashSet(100);
		HashSet hs2 = new HashSet(15, 90);
		System.out.println(hs.toString());
		HashSet hs3 = new HashSet(hs);
	}

}
