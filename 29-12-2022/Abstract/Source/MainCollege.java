/*3) Write an abstract class with college id and college name as instance variable and intialize it using constructor
   and an abstract method departments and concrete method to display the colled id and college name and in the 
   implementation class have no of students and department name as vairable and implement the departments method.*/

abstract class College{
     int clgid;
	 String clgname;
	 College (int clgid, String clgname)
	 {
	 this.clgid=clgid;
	 this.clgname=clgname;
	 }
void display(){
System.out.println("College Name :"+clgname+"\t Collge Id : "+clgid);
}
abstract void dept(int students, String deptname);

}
class Anudip extends College{
Anudip(int clgid, String clgname){
super(clgid,clgname);
}
void dept(int students, String deptname)
{
System.out.println("Department Name : " +deptname+"\t No.of Students : "+students);
}
}
class MainCollege{
public static void main(String... args)
{
Anudip a=new Anudip(600097, "Anudip");
a.display();
a.dept(43, "Core Java");
}
}