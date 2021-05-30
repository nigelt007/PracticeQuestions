package com.nigel.puzzles.lambda;

import org.junit.Test;

/**
 * This class is to test whether Functional interfaces which is the fundamental
 * requirement for Java Lambdas will break if there is multiple inheritance of
 * Type, i.e. if the interface extends multiple interfaces.
 * 
 * @author Nigel
 *
 */
public class MultipleInherited {

	@Test
	public void printTest() {

		B b = new ImplementingB();

		b.takesA(e -> System.out.println("Hello Nigel"));
	}

}
