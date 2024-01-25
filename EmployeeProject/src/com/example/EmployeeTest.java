package com.example;

import java.text.NumberFormat;

import com.example.domain.Admin;
import com.example.domain.Director;
import com.example.domain.Employee;
import com.example.domain.Engineer;
import com.example.domain.Manager;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp = new Engineer(101, "Jane", "012", 120);
		Employee manager = new Manager(102, "Barbara", "345", 250, "US Marketing");
		Employee admin = new Admin(103, "Admin", "3543", 100);
		Employee director = new Director(105, "Director", "667", 500, "Global Marketing", 1000000);

		Manager manage = new Manager(102, "Barbara", "345", 250, "US Marketing");
		if (manage.addEmployee(emp)) {
			System.out.println("Employee added");
		}
		if (manage.addEmployee(emp)) {
			System.out.println("Employee added");
		}
		if (manage.addEmployee(admin)) {
			System.out.println("Employee added");
		}

		manage.printStaffDetails();
	}

	static void printEmployee(Employee emp) {
		System.out.println(emp.getEmpId());
		System.out.println(emp.getName());
		System.out.println(emp.getSsn());
		System.out.println(NumberFormat.getCurrencyInstance().format(emp.getSalary()));
	}
}
