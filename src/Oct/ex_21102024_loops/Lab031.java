package Oct.ex_21102024_loops;

public class Lab031 {
    public static void main(String[] args)
    {
       int n=10;
        for ( int i = 1; i <= n; i++)
        {
            if (n % i  == 0)//remainder zero  aayega woh answer hai
                System.out.println( i);
        }
        //System.out.println("No is odd" );
    }
}
