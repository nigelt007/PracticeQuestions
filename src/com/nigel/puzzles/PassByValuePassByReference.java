package com.nigel.puzzles;

import java.util.HashMap;
import java.util.Map;

public class PassByValuePassByReference {

	public static void main(String[] args) {
		Map<String, String> map1 = new HashMap<>();
		map1.put("A", "11");
		map1.put("B", "22");
		methd(map1);
		for (Map.Entry<String, String> entry : map1.entrySet()) {
			System.out.println("Key - " + entry.getKey() + "  Value - " + entry.getValue());
		}
	}

	private static void methd(Map<String, String> map) {
		map.put("C", "33");
	}

}
