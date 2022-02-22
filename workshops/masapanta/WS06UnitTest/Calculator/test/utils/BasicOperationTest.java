/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;


/**
 *
 * @author Jefferson
 */
public class BasicOperationTest {
    
    public BasicOperationTest() {
    }

    /**
     * Test of add method, of class BasicOperation.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        float addend1 = 3.2F;
        float addend2 = 4.6F;
        BasicOperation instance = new BasicOperation();
        float expResult = 7.8F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }
    public void testAddNegatives() {
        System.out.println("add");
        float addend1 = -23.0F;
        float addend2 = -45.1F;
        BasicOperation instance = new BasicOperation();
        float expResult = -68.1F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of subtruct method, of class BasicOperation.
     */
    @Test
    public void testSubtruct() {
        System.out.println("subtruct");
        float minuend = 3.2F;
        float asubtrahend = 4.6F;
        BasicOperation instance = new BasicOperation();
        float expResult = -1.4F;
        float result = instance.subtruct(minuend, asubtrahend);
        assertEquals(expResult, result, 0.00001);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of multiplication method, of class BasicOperation.
     */
    @Test
    public void testMultiplication() {
        System.out.println("multiplication");
        float multiplier = 0.0F;
        float multiplicand = 0.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 0.0F;
        float result = instance.multiplication(multiplier, multiplicand);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of division method, of class BasicOperation.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        float dividend = 0.0F;
        float divisor = 3.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 0.0F;
        float result = instance.division(dividend, divisor);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
