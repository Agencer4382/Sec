package com.march3;

import java.util.Scanner;

public class switch2 {

	public static void main(String[] args) {
		// prompt user to enter their country
		// based on contry....specify favorite food

		String country;
		String food;

		Scanner kevin = new Scanner(System.in);
		System.out.println("enter your country");
		country = kevin.nextLine();

		switch (country) {
		case "usa":
			food = "burger";
			break;
		case "turkey":
			food = "baklava";
			break;

		case "afgan":
			food = "chicken";
			break;
			default :
				food="unknown";
				

		}
System.out.println("your food is "+food);
	}

}
