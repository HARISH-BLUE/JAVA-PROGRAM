import java.util.Scanner;
public class palindromenum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int num1=num;
        int rev=0;
        while(num>0){
            int temp=num%10;
            rev=rev*10+temp;
            num/=10;
        }
        if(rev==num1){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }sc.close();

    }
}
