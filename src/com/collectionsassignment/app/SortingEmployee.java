package com.collectionsassignment.app;

import java.util.ArrayList;
import java.util.List;

public class SortingEmployee {

	public static void main(String args[]) {
		List<Employee> empList=new ArrayList<>();
		empList.add(new Employee(1, "Shilp",20000,"Developer"));
		empList.add(new Employee(2, "Isha",21000,"Maid"));
		empList.add(new Employee(3, "Harsh",18000,"Plumber"));
		empList.add(new Employee(4, "Chavi",60000,"Backend"));
		empList.add(new Employee(5, "Aakash",400000,"Frontend"));
		empList.add(new Employee(6, "Parul",21000,"Designer"));
		empList.add(new Employee(7, "Simran",50000,"UI/UX"));
		empList.add(new Employee(8, "Utkarsh",2000,"Finance"));
		empList.add(new Employee(9, "Aryan",90000,"Capitalist"));
		empList.add(new Employee(10, "Vardhan",10000,"Banker"));
		
		/*Sorting the employee in increasing order*/
		
		empList.stream()
		.sorted((emp1,emp2)->{
				return emp1.getEmpSalary().compareTo(emp2.getEmpSalary());
		}).forEach(emp->System.out.println(emp));
		
		System.out.println("-----------------------------------");
		
		/*Sorting the employee in decreasing order*/
		empList.stream()
		.sorted((emp1,emp2)->{
				return emp2.getEmpSalary().compareTo(emp1.getEmpSalary());
		}).forEach(emp->System.out.println(emp));
	}
}
