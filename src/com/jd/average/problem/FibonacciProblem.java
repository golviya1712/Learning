package com.jd.average.problem;

import java.util.Scanner;

public class FibonacciProblem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter a number:");
		int i = scanner.nextInt();
		int start = 1;
		int next = 1;
		int ans;
		System.out.print(start + ",");
		System.out.print(next + ",");
		for (int j = 1; j <= i; j++) {
			ans = start + next;
			System.out.print(ans + ",");
			start = next;
			next = ans;
		}
	}
}
