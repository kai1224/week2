package day9;

import java.util.Scanner;

public class icecream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ice = new Scanner(System.in);
		int no = 5;
		int yes = 10;
		int maybe = 15;
		int age = 20;
		String color = "";
		
		String name = "";

		System.out.println(" Hi ! our names is Kai Kya and Nya we are known as Ice Cream and this is our program so What's your name? ");
		name = ice.next();
		
		
		System.out.println("So i know we'er different ages but I was wondering whats your age? ");
		age = ice.nextInt();
		
		System.out.println("Alright we have your name and age so we have one more question and that question is what is your favorite color?");
		color = ice.next();
		
		System.out.println("Okay we have everything so your name is " + name + " and your age is " + age + " and last thing your favorite color is " + color + " Am i right let me know if im wrong " );
		ice.next();
		
		System.out.println(" welcome to this caculator " + name );
		ice.next();	
		
		
		
		
		
	}

}
