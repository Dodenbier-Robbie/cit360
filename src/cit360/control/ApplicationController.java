/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.control;

import java.util.HashMap;

/**
 *
 * @author rdodenbier
 */
public class ApplicationController {
    
    public static HashMap<String, DoMathCalculation> mathCommands = new HashMap<String, DoMathCalculation>();
    
    public void ApplicationController() {
        
    }
    
    public static void handleMathCommands(String operator, int number1, int number2) {
        
        mathCommands.put("+", new MathAddition());
        mathCommands.put("-", new MathSubtraction());
        mathCommands.put("*", new MathMultiplication());
        mathCommands.put("/", new MathDivision());
        mathCommands.put("^", new MathPower());
        
        DoMathCalculation mathCalc = mathCommands.get(operator);
        
        mathCalc.execute(number1, number2);
    }
    
}
