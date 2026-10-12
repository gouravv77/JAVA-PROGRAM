import java.lang.*;
import java.util.Scanner;

public class Ass405 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a single character from the alphabet: ");
        String str = sc.next();

        if (str.length() != 1) {
            System.out.println("Error");
        } else {
            char ch = str.charAt(0);

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.println("vowel");
                } else {
                    System.out.println("consonant");
                }
            } else {
                System.out.println("Error! Input is not an alphabet.");
            }
        }

        sc.close();
    }
}