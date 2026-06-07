package com.priyanshu.lab1.ex5;

import java.util.Scanner;

public class Exercise5 {
	static int calculateSum(int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			if (i%3 == 0 || i%5 == 0){
				sum += i;
			}
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		System.out.println(calculateSum(num));
	}
}
