package com.nigel.puzzles;

public class HillsAndValleys {

	public static void main(String[] args) {
		HillsAndValleys h = new HillsAndValleys();
		h.solution(new int[] { 2, 2, 3, 4, 3, 3, 2, 2, 1, 1, 2, 5 });
	}

	public int solution(int[] A) {
		// write your code in Java SE 8
		int n = A.length;
		int hm = 0;
		boolean goingDown = false;
		boolean goingUp = false;
		boolean firstValleyDone = false;
		boolean firstHillDone = false;
		boolean wasValley = false;
		boolean wasHill = false;

		if (n > 1) {
			for (int i = 1; i < n - 1; i++) {
				// Condition for Hill
				if (A[i] >= A[i - 1] && A[i] > A[i + 1]) {
					if (goingDown) {
						System.out.println(i + " First If");
						if (firstHillDone && wasValley) {
							hm++;
						} else {
							wasHill = true;
							hm++;
							firstHillDone = true;
						}
						goingDown = false;
					}
					goingUp = true;
				} else if (A[i] > A[i - 1] && A[i] >= A[i + 1]) {
					if (goingDown) {
						System.out.println(i + " Second If");
						hm++;
						goingDown = false;
						wasHill = true;
					}
					goingUp = true;
				}

				// Condition for Valley
				if (A[i] <= A[i - 1] && A[i] < A[i + 1]) {
					if (goingUp) {
						System.out.println(i + " Third If");
						if (firstValleyDone && wasHill) {
							hm++;
						} else {
							hm++;
							firstValleyDone = true;
						}
						goingUp = true;
					}
					goingDown = true;
				} else if (A[i] < A[i - 1] && A[i] <= A[i + 1]) {
					if (goingUp) {
						System.out.println(i + " Fourth If");
						if (!firstValleyDone && wasHill) {
							hm++;
						} else {
							hm++;
							firstValleyDone = true;
						}
						goingUp = true;
					}
					goingDown = true;
				}

			}
		}

		System.out.println(hm);
		return hm;
	}

}
