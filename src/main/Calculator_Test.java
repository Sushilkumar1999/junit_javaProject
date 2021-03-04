package main;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Calculator_Test {
	
	Calculator obj = new Calculator();
	
	@BeforeAll
	public static void beforeall() {
    	System.out.println("before all");
    }
	
	@BeforeEach
	public void beforejunit() {
		System.out.println("before junit");
	}
	
	@Test
	public void addTest() {
		
		int result = obj.add(2, 3);
	}
	@Test
	public void substractionTest() {
		
		obj.substraction();
	}
   @Test
	public void multiplicationTest() {
		
    	obj.multiplication();
	}
    @AfterEach
    public void afterjunit() {
    	System.out.println("After junit");
    }
    @AfterAll
    public static void afterall() {
    	System.out.println("After all");
    }
    

}
