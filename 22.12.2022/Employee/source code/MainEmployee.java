/*1) create an employee class with name,id,salary and intialize it using constructor and override toString() method
to print the string representation of employee and an instance method which increments the salary of the employee
and call the method inside another class MainEmployee and increment the salary and display employee information*/
import java.util.*;
class Employee
{
String name;
int id;
double sal;

Employee(String name, int id, double sal){
this.name=name;
this.id=id;
this.sal=sal;
}

public double salary(double n){
sal+=sal*(n/100);
return(sal);
}
public String toString(){
 return "Name	: "+name+" \nID	: "+id+"\nSalary	: "+sal;
}
}
class MainEmployee{
	public static void main(String... args){
	Employee emp=new Employee("Saravanan",4254,35000);
	
	
	Scanner sc=new Scanner(System.in);
	System.out.print("Percent of increement: ");
	int n=sc.nextInt();
	emp.salary(n);
	
	System.out.println(emp);
	
	}
}

