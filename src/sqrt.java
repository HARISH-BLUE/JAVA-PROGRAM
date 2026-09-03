import java.util.Scanner;
public class sqrt {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        double n=sc.nextDouble();
        double result=Math.sqrt(n);
        System.out.println("Square root of "+n+" is "+result);
        sc.close();
    }
}
