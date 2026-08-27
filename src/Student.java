import java.util.*;

public class Student { 
    public static void main(String[] args) {
        
        ArrayList<String> bookList = new ArrayList<>();

        bookList.add("Java Programming");
        bookList.add("Data Structures");
        bookList.add("Algorithms");
        bookList.add("Database Systems");
        bookList.add("Operating Systems");
        bookList.add("Software Engineering");

        System.out.println("Book list:");
        for (String book : bookList) {
            System.out.println(book);
        }

        System.out.println("\nTotal books: " + bookList.size());
        System.out.println("Book at index 3: " + bookList.get(3));

        bookList.set(2, "Advanced Algorithms");
        System.out.println("\nAfter update: " + bookList);

        bookList.remove("Database Systems");
        System.out.println("After removal: " + bookList);

        if (bookList.contains("java")) {
            System.out.println("\n'java' book exists.");
        } else {
            System.out.println("\n'java' book does not exist.");
        }
    }
}