package Oct.ex_24102024;

import java.util.Scanner;

public class Lab40_22oct_task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Input");
        int Num = scanner.nextInt();
        int reverse = 0 ;

        for (; Num != 0; Num /= 10)
        {
            int digit = Num % 10;
            reverse = reverse * 10 + digit;
        }
            System.out.println("Reverse string is"+ reverse);


    }
}
