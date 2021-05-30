package com.nigel.puzzles.line;

import java.math.BigInteger;

import org.junit.Test;

public class DiceProblem {

	public BigInteger calculatePossibilities(long N) {
		BigInteger ways = new BigInteger("0");

		BigInteger first = new BigInteger("0");
		BigInteger second = new BigInteger("0");
		BigInteger third = new BigInteger("0");
		BigInteger fourth = new BigInteger("0");
		BigInteger fifth = new BigInteger("0");
		BigInteger sixth = new BigInteger("1");

		for (int i = 0; i <= N; i++) {

			ways = first.add(second.add(third.add(fourth.add(fifth.add(sixth)))));

			if (i > 0) {
				first = second;
				second = third;
				third = fourth;
				fourth = fifth;
				fifth = sixth;
				sixth = ways;
			}

		}
		return ways;

	}

	@Test()
	public void test610() {
		System.out.println(calculatePossibilities(610));
	}

}
