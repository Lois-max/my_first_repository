package org.amalitech.classcode_12122019;

public class Classcode_12122019 {
	
	/**
	 * @param args
	 */
	public static void main (String args[]) {
		
		//Scanner
		
		//Finding the sum of all numbers between 1 and 200
		
		int x, y, z;
		x = 1;
		y = 200;
		z = 2;
		
		int tot;
		
		//Initializing
		tot = (x + y) * (y / z);
		
	    String pre="The sum of numbers between x and y = ";
		
		System.out.println(pre + tot);
		
		//Creating a dynamic string
		String pre_formatted = String.format(pre,x,y);
		System.out.println(pre_formatted + tot);
	}

}
