import java.util.Scanner;
public class passcode {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        sc.close();
        String s=String.valueOf(n1)+String.valueOf(n2);
        int n=Integer.parseInt(s);
        System.out.print(n);
        
    }    
}
