package com.nigel.puzzles.string;

public class StringReversal {

	public static void main(String[] args) {
		System.out.println(reverseRecursion("Hello"));
		
		System.out.println(reverseUsingByteArray("Hello"));
	}

	private static String reverseRecursion(String str) {
		if (str.length() < 2) {
			return str;
		}
		return reverseRecursion(str.substring(1)) + str.charAt(0);
	}

	/**
	 * Using byte array we can reverse the string and avoid creating multiple copies
	 * of the String and without using a string builder.
	 * 
	 * @param str
	 * @return
	 */
	private static String reverseUsingByteArray(String str) {

		byte[] byteArr = str.getBytes();
		byte[] resultStr = new byte[str.length()];

		for (int i = 0; i < str.length(); i++) {
			resultStr[i] = byteArr[byteArr.length - i - 1];
		}
		return new String(resultStr);
	}

}
