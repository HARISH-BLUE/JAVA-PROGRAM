import java.util.Scanner;

public class missingchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        boolean[] present = new boolean[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if (ch >= 'a' && ch <= 'z') {
                present[ch - 'a'] = true;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (!present[i]) {
                System.out.print((char) ('a' + i));
                return;
            }
        }

        System.out.print("No missing character");
    }
}
