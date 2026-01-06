class BankAccount{
int accountNumber;
double balance;
BankAccount(){
accountNumber=1000;
balance=0.0;
}
BankAccount(int accNo,double initialBalance){
accountNumber=accNo;
balance=initialBalance;
}
void deposit(double amount){
if(amount>0){
balance=balance+amount;
}
}
void withdraw(double amount){
if(amount<=balance){
balance=balance-amount;
}
}
void displayAccount(){
System.out.println("AccountNumber:"+accountNumber);
System.out.println("Balance:"+balance);
}
}
public class Main{
public static void main(String[] args){
BankAccount b1=new BankAccount();
BankAccount b2=new BankAccount(2001,5000.0);
b1.displayAccount();
System.out.println();
b2.deposit(1500.0);
b2.withdraw(1000.0);
b2.displayAccount();
}
}
