package com.nigel.puzzles;

public class AmEx1 {
	public static void main(String[] args) {

		System.out.println(solution(new int[] { 1, 4, -1, 3, 2 }));

	}

	public static int solution(int[] A) {
		// write your code in Java SE 8
		int size = 1;
		int i = 0;
		while (A[i] != -1) {
			size++;
			i = A[i];
		}

		return size;
	}

}
