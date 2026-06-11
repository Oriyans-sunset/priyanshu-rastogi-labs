package com.priyanshu.lab1.ex6;

import java.util.Scanner;

public class Exercise6 {
	static double calculateDifference(int n) {
		int sum_of_squares = 0;
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum_of_squares += Math.pow(i, 2);
			sum += i;
		}
		
		return sum_of_squares - Math.pow(sum, 2);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		System.out.println(calculateDifference(num));
	}
}
