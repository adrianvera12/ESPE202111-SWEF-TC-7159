
package utils;

/**
 *
 * @author Sebastian PC
 */
public class BasicOperation {
    
    public float add(float addend1, float addend2) {
        float total;
        total = addend1 + addend2;
        return total;
    }
    public float subtract(float minuend, float subtrahend) {
        float difference;
        difference = minuend - subtrahend;
        return difference;
    }
    public float multiplication (float multiplier, float multiplicand){
        float product;
        product = multiplier * multiplicand;
        return product;
    }
        public float division (float dividendo, float divisor){
        float division;
        division = dividendo / divisor;
        return division;
    }
}
