package Oct.ex_16102024;

public class Lab020 {
    public static void main(String[] args) {
        int Marks = 90;
       String Grade = (Marks >= 90) ? "Grade A" :  (Marks >=80) ? "Grade B" : (Marks >=70) ? "Grade C" : (Marks >=60) ? "Grade D" : (Marks <= 50) ? "Declare Fail" : "NA";
        System.out.printf("Result is %s ",Grade);
        //System.out.println("Result is "+ Grade);
    }
}
