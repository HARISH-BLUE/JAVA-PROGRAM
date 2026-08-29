import java.util.Scanner;
public class train {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] arr1=new String[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.next();
        }
        String[] arr2=new String[n];
        int i=0;
        while(true){
            String word=arr1[i];
            String s="";
            s+=word.charAt(0);
            int k= (word.length()-1)/2;
            s+=word.charAt(k);
            int g=arr1[i].length()-1;
            s+=word.charAt(g);
            arr2[i]=s;
            s="";
            if(i==arr1.length-1){
                break;
            }i++;
        }for(int m=0;m<n;m++){
            for(int j=0;j<n;j++){
                System.out.print(arr2[m]);
                if(j==n-1){
                    System.out.print(" ");
                }
            }
            
        }sc.close();
    }    
}
