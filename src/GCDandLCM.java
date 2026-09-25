import java.util.Scanner;
public class GCDandLCM {
    public static void main(String[] args){
    
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int num1=a;
        int num2=b;
    while (b != 0) {
        int remainder = a % b;
        a = b;
        b = remainder;
    }
    System.out.println(a);
    int lcm = (num1 / a) * num2;
    System.out.print(lcm);
}

}
