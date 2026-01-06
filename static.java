class Employee{
static String companyName="ABC Company";
static int employeeCount=0;
int employeeId;
String employeeName;
Employee(String name){
employeeName=name;
employeeId=++employeeCount;
}
static int getEmployeeCount(){
return employeeCount;
}
void displayEmployee(){
System.out.println("Company:"+companyName);
System.out.println("Employee ID:"+employeeId);
System.out.println("Employee Name:"+employeeName);
}
}
public class Main{
public static void main(String[] args){
Employee e1=new Employee("Aarthy");
Employee e2=new Employee("Kavin");
e1.displayEmployee();
System.out.println();
e2.displayEmployee();
System.out.println();
System.out.println("Total Employees:"+Employee.getEmployeeCount());
}
}

