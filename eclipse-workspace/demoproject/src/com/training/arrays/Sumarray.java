package com.training.arrays;

public class Sumarray {
	public static void main(String[]args) {
		int[] arr = new int[4];
		 int sum =0;
		 System.out.println(arr.length);
		 arr[0] = 90;
		 arr[1] = 80;
		 arr[2] = 70;
		 arr[3] = 60;
		 System.out.println(arr[0]);
		 System.out.println(arr[1]);
		 System.out.println(arr[2]);
		 System.out.println(arr[3]);
		  for (int i=0; i<arr.length; i++){
		      sum = sum+arr[i];
	}
System.out.println("Sum =" + sum);

}
}
