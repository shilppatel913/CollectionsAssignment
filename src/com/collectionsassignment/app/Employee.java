package com.collectionsassignment.app;

public class Employee {

	private int empCode;
	private String empName;
	private Integer empSalary;
	private String empDept;
	
	
	
	public Employee(int empCode, String empName, int empSalary, String empDept) {
		super();
		this.empCode = empCode;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empDept = empDept;
	}
	public int getEmpCode() {
		return empCode;
	}
	public void setEmpCode(int empCode) {
		this.empCode = empCode;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Integer getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(Integer empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
	
}
