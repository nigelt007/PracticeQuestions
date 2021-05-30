package com.nigel.puzzles.string;

public class DuplicateCharFromString {

	public static void main(String[] args) {
		duplicateChar(null);
		duplicateChar("Java");
		duplicateChar("Pappaya");
		duplicateChar("Mississippi");
		duplicateChar("");

	}

	private static void duplicateChar(String name) {
		int[] chars = new int[126];

		if (name != null) {
			for (int i = 0; i < name.length(); i++) {
				name.charAt(i);
				chars[name.charAt(i)]++; // chars[name.charAt(i)]= chars[name.charAt(i)] + 1 ;
				if (chars[name.charAt(i)] == 2) {
					System.out.print(name.charAt(i) + " ");
				}
			}
			System.out.println();
		}
	}

}
