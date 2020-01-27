package com.jd.average.problem;

import java.util.Scanner;

public class StringPalindrom {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1 for check Integer palindrom \n" + "Enter 2 for check String palindrom");
		Integer number = scanner.nextInt();
		switch (number) {
		case 1:
			checkIntegerPalidrom(scanner);
			break;
		case 2:
			checkStringPalidrom(scanner);
			break;
		default:
			System.out.println("Invalid Number");
			break;
		}
	}

	private static void checkStringPalidrom(Scanner scanner) {
		System.out.println("Enter String :");
		String string = scanner.next();
		if (string.equals(reverseString(string))) {
			System.out.println(string + " is Palindrom");
		} else {
			System.out.println(string + " is not Palindrom");
		}
	}

	private static String reverseString(String string) {
		char[] chararray = string.toCharArray();
		String reverseString = "";
		for (int i = chararray.length - 1; i >= 0; i--) {
			reverseString = reverseString + Character.toString(chararray[i]);
		}
		return reverseString;
	}

	private static void checkIntegerPalidrom(Scanner scanner) {
		System.out.println("Enter Number :");
		Integer num = scanner.nextInt();
		if (num.toString().equals(reverseInteger(num))) {
			System.out.println(num + " is Palindrom");
		} else {
			System.out.println(num + " is not Palindrom");
		}

	}

	private static String reverseInteger(Integer num) {
		String reverse = "";
		for (int i = 0; i < num; i++) {
			int ans = num % 10;
			reverse = reverse + ans;
			num = num / 10;
			if (num < 10) {
				reverse = reverse + num;
				break;
			}
		}
		return reverse;
	}

}
