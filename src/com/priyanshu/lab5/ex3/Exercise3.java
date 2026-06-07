package com.priyanshu.lab5.ex3;

import java.util.Scanner;

import com.cg.eis.exception.EmployeeException;

public class Exercise3 {
	static void validateSalary(double salary) throws EmployeeException {
        if (salary < 3000) {
            throw new EmployeeException("Salary is below 3000");
        }
    }
	
	public static void main(String[] args) {
        try {
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter salary: ");
        	int salary = sc.nextInt();
        	
            validateSalary(salary);
        } catch (EmployeeException e) {
            System.out.println(e);
        }
    }
}
