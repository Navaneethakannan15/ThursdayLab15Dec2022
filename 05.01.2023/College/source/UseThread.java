/*2) Create a Thread to show synchronization where there is a college with college name and college id and it has capacity 
   of upto 50 students already 48 students has got admission then for 51 student it has to display admission is full*/

class College implements Runnable{
	int totalSeats= 50;
	int seated=48;
	int availSeats;
College(int availSeats){
	this.availSeats=availSeats;
}
public void run(){
	String name=Thread.currentThread().getName();
	synchronized(this){
		if(seated<totalSeats)
		{
			System.out.println("Hi "+name+", congrats you got a seat");
			seated++;
		}
		else
		{
			System.out.println("Sorry, "+name+" admission is full, there is no seats are available");
		}
	}
}
}
class UseThread{
public static void main(String... args)
{
	
	
	System.out.println("College Name: Anudip");
	System.out.println("code	: 3689 ");
	College clg=new College(1);
	Thread t1=new Thread(clg);
	Thread t2=new Thread(clg);
	Thread t3=new Thread(clg);
	t1.setName("Raghu");
	t2.setName("Divya");
	t3.setName("Javeed");
	t1.start();
	t2.start();
	t3.start();
}

}




