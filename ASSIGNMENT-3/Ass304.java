import java.util.*;
class Ass304{
public static void main (String args[])
{
Scanner sc=new Scanner(System.in);
double n;
System.out.print("enter a number:");
n=sc.nextDouble();
if(n<0){
System.out.println(n+"is negative number.");
}
else if(n==0){
System.out.println("Given number is zero.");
}
else{
System.out.println(n+"is positive number.");
}
sc.close();
}
}
