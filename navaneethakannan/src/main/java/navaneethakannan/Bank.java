package navaneethakannan;

public class Bank {
public String[] details(int idl) {
	int id[]= {001,002,003};
String bal[]=new String[2];
String name[]= {"Raja", "Roja", "Thanshi"};
int balance[]= {15000,45000,50000};
for(int i=0; i<id.length; i++) {
	if(idl==id[i]) {
		bal[0]=name[i];
		bal[1]=String.valueOf(balance[i]);
		
	}
}return bal;
}

}
