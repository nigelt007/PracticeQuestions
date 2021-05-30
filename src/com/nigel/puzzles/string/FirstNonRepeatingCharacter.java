package com.nigel.puzzles.string;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		System.out.println(firstNonRepeating("GeeksforAGeeks"));

	}

	private static char firstNonRepeating(String word) {
		int[] charas = new int[126];

		for (int i = 0; i < word.length(); i++) {
			charas[word.charAt(i)]++;
		}

		for (int i = 0; i < word.length(); i++) {
			if (charas[word.charAt(i)] == 1) {
				return word.charAt(i);
			}
		}
		return (char) -1;

	}

}
