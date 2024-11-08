package Lab3;

public class bankc {
	int acno;
	String atype;
	double amount;
	
	bankc(int acno,String atype,double amount){
		this.acno= acno;
		this.atype=atype;
		this.amount=amount;
		System.out.println("Account number:" + acno );
		System.out.println("Account Type:" + atype );
		System.out.println("Balance:" + amount );
		
		
	}

	public static void main(String[] args) {
		bankc e1 = new bankc(2332,"savings" , 345);
		
		System.out.println();
		
		bankc e2 = new bankc(71036423,"Current" ,8953);
		
		
	}

}
