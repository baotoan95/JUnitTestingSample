package com.btit95.sample;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {
	private Calculator calculator;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("@BeforeClass called");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("@AfterClass called");
	}
	
	public CalculatorTest() {
		System.out.println("Constructor called");
	}
	
	@Before
	public void setUp() {
		System.out.println("@Before called");
		this.calculator = new Calculator();
		
	}
	
	@After
	public void after() {
		System.out.println("@After called");
	}
	
	@Test
	public void testAdd() {
		System.out.println("Test Add called");
		assertEquals(4, calculator.add(2, 2));
	}
	
	@Test
	public void testSub() {
		System.out.println("Test Sub called");
		assertEquals(0, calculator.sub(2, 2));
	}
	
	@Ignore
	@Test
	public void testMul() {
		System.out.println("Test mul called");
		assertEquals(9, calculator.mul(4, 4));
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDiv() {
		System.out.println("Test div called");
		assertEquals(3, calculator.div(3, 0));
	}
	
	@Test(timeout = 1000)
	public void testAddMultiple() {
		System.out.println("Test add multiple called");
		int a[] = {323,4345,56456,3,23,643,53456,3465346,43,23,434,234,23423,4234,232,423,423,2,13,4343,432,32,1};
		assertEquals(3614887, calculator.add(a));
	}
}
