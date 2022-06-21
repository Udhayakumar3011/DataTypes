package com.java.programmingConcepts;

public class ForEachStringLengthTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Selenium";
		int lengthOfTheString = str.length();
		System.out.println(lengthOfTheString);

		char[] arr = str.toCharArray();
		int count = 0;
		for (char c : arr) {
			count++;
		}
		System.out.println("Length of the Count is:" + " " + count);
	}

}
