package MethodDemo;

public class DiffReturn {
	void main()
	{
		System.out.println("hELLO WORLD ");
	}
	int main(int a)
	{
		return a/2;
	}
	String main(String a,String b)
	{
		return a.concat(b);
	}
    float main(float x,float y,float z)
{
	return x*y*z;
}
	public static void main(String[] args) {
		DiffReturn obj=new DiffReturn();
		obj.main();
		System.out.println(obj.main(50));
		System.out.println(obj.main("Good", "Afternoon"));
		System.out.println(obj.main(12.4f, 34.6f,78.1f));

	}


}
