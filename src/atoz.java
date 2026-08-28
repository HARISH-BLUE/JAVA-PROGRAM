import java.util.Scanner;
public class atoz {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char c;
        String s=sc.nextLine();
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                System.out.print(c+" ");
            }
        }
        
        sc.close();

    }

}