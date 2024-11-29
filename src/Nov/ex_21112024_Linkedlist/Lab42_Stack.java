package Nov.ex_21112024_Linkedlist;

import java.util.Stack;

public class Lab42_Stack {
    public static void main(String[] args) {
        Stack books = new Stack();
        books.add("History");
        books.add("Maths");
        books.add("English");
        System.out.println(books);

        Stack s = new Stack();
        s.push("His");
        s.push("Mat");
        s.push("Eng");
        System.out.println(s);

        s.add("GK");
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.peek()); // peek means extracting top element here top elemet starts from bottom.
        System.out.println(s);
        System.out.println(s.pop()); // pop means remove the element from the top.
        System.out.println(s);
        // add and push is same in both case element will add at the top.

        s.add(0,"shri"); // using this index element we can add anything at the bottom.
        System.out.println(s);
        System.out.println(s.get(1)); // it will extract element from index 1 or positon 1.




    }
}
