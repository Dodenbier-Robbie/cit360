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
        System.out.println("calcDistanceTwoPoints");
        double x1 = 0.0;
        double x2 = 0.0;
        double y1 = 0.0;
        double y2 = 0.0;
        MathControl instance = new MathControl();
        double expResult = 0.0;
        double result = instance.calcDistanceTwoPoints(x1, x2, y1, y2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
