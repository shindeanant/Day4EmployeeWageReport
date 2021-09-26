package com.day4EmployeeWage;

public class EmployeeWage {

	int wagePerHours = 20;

	int dailyHours = 8;

	int fullTimeHours = 8;

	int partTimeHours = 4;

	int empHr;

	public void Wlcm() {

		System.out.println("Welcome to Employee Wage Computation Program ");
	}

	public void employeeAttendance() {

		int empCheck = (int) Math.floor(Math.random() * 10) % 3;

		System.out.println(empCheck);

		if (empCheck == 1) {

			System.out.println("Employee is Present");
		}

		else {
			System.out.println("Employee is Absent");
		}

	}

	public void attendanceBySwitchCase() {

		int empCheck = (int) Math.floor(Math.random() * 10) % 3;

		System.out.println(empCheck);

		switch (empCheck) {

		case 1:
			empHr = 8;
			System.out.print("full time present");
			break;
		case 2:
			empHr = 4;
			System.out.print("part time");
			break;
		case 0:
			empHr = 0;
			System.out.println("absent");
			break;

		default:
			empHr = 0;
			break;
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

		obj.employeeAttendance();

		obj.dailyWage();

		obj.checkPartAndFullTime();

		obj.attendanceBySwitchCase();
	}

}
