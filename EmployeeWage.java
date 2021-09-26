package com.day4EmployeeWage;

public class EmployeeWage {

	int wagePerHours = 20;

	int dailyHours = 8;

	int fullTimeHours = 8;

	int partTimeHours = 4;

	int empHr;

	int daysPerMonth = 20;

	int totalHours = 100;
	int totalDays = 20;

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
		System.out.println();
		System.out.println();

	}

	public void dailyWage() {

		System.out.println("Daily Employee Wage is: " + wagePerHours * dailyHours);

		System.out.println();
	}

	public void checkPartAndFullTime() {

		int PartTimeWage = wagePerHours * partTimeHours;

		int FullTimeWage = wagePerHours * fullTimeHours;

		System.out.println("Part Time Wage = " + PartTimeWage);

		System.out.println("Full Time Wage = " + FullTimeWage);

		System.out.println();
	}

	public void monthlyWage() {

		int dailyWage = wagePerHours * dailyHours;

		int MonthlyWage = dailyWage * daysPerMonth;

		System.out.println("Monthly wage  = " + MonthlyWage);

		System.out.println();
	}

	public void CalWagesTillGivenCondition() {

		int empHours;
		int empWage = 0;
		int totalEmpWage = 0;
		int totalWorkingDays = 0;
		int totalEmpHrs = 0;

		while (totalEmpHrs <= totalHours && totalWorkingDays < totalDays) {

			totalWorkingDays++;

			int empCheck = (int) (Math.floor(Math.random() * 10) % 3);

			System.out.println("Random Integers: " + empCheck);

			switch (empCheck) {
			case 1:
				empHr = 8;
				System.out.print("full time");
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

			empWage = empHr * wagePerHours;

			totalEmpWage = totalEmpWage + empWage;
			System.out.println("days" + totalWorkingDays + "emphrs" + empHr);
			System.out.println("wage" + totalEmpWage);

			System.out.println("total wage" + totalEmpWage);

		}

	}

	public static void main(String[] args) {

		EmployeeWage obj = new EmployeeWage();

		obj.Wlcm();

		obj.employeeAttendance();

		obj.dailyWage();

		obj.checkPartAndFullTime();

		obj.attendanceBySwitchCase();

		obj.monthlyWage();

		obj.CalWagesTillGivenCondition();

	}

}
