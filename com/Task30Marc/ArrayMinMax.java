package com.Task30Marc;

public class ArrayMinMax {

	public static void main(String[] args) {
		// * 2.Write a java program to find the second largest number in the array?
		// Maximum and minimum number in the array?

		int[][] num = { { 10, 4, 45, 5 }, { 32, 75 }, { 21 } };

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int max2 = 0;
		int min2 = 0;

		for (int row = 0; row < num.length; row++) {

			for (int col = 0; col < num[row].length; col++) {

				if (num[row][col] > max) {
					max2 = max;
					max = num[row][col];
				}
				if (num[row][col] < min) {
					min2 = min;
					min = num[row][col];

				}
			}

		}
		System.out.println(max);
		System.out.println(min);
		System.out.println(max2);
		System.out.println(min2);

	}

}
