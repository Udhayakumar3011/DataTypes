package com.java.programmingConcepts;

public class FindTheMinAndMaxValueInArray {
//int a=10;
	public static void main(String[] args) {

		int a[] = { 12, 34, 24, 3, 12 };

		// min value-3
		// max value-34
		// index postion-3-3
		// 34-1
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				
				min = a[i];
			}
		}
		System.out.println("Minimum Value is:" + " " + min);
	}


}
