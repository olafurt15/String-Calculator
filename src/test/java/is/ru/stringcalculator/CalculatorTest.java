package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.Rule;

public class CalculatorTest{
	

	@Test
	public void testEmptyString(){
		assertEquals(0, Calculator.add(""));
	}
	@Test
	public void testOneNumber(){
		assertEquals(1, Calculator.add("1"));
	}
	@Test
	public void testTwoNumbers(){
		assertEquals(3, Calculator.add("1,2"));
	}
	@Test
	public void testUnknownNumbers(){
		assertEquals(15, Calculator.add("1,2,3,4,5"));
	}
	@Test
	public void testUnknownNumbers2(){
		assertEquals(21, Calculator.add("1,2,3,4,5,6"));
	}
	@Test
	public void testStringWithNewLine(){
		assertEquals(6, Calculator.add("1\n2,3"));
	}
	@Test
	public void testStringWithNegativeNumbers(){
		try {
    	assertEquals("number cannot be negative", Calculator.add("-1, 2"));
		} 
		catch (Exception e) {
    	String expectedMessage = "number cannot be negative";
    	assertEquals( "Exception message must be correct", expectedMessage, e.getMessage() );
		}
	}  
}