 import java.util.*;
 public class Ass502 {
    public static void main(String[] args) {
double e=1.0;
double fact=1.0;
for (int i=2;i<=5;i++){
fact=fact*i;
e=e+(1.0/fact);
}
System.out.println("value of e="+e);
}
}