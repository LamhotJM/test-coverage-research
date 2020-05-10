package com.lamhot.app;



import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Prob1108_Defanging_An_IP_AddressTest {
	
	Prob1108_Defanging_An_IP_Address ob;

	@Before
	public void setUp() throws Exception {
		
	 ob = new Prob1108_Defanging_An_IP_Address();
	}

	@Test
	public void test() {
		assertEquals(ob.defangIPaddr("1.1.1.1"), "1[.]1[.]1[.]1");
		
	}

}
