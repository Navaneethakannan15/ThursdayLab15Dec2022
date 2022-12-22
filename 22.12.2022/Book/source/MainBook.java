/* 2) create a class called Book which can hold publisher name,author name, book name and isbc number of the book
and use getter and setter method and create another class McGrawhill and inherit the book class and another class
Packt and inherit the class and another MainBook class to initialize the variable and display the information*/

class Book{
private String pulName;
private String auName;
private String bookName;
private int isbcNum;
public String getpulName()
{
	return pulName;
}
public void setpulName(String pulName)
{
this.pulName=pulName;
}
public String getauName()
{
	return auName;
}
public void setauName(String auName)
{
this.auName=auName;
}
public String getbookName()
{
	return bookName;
}
public void setbookName(String bookName)
{
this.bookName=bookName;
}
public int getisbcNum()
{
return isbcNum;
}
public void setisbcNum(int isbcNum)
{
this.isbcNum=isbcNum;
}}
class McGrawhill extends Book{
	
}
class Packt extends Book{
}
class MainBook{
public static void main(String... args)
{
Book bk=new Book();
Packt pt= new Packt();
McGrawhill mg= new McGrawhill();

mg.setpulName("Kannan");
mg.setauName("Ragu");
mg.setbookName("Wings of fire");
mg.setisbcNum(121545);
System.out.println("\nFrom McGrawhill");
System.out.println("Publisher Name : "+mg.getpulName());
System.out.println("Author Name: "+mg.getauName());
System.out.println("From McGrawhill isbc: "+mg.getisbcNum());
System.out.println("From McGrawhill isbc: "+mg.getbookName());

System.out.println("\nFrom Packt");

pt.setpulName("Kannan");
pt.setauName("Ragu");
pt.setbookName("Wings of fire");
pt.setisbcNum(121545);
System.out.println("Publisher Name : "+pt.getpulName());
System.out.println("Author Name: "+pt.getauName());
System.out.println("From McGrawhill isbc: "+pt.getisbcNum());
System.out.println("From McGrawhill isbc: "+pt.getbookName());

}
}

