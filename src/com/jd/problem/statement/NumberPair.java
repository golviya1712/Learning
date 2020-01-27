package com.jd.problem.statement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class NumberPair {

	public static void main(String[] args) {
		Stream<Integer> digits = Stream.of(1,2,3,4,5,6,7,8,9,0);
		int matchedNum = 10;
		Map<Integer,List<Integer>> buckets = new HashMap<Integer, List<Integer>>();
		digits.forEach(digit -> {
			
			digits.forEach(innerDigit -> {
				
			});
		});
	}

}
