package com.nigel.puzzles;

public class TwoMainMethods {
	
	static {
		System.out.println("First Static block");
	}

	public static void main(String[] args) {
		
		System.out.println("Then the main method");

	}

	// Uncomment and it gives a duplicate method error.

	/*
	 * public static void main(String[] args) {
	 * 
	 * }
	 */

}
