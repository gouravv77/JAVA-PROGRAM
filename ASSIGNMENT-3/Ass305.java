import java.util.*;
class Ass305{
public static void main (String args[])
{
Scanner sc=new Scanner(System.in);
double buy,sell,diff,LP,PP;
System.out.print("Enter buy price:");
buy=sc.nextDouble();
System.out.print("Enter sell price:");
sell=sc.nextDouble();
if(buy==sell){
System.out.print("No profit/ No loss");
}
else if(buy>sell){
diff=buy-sell;
LP=(diff*100)/buy;
System.out.print("loss percentage="+LP+"%");
}else{
diff=sell-buy;
PP=(diff*100)/buy;
System.out.println("profit percentage="+PP+"%");
}
sc.close();
}
}
