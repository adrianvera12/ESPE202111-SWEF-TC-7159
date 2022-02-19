/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lenovo-PC
 */
public class BasicOperationsTest {
    
    public BasicOperationsTest() {
    }

    /**
     * Test of add method, of class BasicOperations.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        float adden1 = 0.0F;
        float adden2 = 0.0F;
        BasicOperations instance = new BasicOperations();
        float expResult = 0.0F;
        float result = instance.add(adden1, adden2);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of subtract method, of class BasicOperations.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        float minuend = 0.0F;
        float sustrahend = 0.0F;
        BasicOperations instance = new BasicOperations();
        float expResult = 0.0F;
        float result = instance.subtract(minuend, sustrahend);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of multiplication method, of class BasicOperations.
     */
    @Test
    public void testMultiplication() {
        System.out.println("multiplication");
        float multiplier = 0.0F;
        float multiplicand = 0.0F;
        BasicOperations instance = new BasicOperations();
        float expResult = 0.0F;
        float result = instance.multiplication(multiplier, multiplicand);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of division method, of class BasicOperations.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        float dividend = 0.0F;
        float divisor = 1.0F;
        BasicOperations instance = new BasicOperations();
        float expResult = 0.0F;
        float result = instance.division(dividend, divisor);
        assertEquals(expResult, result, 0.0);
        
    }
    
}
