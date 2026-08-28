import java.util.Scanner;
public class secondlergenum {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        int sec;
        if(num1<=num2&&num1>=num3 || num1>=num2&&num1<=num3){
            sec=num1;
        }else if(num2<=num1&&num2>=num3 || num2>=num1&&num2<=num3){
            sec=num2;
        }else{
            sec=num3;
        }System.out.println(sec);
        sc.close();
    }
}
