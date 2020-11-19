package de.heyden.simon;

import org.junit.jupiter.api.Test;

public class EnvironmentValueTest {

	@Test
	public void testValue(){
		System.out.println("###################################");
		System.out.println("TEST_VALUE: " + System.getenv("TEST_VALUE"));
		System.out.println("###################################");
	}
}
