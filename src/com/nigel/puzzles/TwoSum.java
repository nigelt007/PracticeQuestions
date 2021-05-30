package com.nigel.puzzles;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {

		Integer[] numArr = Arrays.stream(nums).boxed().toArray(Integer[]::new);
		Integer t = new Integer(target);

		// Array Value -> Key, Index -> value
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		int[] sumIndex = new int[2];
		for (int i = 0; i < numArr.length; i++) {
			map.put(numArr[i], i);
		}
		for (int j = 0; j < numArr.length; j++) {
			Integer diff = t - numArr[j];
			Integer i = map.get(diff);
			if (i != null && i != j) {
				sumIndex[0] = i;
				sumIndex[1] = j;
				return sumIndex;
			}
		}

		return sumIndex;
	}

	public static void main(String[] args) {
		twoSum(new int[] { 11, 15, 12, 13, 14, 23, 22, 33, 45, 12, 34, 2, 7 }, 9);
	}

}
