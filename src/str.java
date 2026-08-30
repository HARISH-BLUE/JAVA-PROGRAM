import java.util.Scanner;
public class str {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();sc.close();
        for(int i=1;i<=n;i++) {
            for(int j=i;j<=n;j++){
                System.out.print('*');
            }System.out.println();
            
            
        }
         for(int i=n;i>=1;i--) {
            for(int j=i;j<=n;j++){
                System.out.print('*');
            }System.out.println();
            
            
        } 
    }
}