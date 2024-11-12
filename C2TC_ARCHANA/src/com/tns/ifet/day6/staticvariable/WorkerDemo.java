package com.tns.ifet.day6.staticvariable;

public class WorkerDemo {

	public static void main(String[] args) {
		Worker e = new Worker("Shubh", 123);
		System.out.println(e);
		
		// Similarly, create the second object of the class and pass the two arguments.
		e = new Worker("Deep", 321);
		System.out.println(e);

	}

}
