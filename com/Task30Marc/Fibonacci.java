package com.Task30Marc;

public class Fibonacci {

	public static void main(String[] args) {
		int x = 1, y = 15, t1 = 3, t2 = 4;
        System.out.print("First " + y + " num : ");

        while (x <= y)
        {
            System.out.print(t1 + " + ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;

            x++;
        }
	}

}
