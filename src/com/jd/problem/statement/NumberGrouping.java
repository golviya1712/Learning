package com.jd.problem.statement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class NumberGrouping {

	public static void main(String arg[]) {
		List<Integer> number = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 0);
		Map<String, List<Integer>> result = new HashMap<String, List<Integer>>();
		for (int i = 0; i < number.size(); i++) {
			List<Integer> tempList = new ArrayList<>();
			for (int j = 0; j < number.size(); j++) {
				if (number.get(i) + number.get(j) == 10) {
					tempList.add(number.get(i));
					tempList.add(number.get(j));
					result.put("Pair" + Math.random(), tempList);
				} else {
					List<Integer> thirdPair = new ArrayList<>();
					for (int k = 0; k < number.size(); k++) {
						if (number.get(i) + number.get(j)+number.get(k) == 10) {
							thirdPair.add(number.get(i));
							thirdPair.add(number.get(j));
							thirdPair.add(number.get(k));
							result.put("Pair" + Math.random(), thirdPair);
						}
					}
				}
			}
		}
		for (Entry<String, List<Integer>> i : result.entrySet()) {
			i.getValue().stream().forEach(System.out::print);
			System.out.println();
		}
	}
}
