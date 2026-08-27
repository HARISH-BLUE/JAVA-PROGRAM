import java.util.*;
public class frequencyeach {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int freq=1;
        char str[]=s.toCharArray();
        Arrays.sort(str);
        for(int i=0;i<str.length;i++){
            for(int j=i+1;j<str.length;j++){
                if(str[i]!='0' && str[i]!=' ' && str[i]==str[j]){
                    freq++;
                    str[j]='0';  
                }
                if(str[i]!='0' && str[i]!=' '&&j==str.length-1){
                    System.out.println(str[i]+" "+freq);
                    freq=1;
                }
            }if(str[i]!='0'&& str[i]!=' '&& i==str.length-1){
                    System.out.print(str[i]+" "+freq);
                }
        }
    }    
}
