import java.util.Scanner;
public class binarysearch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int left=0;
        int right=arr.length-1;
        boolean found=true;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target){
                System.out.println("target fount"+mid);
                found=false;
                break;
            }else if(target>arr[mid]){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }if(found){
            System.out.print("not found");
        }

    }    
}