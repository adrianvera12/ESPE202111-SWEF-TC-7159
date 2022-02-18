
package utils;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;



/**
 *
 * @author Edison Lascano, DCCO-ESPE
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
        assertEquals(expResult, result, 0.0000001);

    }

    @Test
    public void testAddNegatives() {
        System.out.println("add");
        float addend1 = -23.0F;
        float addend2 = -45.1F;
        BasicOperation instance = new BasicOperation();
        float expResult = -68.1F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);

    }
    
    
    /**
     * Test of subtract method, of class BasicOperation.
     */
    @Test
    public void testSubtract() {
//        System.out.println("subtract");
//        float minuend = 3.2F;
//        float subtrahend = 4.6F;
//        BasicOperation instance = new BasicOperation();
//        float expResult = -1.40000F;
//        float result = instance.subtract(minuend, subtrahend);
//        assertEquals(expResult, result, 0.0);

    }
    
}
