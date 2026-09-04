import java.util.Scanner;

public class news {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.print(add(n));
    }

    public static int add(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + add(n - 1);
        }
    }
}
