import java.util.*;
class Area {
 static int rectangleArea(int length, int breadth) {
  int area = length * breadth;
 System.out.println("Area of rectangle = " + area);
        return area;
    }

    void squareArea(int side) {
        int area = side * side;
        System.out.println("Area of square = " + area);
    }

    public static void main(String[] args) {
        rectangleArea(10, 5);

        Area a = new Area();
        a.squareArea(6);
    }
}
