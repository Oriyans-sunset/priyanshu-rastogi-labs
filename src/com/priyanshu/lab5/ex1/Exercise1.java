package com.priyanshu.lab5.ex1;

import java.util.Scanner;

public class Exercise1 {
	
	static void validateAge(int age) throws InvalidAgeException {
        if (age <= 15) {
            throw new InvalidAgeException("Age must be above 15.");
        } else {
            System.out.println("Age validated!");
        }
    }
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int userAge = scanner.nextInt();
        scanner.close();

        try {
            validateAge(userAge);
        } catch (InvalidAgeException e) {
            System.out.println("Error caught: " + e.getMessage());
        } 
	}
}
