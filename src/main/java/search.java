import java.util.Scanner;
public class search {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter value");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }System.out.println("target:");
        int target=sc.nextInt();
        int found=-100;
        for(int i=0;i<size;i++){
            if(arr[i]==target){
                found=i;
                break;
            }
            
        }if(found!=-100){
            System.out.println("the value found at : "+found);
        }else{
            System.out.println("the value is not found");
        }
        
        sc.close();
    }
}