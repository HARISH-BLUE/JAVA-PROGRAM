import java.util.*;
public class dry {
    public static void main(String[] args){
        HashSet<Character> student=new HashSet<>();
        String s="mississippi";
        String arr[]=s.split("");
        for(int i=0;i<arr.length;i++){
            student.add(arr[i].charAt(0));
        }
        System.out.println(student);
        System.out.println(student.size());
        System.out.println(student.contains("m"));
        student.remove("p");
        System.out.println(student);


    }    
}
