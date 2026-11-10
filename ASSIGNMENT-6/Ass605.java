import java.util.*;
class Ass605 {
public static void main(String args[]) {
String array1[] = {"python", "java", "c", "sql"};
String array2[] = {"mysql", "sql", "oracle", "java"};
System.out.println("Common elements are:");
for (int i = 0; i < array1.length; i++) {
 for (int j = 0; j < array2.length; j++) {
 if (array1[i].equals(array2[j])) {
 System.out.println(array1[i]);
  }
   }
   }
   }
   }
