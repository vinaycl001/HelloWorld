package com.vinay.corejava.collectiosex;

import java.util.Comparator;

public class MyComparator implements Comparator {


	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
	/*	if(i1<i2)
			return +1;
		else if(i1>i2)
			return -1;
		else
			return 0;*/
		return i1.compareTo(i2);//same sort order
//		return i2.compareTo(i1);//reverse order
//		return -i1.compareTo(i2);//reverse order
//		return -i2.compareTo(i1);//reverse of reverse order
//		return 1;//insertion order
//		return -1;//reverse insertion order
//		return 0;//only 1st element added
		
	}

}
