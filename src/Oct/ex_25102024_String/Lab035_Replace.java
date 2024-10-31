package Oct.ex_25102024_String;

public class Lab035_Replace {
    public static void main(String[] args) {
        String Name = " shrilesh shete";
        String result = Name.replace('s','S');
        System.out.println(result);

        String Name1 = " shrilesh123 shete345"; // regex support only replaceAll
        String result1 = Name.replaceAll("\\d"," ");
        String result2 = Name.replace('s','S');
        System.out.println(result1);
        System.out.println(result2);
    }
}
