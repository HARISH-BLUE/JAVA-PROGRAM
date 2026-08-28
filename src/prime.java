import java.util.Scanner;
public class prime {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean val=true;
        if(num<=1){
            val=false;
        }else{
            for(int i=2;i<=num/2;i++){
                if(num%i==0){
                    val=false;
                    break;
                }
            }
        }
        if(val){
            System.out.print("the number is prime");
        }else{
            System.out.print("the number is not prime");
        }sc.close();
    }
    
}
