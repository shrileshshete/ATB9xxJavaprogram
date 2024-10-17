package Oct.ex_17102024_Condition;

import java.util.Scanner;

public class Lab026 {
    public static void main(String[] args) {
        //Write a program that classifies a triangle based on its side lengths.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the values of triange");
        int A = scanner.nextInt(), B= scanner.nextInt(), C= scanner.nextInt();

        if (A == B && B == C && A == C)
        {
            System.out.println("Triangle is euilateral triangle");
        }
        else if (A == B || A == C || B == C)
        {
            System.out.println("Triangle is Isoceles triangle");
        }
        else
        {
            System.out.println("Triangle is Scalene triangle");
        }

    }
}
