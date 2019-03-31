package com.Task30Marc;

public class GrpTask {

	public static void main(String[] args) {

		/*
		 * 1.Write a program to swap 2 numbers without a temporary variable? Swap 2 strings without a temporary variable? 	 
		 * 3.Find out how many alpha characters present in a string? 
		 * 4.How to find out the part of the string from a string? What is substring? Find number of words in string? 
		 * 5.Write a java program to reverse String? Reverse a string word by word?
		 */
		// --------------Task1------------------
		int a = 15;
		int b = 10;

		a = a - b;
		b = a + b;
		a = b - a;

		System.out.println("After the swap a is : " + a);
		System.out.println("After the swap b is : " + b);

		String str = "Best";
		String str1 = "Group";

		System.out.println("After swap str is: " + str.replace("Best", "Group"));
		System.out.println("After swap str1 is: " + str.replace("Group", "Best"));
		
		// --------------Task3---------------
		String strr = "Hello best12345**-$$$";
		String[] sr=strr.split("");
		System.out.println("Alpha characters : "+sr.length);

		// -------------Task4---------------
        String st3 = "Hello World This is Group Best";
		if (st3.contains("")) {
			int index = st3.lastIndexOf("World");
			String str4 = st3.substring(index);
			String str5 = st3.substring(0, index);
			System.out.println("str4 = " + str4 + "\nstr5 = " + str5);

		}

		String[] words = st3.split(" ");
		int count = words.length;
		System.out.println("word count : " + count);

		//--------------Task5---------------
		String str3 = "Hello World This is Group Best";
		String[] word = str3.split(" ");
		
		for (int x = word.length-1; x >=0;  x--) {

			System.out.print(word[x]+" ");
			System.out.println();
		}
		for(int x=str3.length()-1; x >=0;  x--) {
			
			System.out.print(str3.charAt(x));
		}

	}
	

}
