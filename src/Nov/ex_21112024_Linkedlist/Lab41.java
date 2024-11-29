package Nov.ex_21112024_Linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Lab41 {
    public static void main(String[] args) {
        List mylist = new LinkedList();
        mylist.add("Shrilesh Shete");
        mylist.add("Pravin Shete");
        mylist.add("Pranali Shete");
        System.out.println(mylist);

        ArrayList mylist1 = new ArrayList();
        mylist1.add("Shrilesh Shete");
        mylist1.add("Pravin Shete");
        mylist1.add("Pranali Shete");
        System.out.println(mylist1);

        // The only difference in array list and linked list is that the difference of
        // storage array lisy stored squentially and linked list stored randomly.
    }
}
