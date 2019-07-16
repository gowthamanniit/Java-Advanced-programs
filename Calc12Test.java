package javapro;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Calc12Test {
Calc12 cal;
	@Test
	void test1() {
	cal=new Calc12();
		//System.out.println(cal.add(10,20));
	assertEquals(30,cal.add(20,10));
	}
		@Test
	void test2() {
			cal=new Calc12();
			//System.out.println(cal.add(10,20));
			assertEquals(10,cal.subtract(20,10));
		}
			@Test
	void test3() {
				cal=new Calc12();
				//System.out.println(cal.add(10,20));
				assertEquals(200,cal.multiply(20,10));
			}
				@Test
	void test4() {
					cal=new Calc12();
					//System.out.println(cal.add(10,20));
					assertEquals(2,cal.divide(20,10));
				
	}

}
     