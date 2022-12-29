//1) Write an functional interface with lambda expression to pass a set of items and display it using for each loop.//

interface function{
		void display(String[] dress);
}
class MainInterface{
	public static void main(String...args)
	{
			String str[]={"Jeans","Formal Pants","Party wear","Sports T-shirts"};
			System.out.println("Welcome to Saravana Stores");
			function f=(String[] dress)->{
				for(String i:dress)
				{
					System.out.println(i);
				}
			};
			f.display(str);
	}
}