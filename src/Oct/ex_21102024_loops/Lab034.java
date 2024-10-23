package Oct.ex_21102024_loops;

import java.util.Scanner;

public class Lab034 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many numbers you want to check: ");
        int num = scanner.nextInt();

        for(int i = 1 ; i<=num ; i++)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number " + i + ": ");
            int number = sc.nextInt();


            if (number % 2 == 0 )
            {
                System.out.println(number+"Even No");
            }
            else
            {
                System.out.println(number+"Odd No");
            }
        }
    }
}
