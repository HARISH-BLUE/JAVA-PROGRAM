import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Enter the number of elements (at least 1): ");
            while (!sc.hasNextInt()) {
                System.out.println("Please enter a whole number.");
                sc.next();
            }
            n = sc.nextInt();
        } while (n < 1);

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.next();
        }

        System.out.println("\nElements with indexes:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("[" + i + "] " + arr[i]);
        }

        String[] sorted = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sorted, String.CASE_INSENSITIVE_ORDER);
        System.out.println("\nSorted array: " + Arrays.toString(sorted));

        System.out.print("Reversed array: [");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        sc.close();
    }
}