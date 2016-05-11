package com.vinay.corejava.jdkspec;

public class VarArg {
	public static void main(String[] args) {
		System.out.println(sum(0,1));
		System.out.println(sumnos(0,1,3));
		sum(0);
	}

	private static int sum(int...x) {
//		private static int sum(int   ...    x) {valid
//			private static int sum(int...x) {valid
//		private static int sum(String s, int... x) {valid
		int total=0;
		for (int i : x) {
			total = total + i;
		}
		return total;
	}
	
	private static int sumnos(int x, int... y) {
//		private static int sumnos(int... x, int y) { invalid
		int total=x;
		for (int i : y) {
			total = total + i;
		}
		return total;

	}
	private static void sum(int x) {
		System.out.println("General method");
	}
}
