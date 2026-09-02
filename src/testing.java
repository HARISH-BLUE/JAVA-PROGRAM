import java.util.Scanner;
public class testing {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        // only for 2 dig concat
        System.out.print(n1*100+n2);
        sc.close();
    }    
}
