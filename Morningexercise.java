package day9;

import java.util.Scanner;

public class Morningexercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter a number ");
		Scanner mack = new Scanner(System.in); 
		int tip = mack.nextInt();
		
		for (int x = tip; x <=100; x++) { 
			
			 if (tip > 50) {
				 System.out.println(x);
			 }
			 
			}

	}	
}