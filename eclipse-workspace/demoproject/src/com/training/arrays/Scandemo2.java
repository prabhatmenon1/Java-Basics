package com.training.arrays;
import java.util.Scanner;

public class Scandemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		String name = sc.next();
		System.out.println("Name "+ name);
		System.out.println("Enter ID");
		int id = sc.nextInt();
		System.out.println("ID "+ id);
		System.out.println("Enter Salary");
		double salary = sc.nextDouble();
		System.out.println("Salary "+ salary);
		System.out.println("Enter City");
		String city = sc.next();
		System.out.println("City " + city);
		sc.close();
				

	}

}
