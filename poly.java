class Payment{
void pay(int amount){
System.out.println("Payment of "+amount+" processed");
}
}
class CreditCardPayment extends Payment{
void pay(int amount){
System.out.println("Paid "+amount+" using Credit Card");
}
}
class UPIPayment extends Payment{
void pay(int amount){
System.out.println("Paid "+amount+" using UPI");
}
}
public class Main{
public static void main(String[] args){
Payment p;
p=new CreditCardPayment();
p.pay(1000);
p=new UPIPayment();
p.pay(500);
}
}
