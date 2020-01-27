package com.jd.interview.practical;

import java.util.Scanner;

public class StringReverse {

	public void firstMethod(String string) {
		System.out.println();
		char chars[] = string.toCharArray();
		for (int i = chars.length - 1; i >= 0; i--) {
			System.out.print(chars[i]);
		}
		System.out.println();
	}

	public void secondMethod(String string) {
		System.out.println();
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(string);
		System.out.println(stringBuilder.reverse());
		System.out.println();
	}

	public void ThirdMethod() {
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String ");
		String str = scanner.nextLine();
		String string[] = str.split("");
		for (int i = string.length - 1; i >= 0; i--) {
			System.out.print(string[i]);
		}
		System.out.println();
	}

	public static void main(String arg[]) {
		StringReverse stringReverse = new StringReverse();
		String passString = "Automatic";
		System.out.println("Original String :" + passString);
		stringReverse.firstMethod(passString);
		stringReverse.secondMethod(passString);
		stringReverse.ThirdMethod();
	}
}
