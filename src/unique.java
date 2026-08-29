import java.util.*;
public class unique {
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // Replace your line 10 with these three lines:
        for (int val : hell(arr)) {
           System.out.print(val + " ");
        }sc.close();
    }

     }
     public static int[] hell(int num[]){
        int left=0;
        int right=num.length-1;
        while(left<right){
            int temp=num[left];
            num[left]=num[right];
            num[right]=temp;
            left++;
            right--;
        }return num;
        
     }
}
