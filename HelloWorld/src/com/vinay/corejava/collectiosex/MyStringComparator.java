package com.vinay.corejava.collectiosex;

import java.util.Comparator;

public class MyStringComparator implements Comparator{
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = (String) o2;
//		return s1.compareTo(s2);//same sort order
//		return -s1.compareTo(s2);//reverse sort order
		return s2.compareTo(s1);//reverse sort order
		
	}
}
