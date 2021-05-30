package com.nigel.puzzles.line;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class CustomDataStructure {

	public String[] solution(String[] n) {
		// write your code in Java 8
		CustomMap<Integer, Integer> customMap = new CustomMap<>();
		List<String> outputs = new ArrayList<String>();
		for (String command : n) {
			String[] parts = command.split(" ");
			String method = parts[0];
			Integer arg1 = null;
			Integer arg2 = null;
			if (parts.length > 1) {
				arg1 = Integer.parseInt(parts[1]);
			}
			if (parts.length > 2) {
				arg2 = Integer.parseInt(parts[2]);
			}
			Integer res = null;
			if ("add".equals(method)) {
				customMap.add(arg1, arg2);
			} else if ("get".equals(method)) {
				res = customMap.get(arg1);
				outputs.add(res.toString());
			} else if ("remove".equals(method)) {
				res = customMap.remove(arg1);
				outputs.add(res.toString());
			} else if ("evict".equals(method)) {
				customMap.evict();
			} else if ("exit".equals(method)) {
				break;
			}

		}

		int size = outputs.size();
		String[] result = new String[size];
		for (int i = 0; i < size; i++) {
			result[i] = outputs.get(i);
		}
		return result;

	}

	public class CustomMap<K, V> {

		Stack<Integer> stack = new Stack<Integer>();

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		public void add(Integer key, Integer value) {
			map.put(key, value);
			stack.remove(key);
			stack.push(key);
		}

		public Integer get(Integer key) {

			try {
				if (map.containsKey(key)) {
					stack.remove(key);
					stack.push(key);
					return map.get(key);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return -1;
			}
			return -1;
		}

		public Integer remove(Integer key) {
			if (map.containsKey(key)) {
				return map.remove(key);
			}
			return -1;

		}

		public void evict() {
			Integer res =stack.remove(0);
			map.remove(res);
		}

		public void exit() {
			return;
		}

	}

	public static void main(String[] args) {
		CustomDataStructure cds = new CustomDataStructure();
		String[] res = cds.solution(new String[] { "add 5 3", "add 1 2", "get 5", "evict", "get 1", "remove 5", "exit" });
		System.out.println(res);
	}

}
