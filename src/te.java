import java.util.*;
public class te {
    public static void main(String[] args){
        HashSet<String>stu=new HashSet<>();
        stu.add("sudarson");
        stu.add("vishnu");
        stu.add("vibav");
        stu.add("vishnu");
        stu.add("aakash");
        stu.add(" ");
        System.out.println(stu);
        System.out.println(stu.size());
        System.out.println(stu.contains("vibav"));
        stu.remove("aakash");
        System.out.println(stu);

    }
}
