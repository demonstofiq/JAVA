package Controlflow;

import java.util.Scanner;
class calculator{
	int num1,num2;
	calculator(){
		
	}
	calculator(int a,int b){
		num1=a;
		num2=b;
	}
}

public class Switchdemo {

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ente first number:");
		a=sc.nextInt();
		System.out.println("Enter second  number:");
		b=sc.nextInt();
		
		calculator obj = new calculator(a,b);
	    System.out.println("Enter the choice[+,-,*,/,%]");
	    String ch;
	    ch=sc.next();
	    char array[]=ch.toCharArray();
		switch(array[0])
		{
		case '+':System.out.println("Addition is:"+(obj.num1+obj.num2));
		break;
		case '-':System.out.println("Substraction is:"+(obj.num1-obj.num2));
		break;
		case '*':System.out.println("Multiplication is:"+(obj.num1*obj.num2));
		break;
		case '/':System.out.println("Division is:"+(obj.num1/obj.num2));
		break;
		case '%':System.out.println("Modulus is:"+(obj.num1%obj.num2));
		break;
		
		default:System.out.println("OOPS!!!!!Please enter Correct option");
		break;
		}
		
		
		
	}

}
