package Oct.ex_16102024;

import java.util.Scanner;

public class Lab024 {
    public static void main(String[] args) {
        //Take a user input 2 numbers from the arguments and calculate the maximum in
        // between with ternary operator.

        int Number1 =   Integer.parseInt(args[0]);
        int Number2 =   Integer.parseInt(args[1]);
        System.out.println(Number1 > Number2 ? "Number1 is Greater" : "Number2 is Greater");


    }
}
