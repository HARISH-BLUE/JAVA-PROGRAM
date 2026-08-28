public class pattern {
    public static void main(String[] args){
        for(int i=0;i<=5;i++){
            for(int j=i;j<=5;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
            
            for(int k=(2*i-1);k>=1;k--){
                System.out.print(" ");
            }for(int j=5;j>=1;j--){
                System.out.print("*");
            }
           
        }  
    }
}
