package javapro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MultiplyTest {

	@Test
	void testMultiply() {
		JunitTest t1=new JunitTest();
		int result=t1.multiply(3,4);
		assertEquals(12,result);
	}

}
