package day7;

import java.util.Scanner;

public class warmup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner lol = new Scanner(System.in);
		int mike = 21;
		int tim = 23;
		int mo = 45;
		int pop = 1;
		int yo = 3;
		int up = 0;
		int no = 4;
		String name = "";
		
		
		//sysout this is addition
		System.out.println("Hello whats your name?");
		name = lol.next();
		System.out.println("Here is a personal caculator but here we go starting with Addition");
		System.out.println("enter a number");
		mike = lol.nextInt();
		System.out.println("eneter a number");
		tim = lol.nextInt();
		System.out.println("caculating...");
		pop = mike + tim;
		System.out.println(pop);
		
		//sysout the difference
		System.out.println("alright " + name +" we  finna do subtraction");
		
		System.out.println("enter a number");
		mike = lol.nextInt();
		System.out.println("enter a number");
		tim = lol.nextInt();
		System.out.println("caculating......");
		mo = mike - tim;
		System.out.println(mo);
		
		//sysout the multiplication
		System.out.println("we finna do multiplication " + name );
		
		System.out.println("enter a number");
		mike = lol.nextInt();
		System.out.println("enter a number");
		tim = lol.nextInt();
		System.out.println("caculating.... here is your answer " + name );
		yo = mike * tim;
		System.out.println(yo);
		
		//sysout the quotient 
		System.out.println("Last one " + name + " !!!");
		
		System.out.println("enter a number");
		mike = lol.nextInt();
		System.out.println("enter a number");
		tim = lol.nextInt();
		System.out.println("uhhh caculating..... the answer for you "+ name);
		no = mike/tim;
		System.out.println(no);
		
		System.out.println("thank you " + name + " for the cooperation and have a nice day ;)");
		
		lol.close();
		
		
		

	}

}