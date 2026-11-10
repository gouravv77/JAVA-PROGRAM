import java.util.Scanner;
class Ass1105 {
    public static void main(String args[]) {
        String s = "aaabbccca";
        int max = 0, second = 0;
        char ch = ' ', ch2 = ' ';

        for (int i = 0; i < s.length(); i++) {
            int count = 0;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }

            if (s.charAt(i) != ch && count > max) {
                second = max;
                ch2 = ch;
                max = count;
                ch = s.charAt(i);
            } else if (s.charAt(i) != ch
                    && s.charAt(i) != ch2
                    && count > second) {
                second = count;
                ch2 = s.charAt(i);
            }
        }

        System.out.println("Most frequent: " + ch);
        System.out.println("Second most frequent: " + ch2);
    }
}
