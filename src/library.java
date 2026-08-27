import java.util.*;

public class library { 
    public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList<>();
        
        studentList.add("Aakash");
        studentList.add("amal");
        studentList.add("amar");
        studentList.add("anushka");

        System.out.println("Student list : " + studentList);
        System.out.println("total students : " + studentList.size());
        System.out.println("student at index 2: " + studentList.get(2));

        studentList.set(1, "manoj");
        System.out.println("After update: " + studentList);

        studentList.remove("anushka");
        System.out.println("After removal: " + studentList);
        System.out.println("is aakash present? " + studentList.contains("aakash"));

        System.out.println("\nstudent details");
        for (String student : studentList) {
            System.out.println(student);
        }
    }
}