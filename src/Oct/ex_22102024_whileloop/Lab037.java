package Oct.ex_22102024_whileloop;

import java.util.Scanner;

public class Lab037 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number till you want to check even or odd");
        int num = scanner.nextInt();

        int i =1;
        while (i<=num)
        {
            if (i % 2 == 0 )
            {
                System.out.println(i+ "\n Even no");
            }
            else
            {
                System.out.println(i+ " \n No is odd");
            }


            i++;
        }


    }
}
