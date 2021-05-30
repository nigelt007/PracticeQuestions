package com.nigel.puzzles.line;

public class MaximumHarvest {

	public int solution(int[] n) {
		// write your code in Java 8

		int size = n.length;

		int oddSum = 0;
		for (int i = 0; i < size; i += 2) {
			oddSum += n[i];
		}
		int evenSum = 0;
		for (int i = 1; i < size; i += 2) {
			evenSum += n[i];
		}

		if (oddSum > evenSum) {
			return oddSum;
		}
		return evenSum;
	}

	public static void main(String[] args) {
		MaximumHarvest mh = new MaximumHarvest();
		System.out.println(mh.solution(new int[] { 1, 2, 9, 1, 1, 10, 1, 10 }));
	}

}
