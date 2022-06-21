package com.java.programmingConcepts;

import java.util.Arrays;


public class RemoveWhiteSpaceRegex {

	public static void main(String[] args) {

		String givenStr = "    Selenium    Automation Testing   ";
		String trim = givenStr.trim();
		System.out.println("Trim" + " " + trim);

		String str = trim.replaceAll("\\s+", " ");

		System.out.println("Replace All"+" "+str);

		// split-Finding the Number of Each Words

		String[] arr = str.split(" ");
		int countOfWords = arr.length;
		System.out.println("Number of words is" + " " + countOfWords);

		System.out.println(Arrays.toString(arr));
		System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
		
	}

}
