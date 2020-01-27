package com.jd.interview.practical;

import java.util.Scanner;

public class VariableSwapping {

	public void firstMethod(Integer x, Integer y) {
		System.out.println("Before");
		System.out.println(" X :" + x + " \n Y :" + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After");
		System.out.println(" X :" + x + " \n Y :" + y);
	}

	public void SecondMethod(Integer x, Integer y) {
		Integer temp;
		System.out.println("Before");
		System.out.println(" X :" + x + " \n Y :" + y);
		temp = x;
		x = y;
		y = temp;
		System.out.println("After");
		System.out.println(" X :" + x + " \n Y :" + y);
	}

	public static void main(String arg[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number of X: ");
		Integer x = scanner.nextInt();
		System.out.print("Enter Number of Y: ");
		Integer y = scanner.nextInt();
		VariableSwapping variableSwapping = new VariableSwapping();
		variableSwapping.firstMethod(x, y);
		variableSwapping.SecondMethod(x, y);
	}
}
