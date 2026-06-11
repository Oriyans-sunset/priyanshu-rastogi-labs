package com.priyanshu.lab3.ex1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a line of ints:");
        String numbers = scanner.nextLine();

        
        StringTokenizer tokenizer = new StringTokenizer(numbers);

        int sum = 0;

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            int number = Integer.parseInt(token);
            sum += number;
            System.out.print("Number: " + number + " ");
            System.out.print("Sum: " + sum + "\n");
        }
        scanner.close();
	}
}
