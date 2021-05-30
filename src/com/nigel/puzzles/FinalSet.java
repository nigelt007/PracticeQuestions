package com.nigel.puzzles;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FinalSet {

	public static void main(String[] args) {
		final Set<String> set = new HashSet<>(Arrays.asList("One", "Two"));
		set.remove("One");
		set.add("3");
		set.stream().forEach(System.out::println);
		System.out.println("Exit");
	}

}
