package com.priyanshu.lab2.ex1;

import java.util.TreeSet;

public class Exercise1 {
	public static int findSecondSmallest(int[] arr) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : arr) {
        		set.add(num); 
        }

        set.pollFirst(); 
        return set.first();
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 4, 1};
        System.out.println("Second Smallest: " + findSecondSmallest(arr)); // Output: 3
    }
}
