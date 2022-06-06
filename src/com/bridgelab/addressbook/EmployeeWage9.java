package com.bridgelab.addressbook;
import java.util.Random;
import java.util.Scanner;
public class EmployeeWage9{

    private static Random sc;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation program ");

        int maxHour, maxDays, wagePerHour;

        EmployeeWage9 emp1 = new EmployeeWage9();

        System.out.print("Enter Maximum working hours : ");
        maxHour = EmployeeWage9.sc.nextInt();

        System.out.print("Enter Maximum working days : ");
        maxDays = EmployeeWage9.sc.nextInt();

        System.out.print("Enter Employee Wage per hour : ");
        wagePerHour = EmployeeWage9.sc.nextInt();

        emp1.totalWage(maxDays, maxHour, wagePerHour);

        System.out.println("Wage for different company started ");

        EmployeeWage9 emp2 = new EmployeeWage9();

        System.out.print("Enter Maximum working hours : ");
        maxHour = EmployeeWage9.sc.nextInt();

        System.out.print("Enter Maximum working days : ");
        maxDays = EmployeeWage9.sc.nextInt();

        System.out.print("Enter Employee Wage per hour : ");
        wagePerHour = EmployeeWage9.sc.nextInt();

        emp2.totalWage(maxDays, maxHour, wagePerHour);

    }

    private void totalWage(int maxDays, int maxHour, int wagePerHour) {
    }
}
