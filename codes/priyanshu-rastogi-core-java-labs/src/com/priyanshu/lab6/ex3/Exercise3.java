package com.priyanshu.lab6.ex3;

import java.util.HashMap;

public class Exercise3 {
	static HashMap<Integer, Integer> getSquares(int[] arr){
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int num: arr) {
			map.put(num, (int) Math.pow(num, 2));
		}
		return map;
		
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 5, 3, 4, 10};
		System.out.println(getSquares(arr));
	}
}
