package com.java.programmingConcepts;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String-Class Level Data Type

		String str = "Vcentry";
		//vcentry-yrtnecv
		//System.out.println(str.concat("Tech"));
		//System.out.println("String ref is" + " " + str);

		StringBuffer sb = new StringBuffer("VcentryBuffer");
		//System.out.println(sb.append("TechBuffer"));
		//System.out.println("String Buffer Ref is" + " " + sb);
		System.out.println(sb.reverse());
		
		
		StringBuffer replace = new StringBuffer("Vcentry");
		//System.out.println(replace.replace(0, 3, "Words"));
		

		StringBuffer delete = new StringBuffer("xyzVcentry");
		//System.out.println(delete.delete(0, 3));
		
		
		StringBuffer insert = new StringBuffer("Vcentry");
		System.out.println(insert.insert(3,"Tech"));
	}
}
