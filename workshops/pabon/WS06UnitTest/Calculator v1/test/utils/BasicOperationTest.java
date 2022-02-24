/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package utils;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;


/**
 *
 * @author Andres
 */
public class BasicOperationTest {
    

    /**
     * Test of add method, of class BasicOperation.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        float addend1 = -23.0F;
        float addend2 = -45.1F;
        BasicOperation instance = new BasicOperation();
        float expResult = -68.1F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        
    }

    @Test
    public void testAddNegatives() {
        System.out.println("add");
        float addend1 = 3.2F;
        float addend2 = 4.6F;
        BasicOperation instance = new BasicOperation();
        float expResult = 7.8F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        
    }
    /**
     * Test of subtract method, of class BasicOperation.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        float minuend = 3.2F;
        float subtrahend = 4.6F;
        BasicOperation instance = new BasicOperation();
        float expResult = -1.4F;
        float result = instance.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.00001);
        
    }

    /**
     * Test of multiplication method, of class BasicOperation.
     */
    @Test
    public void testMultiplication() {
        System.out.println("multiplication");
        float multiplying = 5.5F;
        float multiplier = 2.3F;
        BasicOperation instance = new BasicOperation();
        float expResult = 12.65F;
        float result = instance.multiplication(multiplying, multiplier);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of division method, of class BasicOperation.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        float dividend = 120.5F;
        float divider = 2.5F;
        BasicOperation instance = new BasicOperation();
        float expResult = 48.2F;
        float result = instance.division(dividend, divider);
        assertEquals(expResult, result, 0.0);
    }
    
}
