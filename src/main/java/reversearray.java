import java.util.Scanner;
public class reversearray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int[num];
        int left=0;
        int right=arr.length-1;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        for(int nums:arr){
            System.out.print(nums +" ");
        }sc.close();
    }
}
