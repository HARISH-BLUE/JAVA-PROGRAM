import java.util.Scanner;
public class n {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char[] arr=s.toCharArray();
        int max1=1;
        char v=arr[0];
        char v1=v;
        int max2=1;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j] && arr[i]!='0'){
                    max1++;
                    arr[j]='0';
                }
            }if(max2<max1){
                max2=max1;
                max1=0;
                v1=v;
                v=arr[i];
            }
        }System.out.print(v1);
    }
    
}
