/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.control;

import static java.lang.Math.pow;

/**
 *
 * @author rdodenbier
 */
public class MathPower implements DoMathCalculation {
    
    public void execute(int number1, int number2) {
        int result = (int) pow(number1,number2);
        System.out.println(result);
    }
}
