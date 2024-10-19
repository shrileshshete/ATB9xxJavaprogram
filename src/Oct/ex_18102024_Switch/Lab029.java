package Oct.ex_18102024_Switch;

import java.util.Scanner;

public class Lab029 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("To convert KM to M. Press 1 ");
        System.out.println("To convert D celcius to farenheit Press 2 ");
        //System.out.println("Enter the value");
        int value = scanner.nextInt();

        switch(value)
        {
            case 1 :
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Enter the number");
                int Num = scanner1.nextInt();
                int conversion = Num*1000 ;
                System.out.println("Conversion is" + conversion);
                break;

            case 2 :
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Enter the Degree D ");
                double D = scanner2.nextDouble();
                double F = ( (D * 9/5 ) + 32 );
                System.out.println("Conversion is" + F);
                break;


        }

    }
}
