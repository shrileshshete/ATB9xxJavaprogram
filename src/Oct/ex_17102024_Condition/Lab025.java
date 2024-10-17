package Oct.ex_17102024_Condition;

import java.util.Scanner;

public class Lab025 {
    public static void main(String[] args) {
        //Write a program that calculates and displays the letter grade
        //// for a given numerical score (e.g., A, B, C, D, or F)
        //// based on the following grading scale:
        ////
        ////A: 90-100
        ////B: 80-89
        ////C: 70-79
        ////D: 60-69
        ////F: 0-59

        //int marks = 86;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks = scanner.nextInt();

        if (marks >= 90 )
        {
            System.out.println("Grade A");
        }
        else if ( marks >=80)
        {
            System.out.println("Grade B");
        }
        else if ( marks >= 70)
        {
            System.out.println("Grade C");
        }
        else if ( marks >= 60)
        {
            System.out.println("Grade D");
        }
        else if ( marks >= 0)
        {
            System.out.println("Grade F");
        }
System.out.println("Congratulations Yor are passed!");
    }
}
