import java.util.Scanner;
class Student {
 String name;
 int rollNo;
  String course;
  void selectCourse() {
   Scanner sc = new Scanner(System.in);
        System.out.println("Choose a course:");
        System.out.println("1. Java");
        System.out.println("2. Python");
        System.out.println("3. C++");
        System.out.print("Enter your choice: ");
   int choice = sc.nextInt();
        if (choice == 1)
            course = "Java";
        else if (choice == 2)
            course = "Python";
        else if (choice == 3)
            course = "C++";
        else
            course = "Invalid course";
 }
void display() {
        System.out.println("\nStudent Details");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
 }

public static void main(String[] args) {
Student s = new Student();
  s.name = "Gourav";
   s.rollNo = 101;
    s.selectCourse();
 s.display();
    }
}
