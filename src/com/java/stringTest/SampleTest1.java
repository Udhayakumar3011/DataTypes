package com.java.stringTest;

public class SampleTest1 {

	public static void main(String[] args) {

		String str = "Vcentry Tech";

		System.out.println(str.charAt(1));
		System.out.println(str.equals("Tech"));
		System.out.println(str.equals("Tech"));
		System.out.println(str.equalsIgnoreCase("Vcentry TECH"));
		System.out.println(str.contains("entry"));
		System.out.println(str.startsWith("Vce"));
		System.out.println(str.endsWith("ch"));
		System.out.println(str.trim());
		System.out.println(str.substring(3));
		System.out.println(str.substring(3, 7));
		System.out.println(str.concat("Chennai"));

	}

}
