import java.util.Scanner;
public class array{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        for(String arr1:arr){
            System.out.print(arr1+" ");
        }
        sc.close();

    }
}