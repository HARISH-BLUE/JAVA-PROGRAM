import java.util.Scanner;
public class prob1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int k1=n/2,k2=n/2;
        int v1=0,v2=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==1){
                    v1=i;
                    v2=j;
                }
            }
        }int dif=0;
        if(v1>k1){
            dif=v1-k1;
        }else{
            dif=k1-v1;
        }
        if(v2>k2){
            dif=dif+v2-k2;
        }else{
            dif=dif+k2-v2;
        }
        System.out.print(dif);
        
    }
}
