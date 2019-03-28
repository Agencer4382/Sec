package com.march9class;

public class task3 {

	public static void main(String[] args) {
	/*boolean variable workDay and assing true
	 * create int assing 1
	 * as long as it is workDay print-->"I need a day off" and increment day
	 * day once day is 6-->your condition for your loop should become false
	 */

		boolean workDay=true;
		int a=7;
		while(workDay) {
			if(a < 6) {
			System.out.println("I need day off");
			a++;
			}
			else {
				System.out.println("this is not work day");
				workDay=false;
				
			}
				
			
		}
		
		
	}

}
