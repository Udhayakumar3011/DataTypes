package com.java.programmingConcepts;

import java.util.Scanner;

public class NoOfOccurenceTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the City Name");
		String str = sc.nextLine();

		// User-Chennai;
	//	"Madurai"--n is not present in the input data
		// String Length-But don't use find Length func
		// Char-'n'
		// count-2
		char c = 'n';
		String inputFromUser = str.trim().toLowerCase();
		int count = 0;
		for (int i = 0; i < inputFromUser.length(); i++) {
			if (inputFromUser.charAt(i) == c) {
				count++;
			}
		}
		System.out.println("Total occurence of n char is:" + " " + count);
	}

}
