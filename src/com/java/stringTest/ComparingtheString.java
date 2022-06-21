package com.java.stringTest;

public class ComparingtheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Vcentry"; // user1
		String str2 = "vCenTry"; // user2

		// System.out.println(str1==str2);

		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
	}

}
