import java.util.Scanner;
public class matrics {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        for(int i=0;i<=n1;i++){
            System.out.print(i+" ");
            for(int j=0;j<n2;j++){
                System.out.println(j+" ");
            }
        }sc.close();
    }    
}
