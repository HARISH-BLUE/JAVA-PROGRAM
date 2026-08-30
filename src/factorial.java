import java.util.Scanner;
public class factorial {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        String s=String.valueOf(num);
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!='0' && arr[i]!='1'){
                System.out.print("error");
                return;
            }
            else if(arr[i]=='0'){
                arr[i]='1';
            }else {
                arr[i]='0';
            }
        }for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        
    }
    
}
