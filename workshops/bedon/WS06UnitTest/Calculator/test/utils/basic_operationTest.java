/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package utils;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;


/**
 *
 * @author alexa
 */
public class basic_operationTest {
    
    public basic_operationTest() {
    }

    /**
     * Test of add method, of class basic_operation.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        float adden1 = 0.0F;
        float adden2 = 0.0F;
        basic_operation instance = new basic_operation();
        float expResult = 0.0F;
        float result = instance.add(adden1, adden2);
        assertEquals(expResult, result, 0.0);
    
    }

    /**
     * Test of subtract method, of class basic_operation.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        float minuend = 0.0F;
        float sustrahend = 0.0F;
        basic_operation instance = new basic_operation();
        float expResult = 0.0F;
        float result = instance.subtract(minuend, sustrahend);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of multiplication method, of class basic_operation.
     */
    @Test
    public void testMultiplication() {
        System.out.println("multiplication");
        float multiplier = 0.0F;
        float multiplicand = 0.0F;
        basic_operation instance = new basic_operation();
        float expResult = 0.0F;
        float result = instance.multiplication(multiplier, multiplicand);
        assertEquals(expResult, result, 0.0);
    
    }

    /**
     * Test of division method, of class basic_operation.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        float dividend = 0.0F;
        float divisor = 1.0F;
        basic_operation instance = new basic_operation();
        float expResult = 0.0F;
        float result = instance.division(dividend, divisor);
        assertEquals(expResult, result, 0.0);
        
    }
    
}
