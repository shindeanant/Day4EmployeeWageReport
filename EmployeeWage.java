package com.day4EmployeeWage;

public class EmployeeWage {

	int wagePerHours = 20;

	int dailyHours = 8;

	int fullTimeHours = 8;

	int partTimeHours = 4;

	public void Wlcm() {

		System.out.println("Welcome to Employee Wage Computation Program ");
	}

	public void employeeAttdence() {

		double empCheck = Math.floor(Math.random() * 10) % 2;

		System.out.println(empCheck);

		if (empCheck == 1) {

			System.out.println("Employee is Present");
		}

		else {
			System.out.println("Employee is Absent");
		}

	}

	public void dailyWage() {

		System.out.println("Daily Employee Wage is: " + wagePerHours * dailyHours);
	}

	public void checkPartAndFullTime() {

		int PartTimeWage = wagePerHours * partTimeHours;

		int FullTimeWage = wagePerHours * fullTimeHours;

		System.out.println("Part Time Wage = " + PartTimeWage);

		System.out.println("Full Time Wage = " + FullTimeWage);
	}

	public static void main(String[] args) {

		EmployeeWage obj = new EmployeeWage();

		obj.Wlcm();

		obj.employeeAttdence();

		obj.dailyWage();

		obj.checkPartAndFullTime();
	}

}
