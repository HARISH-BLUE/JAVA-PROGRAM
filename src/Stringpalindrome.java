import java.util.*;
public class Stringpalindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String S=sc.nextLine().replace(" ","");
        String s=S.toLowerCase();
        int l=0;
        int r=s.length()-1;
        int n=0;
        System.out.println(s);
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                n=1;
                System.out.print("not a palindrome");
                break;
            }l++;
            r--;
        }if(n==0){
            System.out.print("palindrome");
        }sc.close();
    }
}
