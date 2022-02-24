/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author Andres
 */
public class BasicOperation {
    
    public float add(float addend1, float addend2){
        float total;
        total = addend1 + addend2;
        return total;
    }
    public float subtract(float minuend, float subtrahend){
        float difference;
        difference = minuend - subtrahend;
        return difference;
    }
    public float multiplication(float multiplying, float multiplier){
        float product;
        product = multiplying * multiplier;
        return product;
    }
    public float division(float dividend, float divider){
        float quotient;
        quotient = dividend / divider;
        return quotient;
    }
}
