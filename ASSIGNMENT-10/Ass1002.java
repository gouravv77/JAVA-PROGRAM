import java.util.*;
interface Father {
default void show() {
System.out.println("Father's method");
}
}
interface Mother {
default void show() {
System.out.println("Mother's method");
}
}
class Child implements Father, Mother {
    public void show() {
        Father.super.show();
        Mother.super.show();
        System.out.println("Child's method");
}
}
public class Ass1002 {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
}
}

