package com.nigel.puzzles;

/**
 * This question is from Data Structures and Algorithms Made Easy in Java
 * by Narasimha Karumanchi.
 * Stacks - Page 96
 */

import java.util.Stack;

public class LargestRectangle {

	public static void main(String[] args) {

		System.out.println(maxRectangleArea(new int[] { 3, 2, 5, 6, 1, 4, 4 }, 7));
	}

	public static class StackItem {
		public int height;

		public int index;

		public StackItem(int height, int index) {
			this.height = height;
			this.index = index;
		}
	}

	private static long maxRectangleArea(int[] A, int n) {
		long maxArea = 0;

		Stack<StackItem> S = new Stack<>();
		S.push(new StackItem(Integer.MIN_VALUE, -1));
		for (int i = 0; i < n; i++) {

			StackItem cur = new StackItem((i < n ? A[i] : Integer.MIN_VALUE), i);
			if (cur.height > S.peek().height) {
				S.push(cur);
				continue;
			}

			while (S.size() > 1) {
				StackItem prev = S.peek();
				long area = (i - prev.index) * prev.height;
				if (area > maxArea) {
					maxArea = area;
				}
				prev.height = cur.height;
				if (prev.height > S.get(S.size() - 2).height) {
					break;
				}
				S.pop();
			}
		}
		return maxArea;
	}

}
