import java.util.*;
class Bank {
double getRateOfInterest()
{return 0;
}
}
class SBI extends Bank {
double getRateOfInterest() {
return 8.4;
}
}
class ICICI extends Bank {
double getRateOfInterest() {
return 7.3;
 }
}
class AXIS extends Bank {
double getRateOfInterest() {
return 9.7;
}
}
public class Ass1001 {
public static void main(String[] args) {
Bank b;
        b = new SBI();
        System.out.println("SBI Rate of Interest: " + b.getRateOfInterest() + "%");

        b = new ICICI();
        System.out.println("ICICI Rate of Interest: " + b.getRateOfInterest() + "%");

        b = new AXIS();
        System.out.println("AXIS Rate of Interest: " + b.getRateOfInterest() + "%");
}
}
