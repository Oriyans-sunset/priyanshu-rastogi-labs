package com.priyanshu.lab1.ex4;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise4 {
	
	static Boolean isPrime(int num) {
		if (num <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num%i == 0) {
                return false;
            }
        }
        
        return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for (int i = 0; i < num; i++) {
			if (isPrime(i)) {
				primes.add(i);
			}
		}
		
		System.out.println(primes);
	}
}
