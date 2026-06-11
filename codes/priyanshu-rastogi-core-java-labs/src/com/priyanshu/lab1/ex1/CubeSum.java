package com.priyanshu.lab1.ex1;

import java.util.Scanner;

public class CubeSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number: ");
        int num = sc.nextInt(); 
        sc.close();
        
		double ans = 0;
		while (num > 0) {
			int digit = num%10;
			ans += Math.pow(digit, 3);
			num = num/10;
		}
		
		System.out.println(ans);
		
	}

}
