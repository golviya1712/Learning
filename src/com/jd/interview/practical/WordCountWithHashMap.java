package com.jd.interview.practical;

import java.util.HashMap;

public class WordCountWithHashMap {
	public static void main(String arg[]) {
		String sentence = "The same same program can be used to count the number of characters in a string program";
		HashMap<String, Integer> hashMap = new HashMap<>();
		String array[] = sentence.split(" ");
		for (int i = 0; i < array.length; i++) {
			if (hashMap.containsKey(array[i])) {
				Integer count = hashMap.get(array[i]);
				hashMap.put(array[i], count + 1);
			} else {
				hashMap.put(array[i], 1);
			}
		}
		System.out.println(hashMap);

	}
}
