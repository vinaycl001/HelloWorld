import java.util.ArrayList;
import java.util.Collection;

public class HelloWorld {
	static {
		System.out.println("static");
	}

	public HelloWorld() {
		System.out.println("inside constructor");
//		HelloWorld();
	}
	{
	    System.out.println("initialiser block");
	}

	public static void main(String[] a) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		HelloWorld();
		/*
		 * while (true){ System.out.println("Hello World!"); }
		 */
		Collection   c = new ArrayList ();
		HelloWorld hw = new HelloWorld();
		hw.HelloWorld();
		System.out.printf("d");

	}
	static {
		System.out.println("inside static");
	}
	public static void main(int w) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
	}

	private static void HelloWorld() {
		System.out.println("Method name same has class name");
	}

	public void draw(String s) {
		
	}

	public void draw(int i) {

	}

	public void draw(double f) {

	}

	public void draw(int i, double f) {

	}

	public void draw(double f,int i) {

	}
	
	static {
		System.out.println("inside 3");
	}
}
