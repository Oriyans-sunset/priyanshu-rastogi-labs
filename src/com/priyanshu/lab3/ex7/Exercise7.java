package com.priyanshu.lab3.ex7;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Exercise7 {

    public static void printDuration(LocalDate date) {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(date, currentDate);

        System.out.println("Years: " + period.getYears());
        System.out.println("Months: " + period.getMonths());
        System.out.println("Days: " + period.getDays());
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter year: ");
    	int year = sc.nextInt();
    	System.out.println("Enter month: ");
    	int mon = sc.nextInt();
    	System.out.println("Enter day: ");
    	int day = sc.nextInt();
    	sc.close();
    	
        printDuration(LocalDate.of(year, mon, day));
    }
}