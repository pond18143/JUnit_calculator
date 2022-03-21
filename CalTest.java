import junit.framework.*;
import org.junit.Before;
import org.junit.Test;

public class CalTest extends TestCase {
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test //Addition
    public void testAddition() {
        assertEquals("Adding 3 + 4 ", 7.0, Calculator.add(3, 4));
        assertEquals("Adding -10 + 1 ", -9.0, Calculator.add(-10, 1));
        assertEquals("Adding 5.5 + 4.4 ", 9.9, Calculator.add(5.5, 4.4));
        System.out.println("testAddition Passed");
    }

    @Test //Subtraction
    public void testSubtraction() {
        assertEquals("Subtracting 5 - 4 ", 1.0, Calculator.subtract(5, 4));
        assertEquals("Subtracting -10 - 4 ", -14.0, Calculator.subtract(-10, 4));
        assertEquals("Subtracting 10.5 - 4.25 ", 6.25, Calculator.subtract(10.5, 4.25));
        System.out.println("testSubtraction Passed");
    }

    @Test //Multiplication
    public void testMultiplication() {
        assertEquals("Multiplying 3 * 4 ", 12.0, Calculator.multiply(3, 4));
        assertEquals("Multiplying -10 * 4 ", -40.0, Calculator.multiply(-10, 4));
        assertEquals("Multiplying 5.5 * 3 ", 16.5, Calculator.multiply(5.5, 3));
        System.out.println("testMultiplication Passed");
    }

    @Test //Division
    public void testDivision() {
        assertEquals("Dividing 10 / 5 ", 2.0, Calculator.divide(10, 5));
        assertEquals("Dividing -15 / 3 ", -5.0, Calculator.divide(-15, 3));
        assertEquals("Dividing 9.9 / 3.3 ", 3.0000000000000004, Calculator.divide(9.9, 3.3));
        System.out.println("testDivision Passed");
    }

    @Test //DivisionByZero
    public void testDivisionByZero() {
        try {
            Calculator.divide(9, 0);
            fail("testDivisionByZero Failed");
        }
        catch (ArithmeticException e) {
            System.out.println("testDivisionByZero Passed");
        }
    }
}