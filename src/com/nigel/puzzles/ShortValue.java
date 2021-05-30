package com.nigel.puzzles;

public class ShortValue {
	public static void main(String[] args) {
		short start = Short.MAX_VALUE - 10;
		short end = Short.MAX_VALUE;
		int n = 0;
		for (short i = start; i < end; i++) {
			n++;
		}
		System.out.println(n);
	}

}
