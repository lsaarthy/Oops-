class BankAccount{
private int accountNumber;
private int balance;
BankAccount(int accNo,int bal){
accountNumber=accNo;
balance=bal;
}
public void deposit(int amount){
if(amount>0){
balance=balance+amount;
}
}
public void withdraw(int amount){
if(amount<=balance){
balance=balance-amount;
}
}
public int getBalance(){
return balance;
}
public static void main(String[] args){
BankAccount b1=new BankAccount(1001,5000);
b1.deposit(2000);
b1.withdraw(1500);
System.out.println("Balance:"+b1.getBalance());
}
}