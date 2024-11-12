package com.tns.ifet.day6.staticvariable;

public class Worker {
	private String name;
	private int id;
	
	// Declare a static variable companyName with data type String and assign value
	// TNS which is common for all the objects.
	static String companyName = "TNS";

	// Declare a two-parameter constructor with parameters named n and i.
	Worker(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Worker [name=" + name + ", id=" + id + ", Company= "+companyName+"]";
	}
}
