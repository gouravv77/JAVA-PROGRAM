import java.lang.*;
import java.util.Scanner;
public class Ass401{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter coefficient a:");
double a=sc.nextDouble();
System.out.print("Enter coefficient b:");
double b=sc.nextDouble();
System.out.print("Enter coefficient c:");
double c=sc.nextDouble();
if(a==0){
System.out.println("it is not a quadratic equation.");
}else{
double D=(b*b)-(4*a*c);
if(D>0){
double r1=(-b+Math.sqrt(D)/(2*a));
double r2=(-b+Math.sqrt(D)/(2*a));
System.out.println("The equation has real and Distinct Roots.");
System.out.printf("1st Root=%.2f\n",r1);
System.out.printf("2st Root=%.2f\n",r2);
}else if(D==0){
double r=-b/(2*a);
System.out.println("The equation has Real and Equal Roots.");
System.out.printf("1st Root=2nd Root=%.2f\n",r);
}else{
double realpart=-b/(2*a);
double imagpart=Math.sqrt(-D)/(2*a);
System.out.println("The equation has complex Roots.");
System.out.printf("1st Root=%.2f+%.2fi\n",realpart,imagpart);
System.out.printf("2nd Root=%.2f+%.2fi\n",realpart,imagpart);
}
}
sc.close();
}
}