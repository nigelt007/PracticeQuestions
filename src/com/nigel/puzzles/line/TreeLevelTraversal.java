package com.nigel.puzzles.line;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.junit.Test;

public class TreeLevelTraversal {

	class Tree {

		Tree(final Integer data) {
			this.data = data;
		}

		Tree left;

		Tree right;

		Integer data;
	}

	private void traverseNextLevel(Tree t, Map<Integer, List<Integer>> map, int level) {

		if (t == null) {
			return;
		}

		level = level + 1;
		if (!map.containsKey(level)) {
			List<Integer> newList = new LinkedList<Integer>();
			newList.add(t.data);
			map.put(level, newList);
		} else {
			map.get(level).add(t.data);
		}
		traverseNextLevel(t.left, map, level);
		traverseNextLevel(t.right, map, level);

	}

	@Test
	public void testTreeTraversal() {
		Tree root = new Tree(2);
		root.left = new Tree(1);
		root.right = new Tree(3);
		root.left.left = new Tree(0);
		root.left.right = new Tree(7);
		root.right.left = new Tree(9);
		root.right.right = new Tree(1);
		Map<Integer, List<Integer>> map = new TreeMap<>();
		traverseNextLevel(root, map, 0);
		for (List<Integer> value : map.values()) {
			Iterator<Integer> iter = value.iterator();
			while (iter.hasNext()) {
				System.out.print("(" + iter.next() + ")");
				if (iter.hasNext()) {
					System.out.print(",");
				}
			}
			System.out.println();
		}
	}

}
