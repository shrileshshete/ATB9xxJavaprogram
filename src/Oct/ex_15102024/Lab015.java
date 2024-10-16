package Oct.ex_15102024;

public class Lab015 {
    public static void main(String[] args) {
        int A= 14;
        int B = 10;
        int C = 99;
                      //Ternary operator
        //result = condition ? exp1: exp2 ;
       int result = (A>B && A>C) ? A : (B>C) ? B : C;
        System.out.printf("The Largest no is %d",result);
    }
}
