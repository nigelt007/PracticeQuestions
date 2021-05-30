package com.nigel.puzzles;

import java.math.BigInteger;

import org.junit.Test;

public class Fibonacci {

	public long fib(long N) {
		long startMem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		long a = 0, b = 1, c;

		if (N == 0) {
			return a;
		}
		if (N == 1) {
			return b;
		}

		for (int i = 2; i <= N; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		long endMem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		System.out.println("Memory used " + (endMem - startMem));
		return b;
	}

	public BigInteger fibBig(long N) {
		long startMem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		BigInteger a = new BigInteger("0");
		BigInteger b = new BigInteger("1");
		BigInteger c = new BigInteger("0");

		if (N == 0) {
			return a;
		}
		if (N == 1) {
			return b;
		}

		for (long i = 2; i <= N; i++) {
			c = a.add(b);
			a = b;
			b = c;
		}
		long endMem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		System.out.println("Memory used in Big : " + (endMem - startMem) / 1024 + " Kilo bytes");
		return b;
	}

	@Test
	public void testintMaxBig() {
		System.out.println("Big Int " + fibBig(20000)); // TRY 3248
	}

	/*
	 * @Test() public void test0() { System.out.println(fib(0)); }
	 * 
	 * @Test public void test1() { System.out.println(fib(1)); }
	 * 
	 * @Test public void test2() { System.out.println(fib(2)); }
	 * 
	 * @Test public void test3() { System.out.println(fib(3)); }
	 * 
	 * @Test public void test4() { System.out.println(fib(4)); }
	 */

	/*
	 * @Test public void test8181() { System.out.println(fib(8181)); }
	 */
	/*
	 * @Test public void testIntMax1() { System.out.println("Normal " + fib(92)); }
	 */

}
