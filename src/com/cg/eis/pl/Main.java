package com.cg.eis.pl;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeServiceImpl;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        EmployeeServiceImpl service = new EmployeeServiceImpl();
        Scanner sc = new Scanner(System.in);

        service.addEmployee(new Employee(1, "Amit", 45000, "Manager", "Scheme A"));
        service.addEmployee(new Employee(2, "Ravi", 25000, "Fullstack developer", "Scheme B"));
        service.addEmployee(new Employee(3, "Mohit", 12000, "Associate System Eningeer", "Scheme C"));

        int choice;

        do {
            System.out.println("\n1. Display All");
            System.out.println("2. Display by Scheme");
            System.out.println("3. Delete Employee");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                service.displayAll();
            } 
            else if (choice == 2) {
            	System.out.print("Enter scheme: ");
                sc.nextLine(); 
                String scheme = sc.nextLine(); 
                service.displayByScheme(scheme);
            } 
            else if (choice == 3) {
                System.out.print("Enter employee ID to delete: ");
                int id = sc.nextInt();
                sc.nextLine();
                service.deleteEmployee(id);
            }

        } while (choice != 4);

        sc.nextLine(); 
        
    }
}