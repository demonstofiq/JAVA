package ARRAY;

public class animalsarray {

	public static void main(String[] args) {
			// Static way
		String animals[]= {"Lion","Tiger","Cheetah","Dinosaur","Snake","Panther","Zebra","Horse","Rhino","Elephant"};
		System.out.println(animals[1]);
		System.out.println(animals);
			
		for(int  i=0;i<animals.length;i++)
		{
			System.out.println(animals[i]);
		}

//			int num[] = {6,3,7,9,10,15,25};
//			int largestNumber = Math.max(num.length);
//			System.out.println(largestNumber);
	}
}