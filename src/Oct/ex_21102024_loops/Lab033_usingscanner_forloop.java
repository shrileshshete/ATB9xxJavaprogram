package Oct.ex_21102024_loops;

import java.util.Scanner;

public class Lab033_usingscanner_forloop {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number till you want to check even or odd");
        int Num = scanner.nextInt();

        for(int i = 1 ; i<=Num ; i++)
        {

            if(i % 2 == 0 )
            {
                System.out.println(i + "is an Even No.");
            }
            else
            {
                System.out.println(i + "is an odd number.");
            }
        }





    }
}
