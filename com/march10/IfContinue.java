package com.march10;

public class IfContinue {

	public static void main(String[] args) {
		
		for(int x=1; x<=20; x++) {
			
			if(x%3==0) {
				continue;
			}
			System.out.println(x);
		}

	}

}
