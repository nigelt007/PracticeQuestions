package com.nigel.puzzles;

public class Solution {
	public static int solution(int[] T) {
		int count = 0;

		int max = -1000000000;
		int min = 1000000000;
		boolean changed = false;
		for (int i = 0; i < T.length; i++) {
			if (i < 2 && T[i] > max) {
				max = T[i];
				changed = true;
				count++;
				continue;
			} else if (T[i] > max) {
				break;
			}
			if (T[i] <= min) {
				min = T[i];
				changed = true;
				count++;
				continue;
			}
			count++;
			changed = false;
			if (i != 2 && changed == false) {
				break;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		System.out.println(solution(new int[] { 5, -2, 3, 8, 6 }));
		System.out.println(solution(new int[] { -5, -5, -5, -42, 6, 12 }));
		System.out.println(solution(new int[] { -5, -5, -5, -42, 6, -2, 3, 7, 12 }));
	}

}
