package com.nigel.puzzles.nodes;

public class CodilityTestCoders {

	public static void main(String[] args) {
		solution(10);
	}

	public static void solution(int N) {
		// write your code in Java SE 8
		for (int i = 1; i <= N; i++) {
			if (i % 2 == 0) {
				System.out.print("Codility");
			}
			if (i % 3 == 0) {
				System.out.print("Test");
			}
			if (i % 5 == 0) {
				System.out.print("Coders");
			}
			if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
