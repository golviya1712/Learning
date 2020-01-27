package com.jd.problem.statement;

import java.util.ArrayList;
import java.util.List;

public class WaterTank {
	public static void main(String arg[]) {

		int[] number = new int[] { 10, 0, 10, 0, 3, 5 };
//		int[] number = new int[] { 10, 0, 10, 10, 0, 0, 5 };
		int total = 0;
		List<Integer> count = new ArrayList<>();
		for (int j = 0; j <= number.length; j++) {
			if (number.length - 1 < j + 1 || number.length - 1 < j + 2) {
				continue;
			}
			int middle = number[j + 1];
			int next = number[j + 2];
			if (next < number[j]) {
				if (middle != 0) {
					int ans = next - middle;
					total = total + ans;
					System.out.println("If first :" + total);
					if (total > 0) {
						count.add(total);
					}
					total = 0;
				} else {
					System.out.println("If second:" + next);
					count.add(next);
					total = 0;
				}

			} else {
				if (middle != 0) {
					int ans = number[j] - middle;
					total = total + ans;
					System.out.println("Else first:" + total);
					if (total > 0) {
						count.add(total);
					}
					total = 0;
				} else {
					System.out.println("Else second:" + number[j]);
					count.add(number[j]);
				}

			}
		}
		if (total < 0) {
			System.out.println(0);
		} else {
			System.out.println(count.stream().mapToInt(sum -> sum.intValue()).sum());
		}

	}

}
