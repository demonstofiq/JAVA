package ConstructorDemo;

public class ParameterisedConstrctr {
	       //Constructor will accept the value
		String Language;       //instance var
		ParameterisedConstrctr(String Language)        //language Local var
		{
			this.Language=Language;
			System.out.println(Language+" is a "+"Programming Language");
		}
		
		public static void main(String[] args) {
			ParameterisedConstrctr L1=new ParameterisedConstrctr("Java");
			ParameterisedConstrctr L2=new ParameterisedConstrctr("Python");
			ParameterisedConstrctr L3=new ParameterisedConstrctr("C++");

}
}



