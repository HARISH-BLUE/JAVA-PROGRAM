import java.util.*;
public class employee {
    public static void main(String[] args){
        HashMap<Integer,String> emp=new HashMap<>();
        emp.put(101,"aakash");
        emp.put(102,"amar");
        emp.put(103,"richard");
        emp.put(104,"sachin");
        System.out.println(emp);
        System.out.println(emp.get(102));
        System.out.println(emp.containsKey(102));
        System.out.println(emp.containsValue("amar"));
        emp.remove(101);
        System.out.println(emp);
        System.out.println(emp.size());

    }
}
