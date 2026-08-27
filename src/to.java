import java.util.ArrayList;
public class to {
    public static void main(String[] args){
        ArrayList<String>stu=new ArrayList<>();
        stu.add("sudarson");
        stu.add("chappuni");
        stu.add("harish");
        stu.add("manguni");
        stu.add("panguni");
        System.out.println(stu);
        System.out.println(stu.size());
        stu.remove("chappuni");
        System.out.println(stu);
        System.out.println(stu.size());
        System.out.println(stu.contains("panguni"));
    }    
}
