import java.util.Scanner;
public class stringpali {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a word:");
        String str=sc.next();
        int left=0;
        int right=str.length()-1;
        boolean ispalindrome=true;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                ispalindrome=false;
                break;
            }
            left++;
            right--;
        }
        if(ispalindrome){
            System.out.print("palindrome");
        }else{
            System.out.print("not palindrome");
        }sc.close();
    }
}