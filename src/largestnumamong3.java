public class largestnumamong3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 60;
        int c = 30;
        int large=(a>b)?(a>c?a:c):(b>c?b:c);
        System.out.print(large);
    }
}
