package com.nigel.puzzles;

public class LongEven {

	public static String longestEvenWord(String sentence) {
		// Write your code here
		String[] words = sentence.split(" ");
		int longestIndex = -1;
		int longestLen = 0;
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			int len = word.length();
			if (len % 2 == 0 && len > longestLen) {
				longestLen = len;
				longestIndex = i;
			}
		}
		if (longestIndex == -1) {
			return "00";
		}

		return words[longestIndex];

	}

	public static void main(String[] args) {

	}

}
