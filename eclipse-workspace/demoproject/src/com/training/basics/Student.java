package com.training.basics;

public class Student {
	String studName;
	int studid;
	String department;
	public Student(String studname, int studid, String department) {
		super();
		this.studName = studname;
		this.studid = studid;
		this.department = department;
	}
	void printdetails() {
		System.out.println("Name"+studName);
		System.out.println("Id"+studid);
		System.out.println("Department"+department);
	}
		
		String greetmessage() {
			String result = "welcome"+studName;
			return result;
			return "welcome"+studName;
			
				
					
		}
	}


