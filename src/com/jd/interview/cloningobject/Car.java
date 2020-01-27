package com.jd.interview.cloningobject;

/**
 * Note: This is copy of object in java
 * 
 * 1) Shallow copy object - Simple assign to one object refe. to other refe.
 * (There is one object but overrite old value) 2) Deep Copy : Create new object
 * and assign to all value using old object. (There is two object in Heap
 * Memory) 3) Clone Copy: This is combine (Shallow or Deep Copy)
 * 
 * @author JD
 *
 */
public class Car {

	public static void main(String[] args) throws CloneNotSupportedException {
		shallowCopy();
		deepCopy();
		cloneCopy();
	}

	public static void shallowCopy() {
		System.out.println("Shallow Copy");
		Suzuki suzuki = new Suzuki();
		suzuki.i = 5;
		suzuki.j = 8;
		Suzuki suzuki2 = suzuki;
		System.out.println(suzuki);
		suzuki2.i = 10;
		System.out.println(suzuki2);
		System.out.println(suzuki);
	}

	public static void deepCopy() {
		System.out.println("Deep Copy");
		Suzuki suzuki = new Suzuki();
		suzuki.i = 5;
		suzuki.j = 8;
		Suzuki suzuki2 = new Suzuki();
		suzuki2.i = suzuki.i;
		suzuki2.j = suzuki.j;
		suzuki2.i = 10;
		System.out.println(suzuki2);
		System.out.println(suzuki);
	}

	public static void cloneCopy() throws CloneNotSupportedException {
		System.out.println("Clone Copy");
		Suzuki suzuki = new Suzuki();
		suzuki.i = 5;
		suzuki.j = 8;
		Suzuki suzuki2 = (Suzuki) suzuki.clone();
		suzuki2.i = 10;
		System.out.println(suzuki);
		System.out.println(suzuki2);
	}
}

class Suzuki implements Cloneable {
	int i;
	int j;

	@Override
	public String toString() {
		return "Suzuki [i=" + i + ", j=" + j + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}