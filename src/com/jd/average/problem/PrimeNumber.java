package com.jd.average.problem;

import java.util.Scanner;

/**
 * prime number which are not divide with any number expect itself.
 * 
 * Note: So first of all find square root of number that mean x value divide
 * with some range that why find sqaure root of number.
 * 
 * @author JD
 *
 */
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number for check prime or not :");
		int number = scanner.nextInt();
		if (isPrimeNumber(number)) {
			System.out.println(number + " is Prime Number");
		} else {
			System.out.println(number + " is not Prime Number");
		}

	}

	private static boolean isPrimeNumber(int number) {
		int sqrt = (int) Math.sqrt(number) + 1;
		for (int j = 2; j < sqrt; j++) {
			if (number % j == 0) {
				return false;
			}
		}
		return true;
	}
}
