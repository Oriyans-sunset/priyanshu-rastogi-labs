package com.priyanshu.lab6.ex2;

import java.util.HashMap;

public class Exercise2 {
	
	static HashMap<Character, Integer> countChars(char[] arr) {
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for (char letter: arr) {
			if (map.containsKey(letter)) {
				map.put(letter, map.get(letter) + 1);
			} else {
				map.put(letter, 1);
			}
		}
		return map;
		
	}
	
	public static void main(String[] args) {
		char[] arr = {'a', 'b', 'c', 'b', 'b', 'c', 'd', 'a'};
		System.out.println(countChars(arr));
		
	}

}
