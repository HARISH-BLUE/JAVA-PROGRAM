import java.util.Scanner;

public class sco{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int same = -1;
        outerLoop:
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    same = arr[i];
                    break outerLoop; // exits both loops
                }
            }
        }
        
        System.out.print(same);
        sc.close();
    }
}
