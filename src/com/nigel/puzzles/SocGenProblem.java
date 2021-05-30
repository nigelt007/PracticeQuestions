package com.nigel.puzzles;

import java.util.Arrays;
import java.util.Scanner;

public class SocGenProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCaseNum = sc.nextInt();
		long[] vals;
		long sumOfKms;
		long calories;
		long km;
		for (int i = 0; i < testCaseNum; i++) {
			int numDays = sc.nextInt();
			sumOfKms = 0;
			calories = 0;
			vals = new long[numDays];
			for (int j = 0; j < numDays; j++) {
				vals[j] = sc.nextLong();
			}
			Arrays.sort(vals);

			for (int k = vals.length - 1; k >= 0; k--) {
				km = vals[k];
				calories += (2 * sumOfKms) + km;
				sumOfKms += km;
			}
			System.out.println(calories);
		}
		sc.close();
	}

}
