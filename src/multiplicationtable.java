import java.util.Scanner;
public class multiplicationtable {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=1;i<10+1;i++){
            System.out.println(i+"x"+a+"="+i*a);
        }sc.close();
    }
    
}
