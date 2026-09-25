import java.util.*;
class nonrepeatingchar{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char[] arr=s.toCharArray();
        Arrays.sort(arr);
        int n=0;
        for(int i=0;i<arr.length-1;i++){
            char c='2';
            if(arr[i]==arr[i+1] && arr[i]!=c){
                c=arr[i];
                continue;
            }else{
                System.out.print(arr[i]);
                n=10;
            }
        }if(n==10){
            System.out.print(-1);
        }
    }
}