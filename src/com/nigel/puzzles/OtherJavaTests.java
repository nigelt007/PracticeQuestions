package com.nigel.puzzles;

public class OtherJavaTests {
	
	public static void main(String[] args) {
		byte a = 127;
		byte b = 127;
		//		b = a + b; // error : cannot convert from int to byte
		b += a; // ok


		if(3*0.1 == 0.3) {
			System.out.println("It is equal");
		}
	}

}
