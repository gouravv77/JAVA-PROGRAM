import java.util.Scanner;

public class Ass504{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of elements: ");
int n = sc.nextInt();
int[] a = new int[n];
System.out.println("Enter elements in sorted order:");
for (int i = 0; i < n; i++) {
a[i] = sc.nextInt();
}
System.out.print("Enter element to search: ");
int key = sc.nextInt();
int low = 0;
int high = n - 1;
int mid;
boolean found = false;
while (low <= high){
mid = (low + high) / 2;

if (a[mid] == key) {
 System.out.println("Element found at position " + (mid + 1));
 found = true;
break;
 } 
else if (a[mid] < key) {
low = mid + 1;
} 
else {
high = mid - 1;
}
}
if (!found) {
 System.out.println("Element not found");
 }   sc.close();
    }
}
