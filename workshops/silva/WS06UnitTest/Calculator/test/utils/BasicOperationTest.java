
package utils;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author raulSilva29
 */
public class BasicOperationTest{
    
    public BasicOperationTest() {
    }

    /**
     * Test of add method, of class BasicOperation.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        float adden1 = 3.2F;
        float adden2 = 4.6F;
        BasicOperation instance = new BasicOperation();
        float expResult = 7.8F;
        float result = instance.add(adden1, adden2);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
    }

     /**
     * Test of subtruct method, of class BasicOperation.
     */
    @Test
    public void testSubtruct() {
        System.out.println("subtract");
        float minuend = 3.2F;
        float sustrahend = 4.6F;
        BasicOperation instance = new BasicOperation();
        float expResult =-1.4F;
        float result = instance.subtract(minuend, sustrahend);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
    }
    /**
     * Test of Operation method, of class BasicOperation.
     */
    @Test
    public void testOperation() {
        System.out.println("Operation");
        float multiplier = 5.0F;
        float multiplicand = 5.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 25.0F;
        float result = instance.multiplication(multiplier , multiplicand);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default 
    }
    /**
     * Test of Division method, of class BasicOperation.
     */
    @Test
    public void testDivision() {
        System.out.println("Division");
        float dividen = 10.0F;
        float Quotient = 2.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 5.0F;
        float result = instance.division(dividen, Quotient);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
    }
}