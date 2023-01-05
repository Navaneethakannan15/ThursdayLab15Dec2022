/*
3) Create a class called Student with student name,id,attendance and mark and sort it according to students name and display
   the details
*/

import java.util.*;
class Student implements Comparator<Student>{
	String stName;
	int stId,marks;
	int att;
		public int compare(Student s1, Student s2){
		return s1.stName.compareTo(s2.stName);
	}
	Student(String stName,int stId,int marks,int att)
	{
		this.stName=stName;
		this.stId=stId;
		this.marks=marks;
		this.att=att;
	}
	Student(){
	}
	public String toString()
	{
		return "Student Name :"+stName+"\t"+"ID: "+stId+" \t"+"Marks :"+marks+"\t"+"Attendance:"+att;
	}
}
class MainStudent
{
	public static void main(String...args)
	{
		LinkedList<Student> srt=new LinkedList<Student>();
		Student s1= new Student("Raghu",1003,55,67);
		Student s2=new Student("Javeed",1002,45,55);
		Student s3=new Student("Anbu",1001,23,99);
		srt.add(s1);
		srt.add(s2);
		srt.add(s3);
		
		Collections.sort(srt,new Student());
		Iterator i = srt.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
	}
}