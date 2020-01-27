package com.jd.average.problem;

public class IntegerDigitSum {
	public static void main(String[] args) {

		int i = 3456;
		int sum = 0;
		for (int j = 0; j < i; j++) {
			int ans = i % 10;
			sum = sum + ans;
			i = i / 10;
			if (i < 10) {
				sum = sum + i;
				break;
			}
		}

	}

}
