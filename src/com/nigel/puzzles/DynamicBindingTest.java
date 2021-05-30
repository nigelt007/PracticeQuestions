package com.nigel.puzzles;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class DynamicBindingTest {

	public static void main(String args[]) {
		Vehicle vehicle = new Car(); // here Type is vehicle but object will be Car
		vehicle.start(); // Car's start called because start() is overridden method

		Set setOfRawType = new HashSet<String>();
		setOfRawType = new HashSet<Integer>();

		setOfRawType.add("one");
		setOfRawType.add(1);

		System.out.println(setOfRawType);

		Set<Object> setOfAnyType = new HashSet<Object>();
		setOfAnyType.add("abc"); // legal
		setOfAnyType.add(new Float(3.0f));

		System.out.println(setOfAnyType);

		Set<?> setOfUnknownType = new LinkedHashSet<String>();
		setOfUnknownType = new LinkedHashSet<Integer>();

		Set<String> setOfString = new HashSet<String>(); // valid in Generics
		setOfString = new LinkedHashSet<String>(); // Ok

		// Set<Object> SetOfObject = new HashSet<String>(); // compiler error -
		// incompatible type

		// Bounded Wildcard types
		Set<? extends Number> setOfAllSubTypeOfNumber = new HashSet<Integer>(); // legal - Integer extends Number
		setOfAllSubTypeOfNumber = new HashSet<Float>(); // legal - because Float extends Number

		// Another example of Bounded Wildcards

		Set<? super TreeMap> setOfAllSuperTypeOfTreeMap = new LinkedHashSet<TreeMap>(); // legal because TreeMap is
																						// superType of itself

		setOfAllSuperTypeOfTreeMap = new HashSet<SortedMap>(); // legal because SorteMap is super class of TreeMap
		setOfAllSuperTypeOfTreeMap = new LinkedHashSet<Map>(); // legal since Map is super type of TreeMap

		List list = new ArrayList();

		ArrayList<Stock> stockList = new ArrayList<Stock>();
		Stock sony = new Stock("Sony", "6758.T");
		stockList.add(sony);
		Stock retreivedStock = stockList.get(1); // no cast requires – automatic casting by compiler
		
		
		List<Object> objectList;
		List<String> stringList;

		// objectList = stringList; // compilation error incompatible types

	}

	public static <T> T identical(T source) {
		return source;
	}

}
