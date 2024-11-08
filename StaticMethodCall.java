package MethodDemo;

public class StaticMethodCall {
	               //static method can call directly without creating object
		static void display()
		{
			System.out.println("I am Tofiq");
		}
		
		static void display(int a)
		{
			System.out.println("hey  "+a);
		}
		
		static void display(int x,float y)
		{
			System.out.println(y/x);
		}
		
		static void dispaly(int x,int y)
		{
			System.out.println(x+y);
		}

		public static void main(String[] args) {
			display();
			display(8);
			display(12,67.9f);
			display(2,45);
			
			
		}


}
