class Student{
String name;
int rollNumber;
int marks;
void setDetails(String n,int r,int m){
name=n;
rollNumber=r;
marks=m;
}
void displayDetails(){
System.out.println("Name:"+name);
System.out.println("Roll No:"+rollNumber);
System.out.println("Marks:"+marks);
}
boolean isPassed(){
if(marks>=40){
return true;
}else{
return false;
}
}
}
public class StudentMain{
public static void main(String[] args){
Student s1=new Student();
s1.setDetails("Aarthy",101,75);
Student s2=new Student();
s2.setDetails("Kavin",102,35);
System.out.println("Student1Details");
s1.displayDetails();
System.out.println("Passed:"+s1.isPassed());
System.out.println();
System.out.println("Student2Details");
s2.displayDetails();
System.out.println("Passed:"+s2.isPassed());
<<<<<<< HEAD
}
}
=======
}
}

>>>>>>> f4da0b0 (updated my code)
