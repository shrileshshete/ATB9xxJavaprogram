package Nov.ex_20112024_List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lab44 {
    public static void main(String[] args) {
        List  mylist = new ArrayList(); // array list is contionous
        List mylist2 = new LinkedList(); // linked list is random.

        List fruits = List.of("Mango","Orange");
        //We cannot use add function in list.
        System.out.println(fruits);

      //  Array list
        //Insetion      - Heavy
        //searching - Easy
          //      Deletion - Heavy

        //Linked list
        //Insetion      - Easy
        //searching - Heavy
        //Deletion - Easy

//List<String> list =  new list();
// <String>  It will restrict user to use only string./.
    }
}
