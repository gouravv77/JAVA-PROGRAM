import java.util.*;
class Shape {
double getPerimeter() {
return 0;
}
double getArea() {
return 0;
}
}
class Circle extends Shape {
double radius;
Circle(double radius) {
 this.radius = radius;
 }
double getPerimeter() {
return 2 * Math.PI * radius;
}
double getArea() {
 return Math.PI * radius * radius;
 }
}
public class Ass904 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        Circle c = new Circle(r);

        System.out.println("Perimeter = " + c.getPerimeter());
        System.out.println("Area = " + c.getArea());
}
}
