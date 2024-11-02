package Oct.ex_29102024_Arrays;

public class Lab038 {
    public static void main(String[] args) {
        int[] marks = {71,87,92,67,71}; //arrays creation using pre defined elements
        System.out.println(marks[0]);
        System.out.println(marks[3]);
        System.out.println(marks.length); // Length is always starts from 1


        // If we dont have pre defined elements then we create arrays using new operator.

        int score [] = new int[6];
        System.out.println(score.length);
        score [0]=14;
        score [1]=11;
        score [2]=10;
        System.out.println(score[0]);
        System.out.println(score[1]);
    }
}
