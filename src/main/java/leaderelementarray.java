import java.util.Scanner;
public class leaderelementarray {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int leader=arr[n-1];
        System.out.print(leader+" ");
        for(int i=n-2;i>=0;i--){
            if(arr[i]>leader){
                leader=arr[i];
                System.out.print(leader+" ");
            } 
        }sc.close();
    }   
}
