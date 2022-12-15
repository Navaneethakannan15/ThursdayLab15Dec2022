import java.util.Scanner;
class Pronic
	{
		public static void main (String[]args)
		{
		System.out.println("Enter a number: ");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		
		boolean Pronic=false;
		for (int i=1; i<input; i++)
		{
		if(i*(i+1)==input)
		{
			Pronic=true;
			break;
		}
		}
		if (Pronic==true)
		{
		System.out.println("Yes, Your number is Pronic Number ");
		}
		else
		{
		System.out.println("Sorry, Your number is Not a Pronic number");
		}
	}

	}
	
/*
for my Understanding
eg. 2 and 3 
if 2 is n
3 is n+1 
			2* 3 =6
			n*n+1=x value

like wise line 13

line 11  if i give 20 
		
			1; 1<20;  for loop condition true 
			  (4* (4+1) ==20)  if statement true 
			  
		*/
		
		
		