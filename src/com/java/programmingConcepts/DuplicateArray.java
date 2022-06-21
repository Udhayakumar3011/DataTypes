package com.java.programmingConcepts;

public class DuplicateArray {

	public static void main(String[] args) {

		int arr[] = { 13, 10, 21, 15, 10 };

		// duplicate value-10
		// equals
		// ==
		//str="vcentry";
	//	sub(1,4)
		int size = arr.length;
		for (int i = 0; i < size; i++) { // true
			for (int j = i + 1; j < size; j++) { // true
				if ((arr[i] == arr[j])) {
					System.out.println("Duplicate value is:" + " " + arr[j]);
				}
			}
		}
	}

}
