package com.java.stringTest;

public class StringMethodsTest {

	public static void main(String[] args) {
				//    012345678910
		String str = "VcentryTech";

		System.out.println(str.charAt(1));
		System.out.println(str.length());
		System.out.println(str.equals("Tech"));
		System.out.println(str.equals("Tech"));
		System.out.println(str.equalsIgnoreCase("Vcentry TECH"));
		System.out.println(str.contains("entry"));
		System.out.println(str.startsWith("Vce"));
		System.out.println(str.endsWith("ch"));
		System.out.println(str.trim());
		System.out.println(str.substring(3));
		System.out.println(str.substring(5, 8));
		System.out.println(str.concat("Chennai"));
		System.out.println(str.indexOf("c"));
		System.out.println(str.lastIndexOf("h"));
		
		
	}

}
