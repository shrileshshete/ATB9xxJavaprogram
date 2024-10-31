package Oct.ex_23102024_Functions;

public class Lab037 {
    public static void main(String[] args) {
        // To execute same code of block for repetitive time we call fuction..
        // Function are of two types built in functions and user defined functions
        //built in function are math.max,println,main ,math.min etc.
        //user defined function are given below..
        //**User Defined Functions.**
        //1. Without Parameters and Without Return Type.
        // 2. Without Parameters but With Return Type
        // 3. With Parameters and Without Return Type
        // 4. With Parameters and With Return Type
        //function should always write outside the main


                //1. Without Parameters/argument and Without Return Type.
            greet(); // calling function

               // 2. Without Parameters but With Return Type
                String Name = greet1(); // calling function greet1
                System.out.println(Name);

                // 3. With Parameters and Without Return Type
                greet2("Shrilesh"); // here no return type like string int

                  // 4. With Parameters and With Return Type
                     int result = sum (10, 10);
                    System.out.println("Sum is: " + result );


}
              //1. Without Parameters and Without Return Type.
              // Define function
              static void greet()
                {
                  System.out.println("Happy Diwali");
                }


                // 2. Without Parameters but With Return Type
                //here return type is string and paramenters are empty.

                static String greet1 ()
                 {
                     return "Wish you a very Happy Diwali ";
                 }

                  // 3. With Parameters and Without Return Type
                    static void greet2(String Name)
                    {
                        System.out.println("Wish you a very Happy Diwali " + Name);
                    }

                    // 4. With Parameters and With Return Type
                        static int sum( int a , int b)
                        {
                            return a+b ;
                        }


    }