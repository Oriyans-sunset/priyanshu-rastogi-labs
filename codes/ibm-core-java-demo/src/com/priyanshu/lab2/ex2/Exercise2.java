package com.priyanshu.lab2.ex2;

import java.util.Arrays;

public class Exercise2 {
	static String[] sortStrings(String[] arr) {
		Arrays.sort(arr);
		for(int i = 0; i < arr.length; i++) {
			if (i <= (arr.length/2)) {
				arr[i] = arr[i].toUpperCase();
			} else {
				arr[i] = arr[i].toLowerCase();
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		String[] arr = {"ABC", "BCD", "GHD", "JASD", "UWOYA", "BACSACD", "KUIAGS"};
		System.out.println(Arrays.toString(sortStrings(arr)));
	}
}
