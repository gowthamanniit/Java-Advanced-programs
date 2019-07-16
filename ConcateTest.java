package javapro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConcateTest {

	@Test
	void testConcatenate() {
		JunitTest t1=new JunitTest();
		String result=t1.Concatenate("one","two");
		assertEquals("onetwo",result);
		
	}

}
