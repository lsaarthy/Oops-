class Student{
public String name;
private int marks;
protected String grade;
int rollNumber;
public void setMarks(int m){
if(m>=0&&m<=100){
marks=m;
calculateGrade();
}
}
private void calculateGrade(){
if(marks>=90){
grade="A";
}else if(marks>=75){
grade="B";
}else if(marks>=50){
grade="C";
}else{
grade="Fail";
}
}
public String getGrade(){
return grade;
}
protected void displayBasicInfo(){
System.out.println("Name:"+name);
System.out.println("RollNumber:"+rollNumber);
}
}
public class Main{
public static void main(String[] args){
Student s=new Student();
s.name="Aarthy";
s.rollNumber=101;
s.setMarks(82);
s.displayBasicInfo();
System.out.println("Grade:"+s.getGrade());
}
}


