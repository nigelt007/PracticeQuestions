package com.nigel.puzzles.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class HasVowelsSurrounding {

	public static void main(String[] args) {

		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String sentence = in.readLine();

			String[] words = sentence.split(" ");
			boolean any = false;
			for (String word : words) {
				String[] chars = word.split("");
				List<String> vowels = Arrays.asList(new String[] { "a", "e", "i", "o", "u" });
				int count = 0;
				if (chars.length > 2) {
					for (int i = 1; i <= chars.length - 2; i++) {
						if (vowels.contains(chars[i - 1]) && vowels.contains(chars[i + 1])) {
							count++;
							any = true;
						}
					}
				}
				if (count > 0) {
					System.out.println(word + " " + "(" + count + ")");
				}
			}
			if (!any) {
				System.out.println("None");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
