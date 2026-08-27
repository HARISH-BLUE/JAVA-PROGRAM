import java.util.*;
public class li {
    public static void main(String[] args){
        /*LinkedHashSet<String>city=new LinkedHashSet<>();
        city.add("new york");
        city.add("berlin");
        city.add("tokyo");
        city.add("nirobi");
        city.add("denver");
        city.add("new york");
        System.out.println(city);
        city.remove("denver");
        System.out.println(city);
        System.out.println(city.size());*/
        LinkedHashSet<Integer>age=new LinkedHashSet<>();
        age.add(10);
        age.add(20);
        age.add(12);
        age.add(33);
        age.add(34);
        age.add(55);
        age.add(12);
        System.out.println(age);
        System.out.println(age.size());
        System.out.println(age.contains(33));
        age.remove(12);
        System.out.println(age);
        System.out.println(age.size());

    }
    
}
