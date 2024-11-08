package ConstructorDemo;

public class Student {
	int id;
	String name;
	int age;
	
	Student(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
	void display()
	{
		System.out.println("Id:"+id+" "+"Name:"+name+"Age:"+age);
	}

	public static void main(String[] args) {
		
		Student s1=new Student(101,"Ashish",20);
		Student s2=new Student(102,"Pratiksha",20);
		Student s3=new Student(103,"Tejshri",20);
		s1.display();
		s2.display();
		s3.display();
	}
}
