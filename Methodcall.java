package MethodDemo;

public class Methodcall {
	void modulus(int a,int b)
	{
		System.out.println(a*b);
	}
	int modulus1(int a, int b)
	{
		return a*b;
	}
	 public static void main(String[] args) {
		 Methodcall obj = new Methodcall();
		 obj.modulus(23, 220);
		 System.out.println(obj.modulus1(3, 4));
		 
		 
	 }

		
	
	

}
