import java.util.Stack;

public class jesh {
    public static void main(String[] args) {
        int num = 123456;
        Stack<Integer> stack = new Stack<>();

        while (num > 0) {
            stack.push(num % 10);
            num /= 10;
        }

        int reversed = 0;
        int place = 1;

        while (!stack.isEmpty()) {
            reversed += stack.pop() * place;
            place *= 10;
        }

        System.out.println("reversed number: " + reversed);
    }
}