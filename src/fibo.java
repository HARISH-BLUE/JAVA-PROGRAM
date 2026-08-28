import java.util.Scanner;
public class fibo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=0;
        int f=0;
        int s=1;
        System.out.print(0+" ");
        for(int i=1;i<n;i++){
            res=f+s;
            System.out.print(s+" ");
            f=s;
            s=res;
        }
        sc.close();
    }
    
}
