package com.aspi.logic_program;

public class Count_vowels_consonent {

	public static void main(String[] args) {
		String str = "I am Harish aeiou";
		str.chars();
		str.toLowerCase();
		int vcount = 0, cCount = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vcount++;
			} else if (c >= 'a' && c <= 'z') {
				cCount++;
			}
		}
		System.out.println("vowels " + vcount);
		System.out.println("consonent " + cCount);

	}

}
