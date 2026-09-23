class Square{
    public static int square(int n) {
        int result = 0;
        for (int i = 0; i < Math.abs(n); i++) {
            result += Math.abs(n);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(square(5));    // 25
        System.out.println(square(7));    // 49
        System.out.println(square(-4));   // 16
    }
}