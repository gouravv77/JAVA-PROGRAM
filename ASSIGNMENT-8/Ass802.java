import java.util.*;
class Rectangle {
    double width;
    double height;
    double calculateArea() {
return width * height;
}
double calculatePerimeter() {
return 2 * (width + height);
}
public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.width = 10;
        r.height = 5;

System.out.println("Area: " + r.calculateArea());
System.out.println("Perimeter: " + r.calculatePerimeter());
 }
}
