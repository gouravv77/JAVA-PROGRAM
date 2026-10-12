import java.util.*;
class Ass302{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double basic,HRA,DA,GS;
System.out.print("Enter Basic Salary:");
basic=sc.nextDouble();
HRA=basic*0.1;
DA=basic*0.6;
GS=basic+HRA+DA;
System.out.println("Gross Salary Calculated:Rs."+GS);
sc.close();
}
}