package com.training.basics;

public class Greatnumber {

	public static void main(String[] args) {
		int x = 10; int y = 20; int z = 30;
		if ((x >= y) && (x >= z)) {
			System.out.println("Greatest number is " + x);
			
		} else if ((y >=x) && (y>=z)) {
			System.out.println("Greatest number is " + y);
			
		}
		else {
			System.out.println("Greatest number is " + z);
		}

	}

}	
