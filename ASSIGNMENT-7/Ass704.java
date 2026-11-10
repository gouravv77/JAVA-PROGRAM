import java.util.*;
class Interest {
void calcite(int p, int t) {
double si = (p * 5 * t) / 100.0;
 System.out.println("Simple Interest = " + si);
 }
 void calculate(int r, int t, double p) {
 double si = (p * r * t) / 100.0;
  System.out.println("Simple Interest = " + si);
   }
public static void main(String[] args) {
Interest i = new Interest();
i.calcite(10000, 2);
i.calculate(10, 2, 10000);
 }
}
