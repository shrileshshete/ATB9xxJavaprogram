package Oct.ex_18102024_Switch;

import java.util.Scanner;

public class Lab027 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the function");
        String Calc = scanner.next();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Values");
        int Num1 = sc.nextInt();
        int Num2 = sc.nextInt();

        switch (Calc)
        {
            case "Addition" :

                int Num = ( Num1+Num2 );
                System.out.println("Addition is \n" + Num );
                break;

            case "Subtraction" :

                int Value = ( Num1-Num2 );
                System.out.println("Subtraction is \n" + Value );
                break;

            case "Multiplication" :

                int Mul = ( Num1*Num2 );
                System.out.println("Multiplication is \n" + Mul );
                break;

            case "Division" :

                int Divi = ( Num1/Num2 );
                System.out.println("Division is \n" + Divi );
                break;

            case "Modulous" :

                int Mod = ( Num1%Num2 );
                System.out.println("Modulous is \n" + Mod );
                break;

            case "Default" :

                //int Num = ( Num1-Num2 );
                System.out.println("NA");
                break;
        }
    }
}
