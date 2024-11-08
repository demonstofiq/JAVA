package Lab3;
import java.util.Scanner;


public class perimeter {
	
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int choice;

	        do {
	        System.out.println("Choose an option to calculate the perimeter:");
	            System.out.println("1. Square");
	            System.out.println("2. Rectangle");
	            System.out.println("3. Circle");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            
	            choice = scanner.nextInt();

	            switch (choice) {
	            
	                case 1 -> {
	                    System.out.print("Enter the side length of the square: ");
	                    double side = scanner.nextDouble();
	                    System.out.println("Perimeter of the square: " + (4 * side));
	                }
	                
	                case 2 -> {
	                    System.out.print("Enter the length of the rectangle: ");
	                    double length = scanner.nextDouble();
	                    System.out.print("Enter the width of the rectangle: ");
	                    double width = scanner.nextDouble();
	                   
	                   System.out.println("Perimeter of the rectangle: " + (2 * (length + width)));
	                }
	                
	                
	                case 3 -> {
	                    System.out.print("Enter the radius of the circle: ");
	                    double radius = scanner.nextDouble();
	                    System.out.println("Perimeter of the circle: " + (2 * Math.PI * radius));
	                }
	                
	                case 4 -> System.out.println("Exiting the program.");
	                
	                
	                default -> System.out.println("Invalid choice. Please try again.");
	            }
	            System.out.println(); 
	        } while (choice != 4);

	       
	    }
	}



