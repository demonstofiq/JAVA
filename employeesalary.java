package Lab3;
class user{
	int id;
	String name;


//public user(int id,String name){
//	this.id=id;
//	this.name=name;
//	}
}

class Employee extends user{
	double salary;	


public Employee(int id,String name,double salary) {
	//super( id,name);
	this.id=id;
	this.name=name;
	this.salary=salary;
}
	

public double calannualsalary(){
	return salary * 12;
}
}


public class employeesalary {

	public static void main(String[] args) {
		Employee emp = new Employee(101,"tofiq",20000);
		

		
		double calcultsalary = emp.calannualsalary();
		
		
		System.out.println("Employee ID: " + emp.id);
        System.out.println("Employee Name: " + emp.name);
        System.out.println("Monthly Salary: " + emp.salary);
        System.out.println("Annual Salary: " + calcultsalary);

	}

}
