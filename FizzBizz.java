 package day8;

public class FizzBizz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for (int x=1 ; x<=100; x ++) {
		System.out.println(x);
	
		if (x % 3 == 0 ) { 
			System.out.println("fizz");
			
		}else if ( x % 5 == 0) { 
			System.out.println("buzz");
			
		}else if (x%3 == 0 && x%5 == 0) {
			System.out.println("fizzbuzz");
		}
		
		}	
	}
}
