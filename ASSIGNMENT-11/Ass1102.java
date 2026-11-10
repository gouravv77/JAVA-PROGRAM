import java.util.Scanner;
class Ass1102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        boolean same = true;

        if (s1.length() != s2.length()) {
            same = false;
        } else {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    same = false;
                    break;
                }
            }
        }

        System.out.println("Same = " + same);

        if (same) {
            System.out.println("Both string objects contain the same data.");
        } else {
            System.out.println("Both string objects do not contain the same data.");
        }

        sc.close();
    }
}
