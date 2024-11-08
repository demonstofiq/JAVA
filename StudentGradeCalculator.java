package Controlflow;

import java.util.Scanner;



public class StudentGradeCalculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
//        System.out.print("Enter student's name: ");
//        String name = scanner.nextLine();

//        int[] marks = new int[5];
//        int total = 0;
//
//       
//        for (int i = 0; i < 5; i++) {
//            System.out.print("Enter marks for subject " + (i + 1) + ": ");
//            marks[i] = scanner.nextInt();
//            total += marks[i];
//        }
//
//        
//        double average = total / 5.0;

        System.out.print("Enter student's name: ");
        String name1 = scanner.nextLine();

        // Taking marks for each subject separately
        System.out.print("Enter marks for subject 1: ");
        int mark1 = scanner.nextInt();

        System.out.print("Enter marks for subject 2: ");
        int mark2 = scanner.nextInt();

        System.out.print("Enter marks for subject 3: ");
        int mark3 = scanner.nextInt();

        System.out.print("Enter marks for subject 4: ");
        int mark4 = scanner.nextInt();

        System.out.print("Enter marks for subject 5: ");
        int mark5 = scanner.nextInt();

        // Calculating total and average
        int total = mark1 + mark2 + mark3 + mark4 + mark5;
        double average = total / 5.0;
        
        
        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        
        System.out.println("\nStudent Name: " + name1);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);
        
        scanner.close();
    }
}
