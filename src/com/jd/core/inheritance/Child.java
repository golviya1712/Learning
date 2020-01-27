package com.jd.core.inheritance;

public class Child extends Parent implements Properties {
	public void access(String str) {
		System.out.println("Child Access");
	}

	public static void main(String arg[]) {
		GrandParent child = new Child();
		child.access();
	}

	@Override
	public void totalProperties() {
		// TODO Auto-generated method stub

	}
}

/*
 * 
 * Note 1: Whenever call method overriding so find that method with same
 * parameter in existing class if found then print but not present so call
 * parent method.
 * 
 * Note 3: In inheritance method find like leveling if extended class
 * 
 * Note 2: You cannot create Parent object with instance of child class.
 * 
 * Note 4: No nedd to implement method of interface when that method implemented
 * in parent class But you can override method from interface
 * 
 * 
 * 
 */