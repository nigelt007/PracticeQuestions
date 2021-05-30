package com.nigel.puzzles.line;

import org.junit.Test;

public class Fibonacci {

	public long fib(long N) {
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
		return b;
	}

	@Test()
	public void test0() {
		System.out.println(fib(0));
	}

	@Test
	public void test1() {
		System.out.println(fib(1));
	}

	@Test
	public void test2() {
		System.out.println(fib(2));
	}

	@Test
	public void test3() {
		System.out.println(fib(3));
	}
	
	@Test
	public void test4() {
		System.out.println(fib(4));
	}

	@Test
	public void test8181() {
		System.out.println(fib(8181));
	}

}
