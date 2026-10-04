import java.util.Scanner;
class hulk{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s="I hate";
        for(int i=2;i<=n;i++){
            if(i%2==0){
                s+=" that i love";
            }else{
                s+=" that i hate";
            }
        }s+=" it";
        System.out.print(s);
    }
}