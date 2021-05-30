package com.nigel.puzzles.lambda;

public class ImplementingB implements B {

	String s = "Hello";

	@Override
	public void takesA(A a) {
		a.sysout(a);

	}

}
