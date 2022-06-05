
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CalculatorTest {
    @Test
    public void testOfSum(){
        double resultOfSum = Calculator.sum(5,6);
        double expectedResult = 11.0;
        assertEquals(expectedResult,resultOfSum,expectedResult/(10^6));
    }

    @Test
    public void testOfSubtraction(){
        double resultOfSubtraction = Calculator.subtraction(15,6);
        double expectedResult = 9.0;
        assertEquals(expectedResult,resultOfSubtraction,expectedResult/(10^6));
    }

    @Test
    public void testOfMultiplication(){
        double resultOfMultiplication = Calculator.multiplication(15,6);
        double expectedResult = 90.0;
        assertEquals(expectedResult,resultOfMultiplication,expectedResult/(10^6));
    }

    @Test
    public void testOfDivision(){
        double resultOfDivision = Calculator.division(12,6);
        double expectedResult = 2.0;
        assertEquals(expectedResult,resultOfDivision,expectedResult/(10^6));
    }

    @Test
    public void by3Test(){
        assertTrue(Calculator.byThreeOrNotBy(9));

    }


}
