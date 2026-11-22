import java.util.Scanner;
public class sandclock {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0){
            n-=1;
        }
        sc.close();
        int val=n/2;
        int key=0;
        for(int i=n;i>=1;i--){
            if(i%2!=0){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }System.out.println();
                
                while(key<val){
                    key++;
                    for(int k=1;k<=key;k++){
                        System.out.print(" ");
                    }break;
                }
            }
        }key=key;
        for(int i=3;i<=n;i++){
            if(i%2!=0){
                while(key>=0){
                    key--;
                    for(int j=1;j<=key;j++){
                        System.out.print(" ");
                    }break;
                }for(int k=1;k<=i;k++){
                    System.out.print("*");
                }System.out.println();
            }
        }
    }
}
