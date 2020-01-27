package com.jd.problem.statement;

public class FindBinaryGap {

	public static void main(String[] args) {
		String binaryNumber = Integer.toBinaryString(10);
		int j = 0;
		int k = 0;
		for (int i = 0; i < binaryNumber.length(); i++) {
			if (binaryNumber.charAt(i) == '1') {
				k++;
			}
			if (binaryNumber.charAt(i) == '0') {
				j++;
			}
		}
		System.out.print(j);
	}
}
