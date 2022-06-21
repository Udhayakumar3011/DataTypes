package com.java.programmingConcepts;

public class ReverseAStringTest {

	public static void main(String[] args) {

		// String givenStr = "Selenium";

		// reverse-mnineles
		// str-concat-two str join--str2-""
		// strbuff-append-two buffer join

		/*
		 * StringBuffer sb = new StringBuffer(); sb.append(givenStr); // sb.reverse();
		 * StringBuffer sb1 = sb.reverse(); System.out.println("Reverse String is" + " "
		 * + sb1);
		 */ // 0 10
		String givenStr = "SeleniumAutomation";

		// charArray-Each Char identified
		char[] arrChar = givenStr.toCharArray();
		// Temp Variable
		String rev = "";
		for (int i = arrChar.length - 1; i >= 0; i--) {
			rev = rev + arrChar[i];

			//
		}
		System.out.print("Reverse----" + " " + rev);
		// arrChar[i]+""

	}

}
