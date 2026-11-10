import java.util.*;

class Student {
    int roll;
    String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    void show() {
        System.out.println("Roll No: " + this.roll);
        System.out.println("Name: " + this.name);
    }
}

public class Ass1003{
    public static void main(String[] args) {
        Student s = new Student(101, "Gourav");
        s.show();
    }
}



