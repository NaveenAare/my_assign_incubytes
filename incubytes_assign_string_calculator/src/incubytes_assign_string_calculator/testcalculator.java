package incubytes_assign_string_calculator;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Test
public class testcalculator {
	private Calculator calculator ;
	@BeforeTest
	public void init() {
		calculator = new Calculator();
		
	}
	@Test
	public void testEmptyString() {
		assertEquals(0, calculator.add(""));
	}

	@Test
	public void testOneNumber() {
		assertEquals(1, calculator.add("1"));
	}

	@Test
	public void testTwoNumbers(){
		assertEquals(3, calculator.add("1,2"));
	}

	@Test
    public void testUnknowamountNumbers(){
    	assertEquals(10, calculator.add("1,2,3,4"));
    }

    @Test
    public void testNewLine(){
    	assertEquals(6, calculator.add("1\n2,3"));
    }

    @Test
    public void testNegativeNumver(){
    	try {
    		calculator.add("-1,2");
		}
		catch (IllegalArgumentException e){
			assertEquals(e.getMessage(), "Negatives are not allowed: -1");
		}

		try {
			calculator.add("2,-4,3,-5");
		}
		catch (IllegalArgumentException e){
			assertEquals(e.getMessage(), "Negatives are not allowed: -4,-5");
		}
    }

    @Test
    public void testOverThousand(){
    	assertEquals(2, calculator.add("1000,2"));
    }

    @Test
    public void testOtherDelimiter(){
    	assertEquals(3, calculator.add("//;\n1;2"));
    }

}
