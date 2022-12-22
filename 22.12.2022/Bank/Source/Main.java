/*3) write an inner class which is private for banking application only when the person is authorized he can create 
instance for inner class and add interest to the person.*/

import java.util.Scanner;
class Outer{
	double bal=1000.0;
	public void Interest(double i)
	{
	String pass;
	Scanner sc=new Scanner(System.in);
	System.out.print("Input your Password : " );
	pass=sc.nextLine();
	if(pass.equals("Raja"))
	{
	Inner in =new Inner();
	in.updateInterest(i);
	}
	else
	{
		System.out.println("In correct Password");
	}
}
private class Inner{
public void updateInterest(double i)
{
bal+=bal*(i/100);
System.out.println("Balance after adding "+i+"% is " +bal);
}
}
}
class Main{
public static void main(String... args){
Outer out=new Outer();
out.Interest(10);
}
}


	