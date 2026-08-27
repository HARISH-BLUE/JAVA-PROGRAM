import java.util.*;
public class dummy {
    public static void main(String[] args){
        TreeMap<Integer,String> stu=new TreeMap<>();
        stu.put(101,"chupuni");
        stu.put(105,"chappini");
        stu.put(106,"manguni");
        stu.put(103,"janguni");
        stu.put(102,"panguni");
        System.out.println(stu);
        System.out.println(stu.get(103));
        System.out.println(stu.containsKey(104));
        System.out.println(stu.containsValue("pangu"));
        System.out.println(stu.keySet());
        System.out.println(stu.values());
        System.out.println("entries");
        for(Map.Entry<Integer,String> entry:stu.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }stu.remove(103);
        System.out.println(stu);
        System.out.println(stu.size());
        stu.clear();
        System.out.println(stu);
    }
}
