
package utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Alexander Villacres
 */
public class BasicOperationTest {

    public BasicOperationTest() {
    }


    @Test
    public void testAdd() {
        System.out.println("add");
        float addend1 = 0.0F;
        float addend2 = 0.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 0.0F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);

    }


    @Test
    public void testSubtract() {
        System.out.println("subtract");
        float minuend = 0.0F;
        float subtrahend = 0.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 0.0F;
        float result = instance.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);

    }


    @Test
    public void testMultiplication() {
        System.out.println("multiplication");
        float multiplier = 0.0F;
        float multiplicand = 0.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 0.0F;
        float result = instance.multiplication(multiplier, multiplicand);
        assertEquals(expResult, result, 0.0);

    }


    @Test
    public void testDivision() {
        System.out.println("division");
        float dividend = 0.0F;
        float divisor = 1.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 0.0F;
        float result = instance.division(dividend, divisor);
        assertEquals(expResult, result, 0.0001);

    }

}