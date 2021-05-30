package com.nigel.puzzles.string;

import java.util.HashSet;
import java.util.Set;

public class StringPermuatation {

	public static void main(String[] args) {
		String str = "ABC";
		int n = str.length();
		StringPermuatation permutation = new StringPermuatation();
		Set<String> perms = new HashSet<>();
		permutation.permute(str, 0, n - 1, perms);
		System.out.println(perms.size() + " permutations");
	}

	private void permute(String str, int l, int r, Set<String> perms) {
		if (l == r) {
			perms.add(str);
			System.out.println(str);
		} else {
			for (int i = l; i <= r; i++) {
				str = swap(str, l, i);
				permute(str, l + 1, r, perms);
				str = swap(str, l, i);
			}
		}
	}

	public String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

}
