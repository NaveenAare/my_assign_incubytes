# TDD Kata String Calculator

# All Tests

<h3> Test for Empty String</h3>

```java
@Test
public void testEmptyString() {
	assertEquals(0, calculator.add(""));
}

```
<h3> Test for single number</h3>

```java
@Test
public void testOneNumber() {
	assertEquals(1, calculator.add("1"));
}
```
<h3> Test for two numbers</h3>

```java
@Test
public void testTwoNumbers(){
	assertEquals(3, calculator.add("1,2"));
}
```
<h3> Test for Unknown Amount number</h3>

```java
@Test
public void testUnknowamountNumbers(){
    	assertEquals(10, calculator.add("1,2,3,4"));
   }
```
<h3> Test for new Line</h3>

```java
 @Test
   public void testNewLine(){
    	assertEquals(6, calculator.add("1\n2,3"));
    }

```
<h3> Test for Negative number</h3>

```java
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

```
<h3> Test for  number over 1000</h3>

```java
 @Test
    public void testOverThousand(){
    	assertEquals(2, calculator.add("1000,2"));
    }
```

<h3> Test for  other delimeter</h3>

```java
 @Test
    public void testOtherDelimiter(){
    	assertEquals(3, calculator.add("//;\n1;2"));
    }
```
