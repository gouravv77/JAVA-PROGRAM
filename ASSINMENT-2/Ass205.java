import java.lang.*;
class Ass205
{
public static void main(String args[])
{
int minutes=20000;
int totalDays=minutes/1440;
int years=totalDays/365;
int days=totalDays%365;
System.out.println("year:"+years);
System.out.println("Days:"+days);
}
}