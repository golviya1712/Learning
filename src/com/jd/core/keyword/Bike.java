package com.jd.core.keyword;

public class Bike {
	private static Bike b=new Bike();
	private Bike() {
		
	}
	public static Bike getInstance() {
		return b;
	}
}
