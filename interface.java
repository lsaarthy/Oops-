interface SmartDevice{
void turnOn();
void turnOff();
}
class SmartLight implements SmartDevice{
public void turnOn(){
System.out.println("Light ON");
}
public void turnOff(){
System.out.println("Light OFF");
}
}
class SmartFan implements SmartDevice{
public void turnOn(){
System.out.println("Fan ON");
}
public void turnOff(){
System.out.println("Fan OFF");
}
}
public class Main{
public static void main(String[] args){
SmartDevice d;
d=new SmartLight();
d.turnOn();
d.turnOff();
d=new SmartFan();
d.turnOn();
d.turnOff();
}
}
