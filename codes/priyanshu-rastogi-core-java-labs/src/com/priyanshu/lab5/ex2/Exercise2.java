package com.priyanshu.lab5.ex2;

import java.util.Scanner;

public class Exercise2 {
	
	static void validateEmployeeName(String firstName, String lastName) throws InvalidNameException {
		if (firstName == null || firstName.trim().isEmpty()) {
            throw new InvalidNameException("First name cannot be empty");
        }

        if (lastName == null || lastName.trim().isEmpty()) {
            throw new InvalidNameException("Last name cannot be empty");
        }
	}
	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter first name: ");
			String firstName = sc.next();
			System.out.print("Enter last name: ");
			String lastName = sc.next();
			sc.close();
			
			validateEmployeeName(lastName, firstName);
		} catch (InvalidNameException e) {
			System.out.println(e);
		}
	}

}
