package com.java.programmingConcepts;

import java.util.Scanner;

public class ScannerTestOne {

	public static void main(String[] args) {
		
		//int age=10;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your age:");
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println("Voting is Eligible");
		}else {
			System.out.println("Voting not eligible");
		}

	}

}
