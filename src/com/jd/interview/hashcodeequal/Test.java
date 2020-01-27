package com.jd.interview.hashcodeequal;

/**
 * this class for hashcode and equal
 * 
 * Note : Hashcode not return object memory address. Actually generate a unique
 * number using memory address with calculate with random number.
 * 
 * Hashcode is native method. Native method meaning developed the method in
 * c,c++.
 * 
 * @author JD
 *
 */
public class Test {

	public static void main(String[] args) {
		Human jaydipObject = new Human(1001, "Jaydip");
		int jaydipObjectHashValue = jaydipObject.hashCode();
		System.out.println(jaydipObjectHashValue);
	}
}
