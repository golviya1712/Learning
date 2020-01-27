package com.jd.interview.practical;

import java.util.ArrayList;
import java.util.List;

public class SecondHighestNumber {
	public static void main(String[] args) {
		Integer[] number = new Integer[] { -10, -10, -10, -10, -10, -6255, -30, -50, -1000, -200, -630 };
		Integer max = Integer.MIN_VALUE;
		Integer secondMax = Integer.MIN_VALUE;
		List<Integer> sortNumber = new ArrayList<>();
		
		for (int i = 0; i < number.length; i++) {
			if (number[i] > max) {
				secondMax = max;
				max = number[i];
			} else if (number[i] > secondMax && number[i] != max) {
				secondMax = number[i];
			}
		}

//		Collections.sort(sortNumber);
		System.out.println(max);
		System.out.println(secondMax);
	}

}
