import java.util.*;
public class que {
    public static void main(String[] args){
        Queue<String>stu=new LinkedList<>();
        stu.add("harish");
        stu.add("sudar");
        stu.add("mano");
        stu.add("maadu");
        stu.add("son");
        System.out.println(stu);
        System.out.println(stu.poll());
        System.out.println(stu);
        stu.remove("maadu");
        System.out.println(stu);
        System.out.println(stu.size());

    }
}
