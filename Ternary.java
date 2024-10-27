package operators;

import java.util.Scanner;

public class Ternary {

	public static void main(String[] args) {
	
	 // taking input
		Scanner SC =  new Scanner(System.in);
		System.out.println("Enter your Marks ");
		Double marks = SC.nextDouble();
		String result = (marks>=50)?"pass":"fail";
		System.out.println("You are " + result );
		
		
	}

}
