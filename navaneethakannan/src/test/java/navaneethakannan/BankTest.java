package navaneethakannan;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankTest {

	
		// TODO Auto-generated method stub
		Bank b;
		@BeforeEach
		public void init() {
			b=new Bank();
			
		}
		@Test
		public void balChecking() {
			String expect[]= {"Raja", "15000"};
			String actual[]=b.details(001);
			for(int i=0; i<actual.length; i++) {
				assertEquals(expect[i], actual[i]);
			}
		}}
	
	
	