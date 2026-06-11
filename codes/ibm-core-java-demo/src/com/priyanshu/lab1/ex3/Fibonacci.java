package com.priyanshu.lab1.ex3;

import java.util.Scanner;

public class Fibonacci {
	
	static int fibRecur(int num) {
		if (num <= 1)
			return num;
		return fibRecur(num-1) + fibRecur(num-2);
	}
	
	static void fibIter(int num) {
		int n1 = 0; 
		int n2 = 1;

        for (int i = 0; i < num; i++) {
            System.out.print(n1 + " ");

            int n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
        }
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to which fiboncai serires will be printed: ");
		int nth = sc.nextInt();
		sc.close();
		
		System.out.println("Recursive answer: ");
		for (int i = 0; i < nth; i ++) {
			System.out.print(fibRecur(i) + " ");
		}
		
		System.out.println('\n');
		System.out.println("Interative answer: ");
		fibIter(nth);
	}
}
