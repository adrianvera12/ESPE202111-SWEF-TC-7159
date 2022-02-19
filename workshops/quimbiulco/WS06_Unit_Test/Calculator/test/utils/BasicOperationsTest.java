/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package utils;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juan Diego
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
        float adden1 = 3.2F;
        float adden2 = 4.6F;
        BasicOperations instance = new BasicOperations();
        float expResult = 7.8F;
        float result = instance.add(adden1, adden2);
        assertEquals(expResult, result, 0.0001);
        
    }


    /**
     * Test of multiplication method, of class BasicOperations.
     */
    @Test
    public void testMultiplication() {
        System.out.println("multiplication");
        float multiplier = 4.2F;
        float multiplicand = 3.6F;
        BasicOperations instance = new BasicOperations();
        float expResult = 15.12F;
        float result = instance.multiplication(multiplier, multiplicand);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of division method, of class BasicOperations.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        float dividend = 30.0F;
        float divisor = 2.0F;
        BasicOperations instance = new BasicOperations();
        float expResult = 15.0F;
        float result = instance.division(dividend, divisor);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        
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
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
