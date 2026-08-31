import java.util.Scanner;
public class uniqueletters {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String r="";
        for(int i=0;i<s.length();i++){
            if(!r.contains(String.valueOf(s.charAt(i)))){
                r=r+s.charAt(i);
            }
        }
        System.out.println(r);
    }    
}
