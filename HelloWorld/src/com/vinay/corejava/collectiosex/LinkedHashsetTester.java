package com.vinay.corejava.collectiosex;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashsetTester {
	public static void main(String[] args) {
		LinkedHashSet hs = new LinkedHashSet();
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
