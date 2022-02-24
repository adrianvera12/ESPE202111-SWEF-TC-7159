/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Utils;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


//</editor-fold>

/**
 *
 * @author Carlos Granda
 */
public class BasicOperationTest {
    
    public BasicOperationTest() {
    }
    

    @Test
    public void testAdd() {
        System.out.println("add");
        float addend1 = 3.2F;
        float addend2 = 4.6F;
        BasicOperation instance = new BasicOperation();
        float expResult = 7.8F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0001);
        
    }
    @Test
    public void testAddnegatives() {
        System.out.println("add");
        float addend1 = -23.F;
        float addend2 = -45.1F;
        BasicOperation instance = new BasicOperation();
        float expResult = -68.1F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0001);
        
    }

    @Test
    public void testSubtruct() {
        System.out.println("subtruct");
        float minuend = 3.2F;
        float subtrahend = 4.6F;
        BasicOperation instance = new BasicOperation();
        float expResult = -1.4F;
        float result = instance.subtruct(minuend, subtrahend);
        assertEquals(expResult, result, 0.0001);
        
    }

    @Test
    public void testdivision() {
        System.out.println("division");
        float dividend = 30.0F;
        float divisor = 2.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 15.0F;
        float result = instance.division(dividend, divisor);
        assertEquals(expResult, result, 0.0001);
        
    }
    
    @Test
    public void testMultiplication() {
        System.out.println("multiplication");
        float multiplier = 3F;
        float multiplicand = 2F;
        BasicOperation instance = new BasicOperation();
        float expResult = 6F;
        float result = instance.multiplication(multiplier, multiplicand);
        assertEquals(expResult, result, 0.0001);
        
    }
   
}
