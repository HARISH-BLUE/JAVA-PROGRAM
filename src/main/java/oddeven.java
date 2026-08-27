import java.util.Scanner;
public class oddeven {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=1;
        while(a<=n){
            if(a%2!=0){
                System.out.println("odd "+a);
            }else{
                System.out.println("even "+a);
            }
            a++;
        }sc.close();
    }
}
