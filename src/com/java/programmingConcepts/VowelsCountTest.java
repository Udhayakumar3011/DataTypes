package com.java.programmingConcepts;

public class VowelsCountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//str input get from user
		String str = " SeLenium";

		// Vowels Letters-a e i o u-Small Letters
		// Count-4
		//e e i u
		String givenStr = str.trim().toLowerCase();
		int count = 0;  
		// &&-and ||or
		for (int i = 0; i < givenStr.length(); i++) {
			if (givenStr.charAt(i) == 'a' || givenStr.charAt(i) == 'e' || givenStr.charAt(i) == 'i'
					|| givenStr.charAt(i) == 'o' || givenStr.charAt(i) == 'u') {
				count++;
				
			}
		}
		System.out.println("Total No.of Vowels count is" + " " + count);
	}

}
