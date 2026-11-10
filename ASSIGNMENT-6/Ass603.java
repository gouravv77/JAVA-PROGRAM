import java.util.*;
class Ass603 {
public static void main(String[] args) {
int a[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
int max = a[0];
int min = a[0];
for (int i = 1; i < a.length; i++) {
if (a[i] > max)
max = a[i];
 if (a[i] < min)
min = a[i];
 }

 System.out.println("maximum=" + max);
 System.out.println("minimum=" + min);
 }
}
