package Oct.ex_25102024_String;

public class Lab036_String_buffer_and_builder {
    public static void main(String[] args) {
        StringBuffer Name = new StringBuffer("Shrilesh");
        Name.append("Shete");
        System.out.println(Name);
        //string buffer is thread safe we used this in web automation
        //thread safe means squentially

        StringBuilder Name1= new StringBuilder("Shrielsh");
        Name1.append("Shete");
        System.out.println(Name1);
        //we generally used string builder it is not thread safe

        //  append vs concatenation
     //   append means we can modif strings
        //  In concatenation we just join two strings..
    }
}
