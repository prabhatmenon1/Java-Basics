package com.training.arrays;
import java.util.Scanner;

public class Scandemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name");
		String name = sc.nextLine();
		System.out.println("Name "+ name);
		
		System.out.println("Enter ID");
		int id = sc.nextInt();
		System.out.println("ID "+ id);
		sc.nextLine(); //flushout the next line
		
		System.out.println("Enter Department");
		String dept  = sc.nextLine();
		System.out.println("Dept "+ dept);
		
		System.out.println("Enter Salary");
		double salary = sc.nextDouble();
		System.out.println("Salary " + salary);
		
		//close the scanner
		sc.close();
				

	}

}
