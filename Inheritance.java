class Vehicle{
String brand;
int speed;
void start(){
System.out.println("Vehicle started");
}
void stop(){
System.out.println("Vehicle stopped");
}
}
class Car extends Vehicle{
void openTrunk(){
System.out.println("Trunk opened");
}
}
class Bike extends Vehicle{
void kickStart(){
System.out.println("Bike kick started");
}
}
public class Main{
public static void main(String[] args){
Car c1=new Car();
c1.start();
c1.openTrunk();
c1.stop();
Bike b1=new Bike();
b1.start();
b1.kickStart();
b1.stop();
}
}
