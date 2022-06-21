package com.java.programmingConcepts;

public class ReverseAWordsTest {

	public static void main(String[] args) {

		String givenStr = "Selenium Automation Testing";

		// Testing Automation Selenium
		// Words-3
		
		//Task-O/p-muineles noitamotua gnitset
		
		String[] arr = givenStr.split(" ");
		//System.out.println(arr[0]);
		//System.out.println(arr[1]);
		//System.out.println(arr[2]);
	//	String rev="";
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}

	}

}
