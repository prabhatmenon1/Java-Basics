package com.training.arrays;

public class Arrdemo {
public static void main(String[] args) {
	int[] arr = new int[4];
	System.out.println(arr.length);// length
	System.out.println(arr[0]); //print first allocation
//	System.out.println(arr[4]); //throws  java.lang.ArrayIndexOutOfBoundsException
	System.out.println("populating");
	
	//populate the array
	arr[0] =90;
	arr[1] =80;
	arr[2] =92;
	arr[3] =84;
	System.out.println(arr[3]);
	System.out.println(arr[0]);
	System.out.println(arr[2]);
	
}
}
