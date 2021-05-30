package com.nigel.puzzles.nodes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MaxNodes {
	static class Tree {

		public int x;
		public Tree l;
		public Tree r;

		Tree(int x, Tree l, Tree r) {
			this.x = x;
			this.l = l;
			this.r = r;
		}
	}

	public static void main(String[] args) {
		Tree T = new Tree(4, new Tree(5, new Tree(4, new Tree(5, null, null), null), null),
				new Tree(6, new Tree(1, null, null), new Tree(6, null, null)));
		solution(T);
	}

	public static int solution(Tree T) {
		// write your code in Java SE 8

		List<Set<Integer>> mainList = new ArrayList<Set<Integer>>();
		Set<Integer> path = new HashSet<>();
		traversePaths(T, path, mainList);
		int highestDistinct = 0;
		for (Set<Integer> set : mainList) {
			if (set.size() > highestDistinct) {
				highestDistinct = set.size();
			}
		}
		return highestDistinct;
	}

	private static void traversePaths(Tree t, Set<Integer> path, List<Set<Integer>> mainList) {
		if (t == null) {
			return;
		}
		int data = t.x;
		path.add(data);
		if (t.l == null && t.r == null) {
			Set<Integer> finalPath = new HashSet<>(path);
			mainList.add(finalPath);
			return;
		}
		path = new HashSet<>(path);
		traversePaths(t.l, path, mainList);
		if (t.l != null) {
			path.remove(t.l.x);
		}
		traversePaths(t.r, path, mainList);
		if (t.r != null) {
			path.remove(t.r.x);
		}
	}

}
