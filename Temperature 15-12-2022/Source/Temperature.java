import java.util.Scanner;
class Temperature
	{
		public static void main(String[]args)
		{
			int a[][]=new int[2][7];
			Scanner sc=new Scanner(System.in);
			float Avg=0;
			int sum=0;
			for(int i=0; i<a.length; i++)
			{
				if(i==0)
				{System.out.println("Chengalpattu Temperature From ");}
				else
				{System.out.println("Tambaram Temperature From ");}
				for(int j=0; j<a[i].length; j++)
				{
					System.out.println("Day No."+(j+1));
					a[i][j]=sc.nextInt();
					
					
				}
			}		
			
				
			System.out.println();
			System.out.println("xxxxx  Disply  xxxxx");
			for(int i=0; i<a.length; i++)
			{
				if(i==0)
				{System.out.println("Week Temperature of Chengalpattu : ");}
				else
				{System.out.println("Week Temperature of Tambaram  :");}
				for(int j=0; j<a[i].length; j++)
				{
					System.out.print(a[i][j]+"   ");
				}
				System.out.println();
			}
			
		}
	}
			
					
			
				