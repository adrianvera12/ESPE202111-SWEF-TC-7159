/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package utils;

import org.junit.Test;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;

/**
 *
 * @author raul2
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
        float adden1 = 3.2F;
        float adden2 = 4.6F;
        BasicOperation instance = new BasicOperation();
        float expResult = 7.8F;
        float result = instance.add(adden1, adden2);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subtruct method, of class BasicOperation.
     */
    @Test
    public void testSubtruct() {
        System.out.println("subtruct");
        float minuend = 0.0F;
        float sustrahend = 0.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 0.0F;
        float result = instance.subtruct(minuend, sustrahend);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
