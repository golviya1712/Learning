package com.jd.interview.hashcodeequal;

/**
 * String class not compare references it will compare content and string class
 * overriden equal method.
 * 
 * @author JD
 *
 */
public class StringClassEqual {
	public static void main(String[] args) {
		String string1 = new String("Java");
		String string2 = new String("Java");
		System.out.println(string1.equals(string2));

	}
}
