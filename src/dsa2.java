import java.util.Scanner;
import java.util.Arrays;
public class dsa2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        String s = String.valueOf(n);
        char[] digits = s.toCharArray();
        Arrays.sort(digits);
        int result = Integer.parseInt(new String(digits));
        System.out.println(result);
    }    
}
