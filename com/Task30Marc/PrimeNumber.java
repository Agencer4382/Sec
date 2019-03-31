package com.Task30Marc;

public class PrimeNumber {

	public static void main(String[] args) {

		int num = 19;
		int x = 0;
		int count = 0;

		for (x = 2; x < num; x++) {

			if (num % x == 0) {

				count++;
				break;
			}
		}
		if (count == 0) {

			System.out.print("This is a Prime Number");
		} else {
			System.out.print("This is not a Prime Number");
		}

	}

}
