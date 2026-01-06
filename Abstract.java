abstract class Shape{
String name;
abstract void calculateArea();
void displayShape(){
System.out.println("Shape:"+name);
}
}
class Circle extends Shape{
int radius;
Circle(int r){
name="Circle";
radius=r;
}
void calculateArea(){
System.out.println("Area:"+(3.14*radius*radius));
}
}
class Rectangle extends Shape{
int length;
int breadth;
Rectangle(int l,int b){
name="Rectangle";
length=l;
breadth=b;
}
void calculateArea(){
System.out.println("Area:"+(length*breadth));
}
}
public class Main{
public static void main(String[] args){
Shape s;
s=new Circle(5);
s.displayShape();
s.calculateArea();
s=new Rectangle(4,6);
s.displayShape();
s.calculateArea();
}
}
