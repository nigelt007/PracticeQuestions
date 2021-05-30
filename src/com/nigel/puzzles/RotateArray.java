package com.nigel.puzzles;

public class RotateArray {

	private int[] rotate(int[] arr) {
		int[] rArr = new int[arr.length];
		int temp = arr[arr.length - 1];
		for (int i = arr.length - 2; i == 0; i--) {
			temp = arr[i - 1];
			arr[i - 1] = arr[i];
		}

		return rArr;
	}

	public static void main(String[] args) {

	}

}
