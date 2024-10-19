package Oct.ex_18102024_Switch;

import java.util.Scanner;

public class Lab028 {
    public static void main(String[] args) {
        //Write a program that takes an integer input (1-12)
        // and prints the name of the corresponding month using a switch statement.
            //    Input  - 12
        //Out - Dec.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value");
        int Value = scanner.nextInt();

        switch (Value)
        {
            case 1 :
            System.out.println("Month is January");
            break;

            case 2 :
                System.out.println("Month is February");
                break;

            case 3 :
                System.out.println("Month is March");
                break;
        }
    }
}
