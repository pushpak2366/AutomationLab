package com.program.collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class CountOFCharaterInString {

	// Java program to count the occurrence of each character in a string using
	// Hashmap

	public static void main(String[] args) {

		String name = "ABCD";
		char[] ch = name.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : ch) {
			if (map.containsKey(c)) {

				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);

			}
		}
		for (Entry<Character, Integer> data : map.entrySet()) {
			System.out.println(data.getKey() + "==" + data.getValue() +" "+data.toString());

		}

	}

}
