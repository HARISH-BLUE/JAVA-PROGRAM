import java.util.Scanner;
public class repeat {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("target");
        int target=sc.nextInt();
        int count=0;
        for(int i=0;i<n-1;i++){
            for(int j=1;j<n;j++){
                if(target==arr[i]+arr[j]){
                    System.out.println(arr[i]+" "+arr[j]);
                    count++;
                }
            
            }
        }System.out.println(count+" ways");
        sc.close();
    }    
}
