import java.lang.*;
import java.util.*;
class Ass301
{
public static void main(String[]args){ 
Scanner scn = new Scanner(System.in);
System.out.println("Enter marks of subject 1: ");
int sub1=scn.nextInt();
System.out.println("Enter marks of subject 2: ");
int sub2=scn.nextInt();
System.out.println("Enter marks of subject 3: ");
int sub3=scn.nextInt();
System.out.println("Enter marks of subject 4: ");
int sub4=scn.nextInt();
System.out.println("Enter marks of subject 5: ");
int sub5=scn.nextInt();
 double total=sub1+sub2+sub3+sub4+sub5;
double per=(total/500)*100;
 System.out.println("Total marks="+total);
System.out.println("percentage="+per+"%");

}
}