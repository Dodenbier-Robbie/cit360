/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.view;

import cit360.control.ApplicationController;
import java.util.Scanner;

/**
 *
 * @author rdodenbier
 */
public class MathCalculatorView {
    
    public void MathCalculatorView() {
        
    }
    
    public void getMathInput() {
        ApplicationController delegate = new ApplicationController();
        int number1 = 0;
        int number2 = 0;
        String operator;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        number1 = Integer.parseInt(in.nextLine());
        System.out.println("Enter a math operator (+, -, *, /): ");
        operator = in.nextLine();
        System.out.println("Enter another number: ");
        number2 = Integer.parseInt(in.nextLine());
        
        System.out.print("\n" + number1 + " " + operator + " " + number2 + " = ");
        delegate.handleMathCommands(operator, number1, number2);
    }
}
