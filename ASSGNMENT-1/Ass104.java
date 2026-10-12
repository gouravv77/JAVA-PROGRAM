import java.util.*;
class Ass104 {
public static void main(String args[]) { 
int a = 50, b = 60, temp;
System.out.println("Before swap:a="+a+" b="+ b);
a=a^b;
b=a^b;
a=a^b;
System.out.println("After swap:a="+a+" b=" + b);
}
}
