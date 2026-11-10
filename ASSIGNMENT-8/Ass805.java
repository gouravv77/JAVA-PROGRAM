import java.util.*;
class Circle {
    double radius;
    double area() {
        return Math.PI * radius * radius;
    }
    double circumference() {
        return 2 * Math.PI * radius;
    }
}

public class Ass805 {
    public static void main(String args[]) {
        Circle c = new Circle();
        c.radius = 5;

        System.out.println("Radius: " + c.radius);
        System.out.println("Area: " + c.area());
        System.out.println("Circumference: " + c.circumference());
    }
}
