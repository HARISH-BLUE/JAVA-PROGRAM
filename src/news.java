public class news {
    public static void main(String[] args){
        add(10); 
    }
    public static int add(int n){
        if(n==1){
            return 1;
        }else{
            return add(n-1);
        }
    }
}
