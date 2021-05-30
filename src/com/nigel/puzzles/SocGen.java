package com.nigel.puzzles;

import java.util.Scanner;

public class SocGen {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int testCaseNum = sc.nextInt();
		int index;
		int geneIndex;
		boolean isFound;
		String chromosome = null;
		String[] chromosomeArr = null;
		String gene = null;
		String[] geneArr = null;
		int chromosomeLen;
		int geneLen;
		for (int i = 0; i < testCaseNum; i++) {
			chromosome = sc.next();
			chromosomeArr = chromosome.split("");
			index = 0;
			gene = sc.next();
			geneArr = gene.split("");
			isFound = true;
			geneIndex = 0;
			chromosomeLen = chromosomeArr.length;
			geneLen = geneArr.length;
			while (isFound && index < chromosomeLen - 1 && geneIndex < geneLen) {
				isFound = false;
				for (int pos = index; pos < chromosomeLen; pos++) {
					index++;
					if (chromosomeArr[pos].equals(geneArr[geneIndex])) {
						geneIndex++;
						isFound = true;
						break;
					}
				}
			}
			if (geneIndex == geneLen) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		sc.close();

	}

}
