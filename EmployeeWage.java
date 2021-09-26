package com.day4EmployeeWage;

public class EmployeeWage {

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

	public static void main(String[] args) {

		EmployeeWage obj = new EmployeeWage();

		obj.Wlcm();

		obj.employeeAttdence();

	}

}
