import java.util.Scanner;

public class recurtion {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        hell(n,1);
    } 
    public static void hell(int n,int a){
        if(a>n){
            return;
        }
        System.out.print(a+" ");
        hell(n,a+1);
    }
}