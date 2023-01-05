/*1) Create a class called Book with author name,book name and isbc number as variable and store it in collection and retrive 
   it using for each loop and itertor and also do serializaion and clonning*/
 
import java.util.*;
import java.io.*;
class Book implements Serializable{
	String authorName,bookName;
	int isbcno;
	Book(String authorName,String bookName,int isbcno)
	{
		this.authorName=authorName;
		this.bookName=bookName;
		this.isbcno=isbcno;
	}
	public String toString()
	{
	System.out.println();	
		return "Authorname	: "+authorName+"\n"+"Bookname	: "+bookName+"\n"+"isbcno		: "+isbcno; 
	}
}
class Books{
	public static void main(String...args)throws IOException,ClassNotFoundException
	{
		LinkedHashSet<Book> ll=new LinkedHashSet<Book>();
		Book b1=new Book("Kalki","Ponniyin Selvan",3689);
		Book b2=new Book("APJ Abdul Kalam","Wings of fire",3567);
		Book b3=new Book("Irai Anbu","Saga Varam",1111);
		Book b4=new Book("Sujatha","Sriranga Thevathaikal",3258);
		ll.add(b1);
		ll.add(b2);
		ll.add(b3);
		ll.add(b4);
		for(Book b:ll)
		{
			System.out.println(b);
		}
		FileOutputStream fos=new FileOutputStream("C:\\New folder\\05.01.2023\\file.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(ll);
		oos.close();
		fos.close();
		
		FileInputStream fis=new FileInputStream("C:\\New folder\\05.01.2023\\file.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		LinkedHashSet<Book> rd=(LinkedHashSet<Book>)ois.readObject();
		ois.close();
		fis.close();
		
		System.out.println();	
		System.out.println("-----------------------This is for clonning---------------------");
		LinkedHashSet<Book> clo=(LinkedHashSet<Book>)rd.clone();
		Iterator it=clo.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}