package com.java.programmingConcepts;

public class ForEachTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr= {"Selenium","Automation","Testing"};
		
		/*
		 * for(int i=0;i<strArr.length;i++) { System.out.println(strArr[i]); }
		 */
		for (String str : strArr) {
			System.out.println(str);
		}
	}

}
