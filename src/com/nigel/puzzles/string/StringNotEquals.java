package com.nigel.puzzles.string;

public class StringNotEquals {

	public static void main(String[] args) {
		String a = new String("ABC");
		String b = new String("ABC");
		String c = "ABC";

		if (a == b) {
			System.out.println("a == b");
		}
		if (b == c) {
			System.out.println("b == c");
		}
		if (a == c) {
			System.out.println("a == c");
		}

		System.out.println("none are true");
	}

}
