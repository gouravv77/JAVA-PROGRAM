import java.util.Scanner;
class Ass1103{
    public static void main(String args[]) {
        String s = "apple";

        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c + ": ");

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == c) {
                    System.out.print(i + " ");
                }
            }

            System.out.println();
        }
    }
}
