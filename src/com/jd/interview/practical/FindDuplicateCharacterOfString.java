package com.jd.interview.practical;

public class FindDuplicateCharacterOfString {

	public static void main(String[] args) {
		String str = "Skkararrt";
		int count = 0;
		char character[] = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (character[i] == character[j]) {
					System.out.println(character[j]);
					count++;
					break;
				}
			}
		}
	}

}
