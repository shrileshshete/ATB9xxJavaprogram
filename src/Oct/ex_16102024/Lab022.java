package Oct.ex_16102024;

import java.util.Scanner;

public class Lab022 {
    public static void main(String[] args) {
        //Scanner Class

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age \n");
        int age = scanner.nextInt();
        System.out.println(age > 25 ? "Allowed" : "Not Allowed");

        scanner.close();
    }
}
