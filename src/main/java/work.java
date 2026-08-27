public class work {
    static int samp(int num) {
        if(num>0){
            return num+samp(num-1); 
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        System.out.println(samp(3)); 
    }
}  