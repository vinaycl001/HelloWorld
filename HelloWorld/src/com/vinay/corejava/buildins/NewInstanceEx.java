package com.vinay.corejava.buildins;

public class NewInstanceEx {
	public static void main(String[] args) {
		// mainly used when we dont know the class name before.
		// At runtime we come to know type(class name) of object to create
		//ex-servlets created by webcontainer.
		try {
			Class<?> c = Class.forName(args[0]);
			Object obj = Class.forName(args[0]).newInstance();
			System.out.println("Oject created of class of class:"+c.getClass().getName());
			System.out.println("Oject created of class:"+obj.getClass().getName());
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
