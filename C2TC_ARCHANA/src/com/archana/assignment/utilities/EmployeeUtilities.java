package com.archana.assignment.utilities;
import com.archana.assignment.employe.Employee;
public class EmployeeUtilities {
	public static void printEmployeeDetails(Employee employee) {
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Name: " + employee.getName());
        System.out.println("Salary: " + employee.getSalary());
    }

}
