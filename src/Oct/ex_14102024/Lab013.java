package Oct.ex_14102024;

public class Lab013 {
    public static void main(String[] args) {
        System.out.println("Type Casting");

                //Widening- Implicit , Explicit
        //Narrowing - Implicit and explicit

        System.out.println("Widening");

        byte b =  8;
        int a = b; // Implicit casting - valid
        int a1 = (int)b ; //Explicit casting - Valid

        System.out.println("Narrowing");
        int val = 200;
        //byte b2= val; // Invalid - Implicit
        byte b3 =(byte)val; // explicit - valid
    }
}
