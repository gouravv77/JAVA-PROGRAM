import java.util.*;
class Ass602 {
 public static void main(String[] args) {
 int[] input = {1, 2, 3, 4, 5};
int sum = 0;
 for (int i : input)
  sum = sum + i;
double avg = (double) sum / input.length;
 System.out.println("Average = " + avg);
    }
}
