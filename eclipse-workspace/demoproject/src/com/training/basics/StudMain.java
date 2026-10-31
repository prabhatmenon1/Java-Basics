package com.training.basics;

public class StudMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("jo",1,"CSE")
				student.printdetails();
		
		String result=student.greetmessage();
		System.out.println(result);
		
		Student student1 = new student("Helen",2,"CSE")
				student.printdetails();
		System.out.println(student1.greetmessage());
	}

}
