/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kidacademy.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rdodenbier
 */
public class MathControlTest {
    
    public MathControlTest() {
    }

    /**
     * Test of calcVolumeTrianglePrism method, of class MathControl.
     */
    @Test
    public void testCalcVolumeTrianglePrism() throws Exception {
        System.out.println("calcVolumeTrianglePrism");
        double base = 0.0;
        double length = 0.0;
        double height = 0.0;
        MathControl instance = new MathControl();
        double expResult = 0.0;
        double result = instance.calcVolumeTrianglePrism(base, length, height);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcAreaTrapezoid method, of class MathControl.
     */
    @Test
    public void testCalcAreaTrapezoid() throws Exception {
        System.out.println("calcAreaTrapezoid");
        double base1 = 0.0;
        double base2 = 0.0;
        double height = 0.0;
        MathControl instance = new MathControl();
        double expResult = 0.0;
        double result = instance.calcAreaTrapezoid(base1, base2, height);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcDistanceTwoPoints method, of class MathControl.
     */
    @Test
    public void testCalcDistanceTwoPoints() throws Exception {
        System.out.println("calcDistanceTwoPoints Unit 1 Test");
        double x1 = 10.0;
        double x2 = 20.0;
        double y1 = 5.0;
        double y2 = 15.0;
        MathControl instance = new MathControl();
        double expResult = 14.14213562;
        double result = instance.calcDistanceTwoPoints(x1, x2, y1, y2);
        assertEquals(expResult, result, 0.00000001);
        
        System.out.println("calcDistanceTwoPoints Unit 2 Test");
        x1 = 10.0;
        x2 = 10.0;
        y1 = 10.0;
        y2 = 10.0;
        expResult = -1;
        result = instance.calcDistanceTwoPoints(x1, x2, y1, y2);
        assertEquals(expResult, result, 0.0);
            
        System.out.println("calcDistanceTwoPoints Unit 3 Test");
        x1 = 0.0;
        x2 = -1.0;
        y1 = 1.0;
        y2 = -1.0;
        expResult = 2.23606797749979;
        result = instance.calcDistanceTwoPoints(x1, x2, y1, y2);
        assertEquals(expResult, result, 0.00000000000001);
        
        System.out.println("calcDistanceTwoPoints Unit 4 Test");
        x1 = 100.0;
        x2 = 50.0;
        y1 = -50.0;
        y2 = -100.0;
        expResult = 70.71067811865476;
        result = instance.calcDistanceTwoPoints(x1, x2, y1, y2);
        assertEquals(expResult, result, 0.00000000000001);
    }

    /**
     * Test of calcTempConversion method, of class MathControl.
     */
    @Test
    public void testCalcTempConversion() throws Exception {
        System.out.println("calcTempConversion");
        double degreeF = 0.0;
        MathControl instance = new MathControl();
        double expResult = 0.0;
        double result = instance.calcTempConversion(degreeF);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
