import java.util.Scanner;
public class fibonic {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f=0;
        int l=1;
        int s=0;
        for(int i=0;i<n;i++){
            System.out.print(f+" ");
            s=l+f;
            f=l;
            l=s;
        }sc.close();
    }    
}
