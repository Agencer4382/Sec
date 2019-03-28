package com.class2;

import java.util.Scanner;

public class taskloananddmv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int loan;
		String lend;
		String reject;

		Scanner kevin = new Scanner(System.in);
		System.out.println("enter loan here: ");
		loan = kevin.nextInt();
		if (loan > 200000) {
			System.out.println("lend");

		} else {
			System.out.println("declere");
		}

	}

}
