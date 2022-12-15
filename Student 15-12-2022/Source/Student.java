import java.util.Scanner;
class Student
{
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	int a[][][]={
	{{66,45,75},{88,92,96}},
	{{76,36,44},{55,42,48}}
	};

	for(int i=0; i<a.length;i++)
	{
		System.out.println("Department No."+(i+1));
	for(int j=0; j<a[i].length; j++)
	{
		System.out.println("Student No."+(j+1));
	for(int k=0; k<a[i][j].length; k++)
	{
		System.out.print(a[i][j][k] +"\t");
	}
	System.out.println();
	}
	}
	
        
}
}