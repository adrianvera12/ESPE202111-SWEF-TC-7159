
package utils;

/**
 *
 * @author Jefferson
 */
public class BasicOperation {
    public  float add(float addend1, float addend2){
        float total;
        total=addend1 + addend2;
        return total;  
    }
    public float subtruct (float minuend, float asubtrahend){
        float difference;
        difference = minuend - asubtrahend ;
        return difference;
    }
    public float multiplication (float multiplier, float multiplicand){
        float product;
        product = multiplier * multiplicand;
        return product;
    }
        public float division (float dividend, float divisor){
        float division;
        division = dividend / divisor;
        return division;
    }
}
