package Oct.ex_16102024;

import java.util.Scanner;

public class Lab023 {
    public static void main(String[] args) {
        // Take input as name , age , salary and print them in last
         Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Name \n");
        String Name = scanner.next();

        System.out.println("Enter the Age \n");
        int Age = scanner.nextInt();

        System.out.println("Enter the Salary \n");
        int Salary = scanner.nextInt();

        scanner.close();

        System.out.println(Name + Age + Salary);
    }

}
