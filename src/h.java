import java.util.Scanner;
public class h {
    public static int hell(int n){
        int s=0;
        while(n>0){
            int t=n%10;
            s+=t;
            n/=10;
        }
        return s;
    } 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>9){
            n=hell(n);
        }System.out.print(n);
    }   
}
