package com.program.collections;

import java.util.HashMap;

public class OccurrenceOfWordsInAStringUsingHashMap {

	// Java Program to Find the Occurrence of Words in a String using HashMap

	public static void main(String[] args) {

		String str = "i  am study a program in Accleration foundation";
		String[] wordData = str.split(" ");
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (String string : wordData) {
			
			if(map.isEmpty())
			
			if(map.containsKey(string))
			{
				
				map.put(string, map.get(string)+1);
				
			}
			else
			{
				map.put(string,1);
				
			}

		}
		System.out.println("Map conatins word count is"+wordData.length);

	}

}
