package Nov.ex_21112024_Linkedlist;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class lab43_SET {
    public static void main(String[] args) {
        Set hs = new HashSet();


        hs.add("Shri");
        hs.add("shri");
        hs.add("Shri");
        hs.add("Shree");
        System.out.println(hs);
        // hash set  will store element randomly . duplicate not allowed.
        // in hash set no order will follow .

        Set lhs = new LinkedHashSet();
// this will store element in order. No duplicate alowed.
        lhs.add("Shri");
        lhs.add("shri");
        lhs.add("Shri");
        lhs.add("Shree");
        System.out.println(lhs);

        Set ts = new TreeSet();

        ts.add("Shri");
        ts.add("shri");
        ts.add("Shri");
        ts.add("Shree");
        System.out.println(ts);

        // this will follow order natural sorting is done (alphabhetically). duplicate not allowed.




    }
}
