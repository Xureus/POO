import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	@Test
	public void testAdd() {
		int a = 1234;
		int b = 8765;
			
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
			 
		int expected = 9999;
		assertEquals (expected, actual);
	
	}
	
	@Test
	public void testSubtract() {
		int a = 9876;
		int b = 4321;
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		int expected = 5555;
		assertEquals(actual,expected);
		
	//	fail("Not yet implemented"); 
	}
	
	@Test
	public void testMultiple() {
		int a = 5;
		int b = 5;
		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b);
		int expected = 25;
		assertEquals(actual,expected);
		
		
	}
	
	@Test(expected=java.lang.ArithmeticException.class)
	public void testDivide() {
		int a = 25;
		int b = 0;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		assertEquals(true,actual);
	}
	
	
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
