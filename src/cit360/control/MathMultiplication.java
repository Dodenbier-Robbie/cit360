/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.control;

/**
 *
 * @author rdodenbier
 */
public class MathMultiplication implements DoMathCalculation {
    
    public void execute(int number1, int number2) {
        int result = number1 * number2;
        System.out.println(result);
    }
}