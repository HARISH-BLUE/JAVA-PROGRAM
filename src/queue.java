import java.util.*;
public class queue {
    public static void main(String[] args){
        ArrayList<String> stu=new ArrayList<>();
        stu.add("Aakash");
        stu.add("Sudarson");
        stu.add("chupuni");
        stu.add("amar");
        stu.add("anusha");
        System.out.println(stu);
        stu.remove("amar");
        System.out.println(stu);
        System.out.println(stu.contains("Sudarson"));
    }
}
