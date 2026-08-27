import java.util.*;
public class rev {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        int left=0;
        int c=0;
        int right=name.length()-1;
        while(left<right){
            if(name.charAt(left)!=name.charAt(right)){
                System.out.print("false");
                c=1;
                break;
            }left++;
            right--;
        }if(c==0){
            System.out.print("true");
        }sc.close();       
    }
}

