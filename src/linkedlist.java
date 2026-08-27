import java.util.*;
public class linkedlist {
    public static void main(String[] args){
        LinkedList<String>students=new LinkedList<>();
        students.add("darkash");
        students.add("dhikash");
        students.add("aakaran");
        System.out.println("initial List:"+students);
        students.addFirst("vijay");
        students.addLast("dinkash");
        System.out.println("After addFirst and addLast:"+students);
        students.removeFirst();
        System.out.println("After removeFirst:"+students);
        students.set(2,"krikash");
        
    }    
}
