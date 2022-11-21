package com.application.fullstackdemo;

public class Emp1 {

	// Attributes
	String empName;
	String empDesignation;
	String empemail;
	String empId;
	String empPhone;
	String empSalary;
	private String email;
	
	// Constructor
	public Emp1(String Name, String Designation, String email,String Id, String Phone,String Salary) {

		this.empName=Name;
		this.empDesignation=Designation;
		this.empemail=email;
		this.empId=Id;
		this.empPhone=Phone;
		this.empSalary=Salary;

	}

	// Getters and Setters
	
	public String getempName() {
		return empName;
	}

	public void setempName(String empName) {
		this.empName = empName;
	}

	public String getStdCourse() {
		return empDesignation;
	}

	public void setempDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	public String getempemail() {
		return empemail;
	}

	public void setempemail(String empemail) {
		this.empemail = empemail;
	}

	public String getempID() {
		return empId;
	}

	public void setempId(String empId) {
		this.empId = empId;
	}

	public String getempPhone() {
		return empPhone;
	}

	public void setempPhone(String empPhone) {
		this.empPhone = empPhone;
	}
	public void setempSalary(String empSalary ) {
		this.empSalary = empSalary;
	}

	// setvalue and getvalue
	// set Student Name
	// get Student Name

	// Method
	
	public void displayEmp1Details() {
		System.out.println(this.empName);
		System.out.println(this.empDesignation);
		System.out.println(this.empemail);
		System.out.println(this.empId);
		System.out.println(this.empPhone);
		System.out.println(this.empSalary);

	}
	public static void main(String args[])
	{
		Emp1 e1=new Emp1("Akhila","fullstack","akhilareddybhavanam@gmail.com","1","7286018320","50000");
		e1.displayEmp1Details();
		
	}
		
	}