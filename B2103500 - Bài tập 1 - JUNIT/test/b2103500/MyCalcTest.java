/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b2103500;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author student
 */
public class MyCalcTest {
    
    public MyCalcTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class MyCalc.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        double a = 5;
        double b = 6;
        double expResult = 11;
        double result = MyCalc.add(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of sub method, of class MyCalc.
     */
    @Test
    public void testSub() {
        System.out.println("sub");
        double a = 10;
        double b = 2;
        double expResult = 8;
        double result = MyCalc.sub(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of div method, of class MyCalc.
     */
    @Test
    public void testDiv() {
        System.out.println("div");
        double a = 10;
        double b = 2;
        double expResult = 5;
        double result = MyCalc.div(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of min method, of class MyCalc.
     */
    @Test
    public void testMin() {
        System.out.println("min");
        double a = 1;
        double b = -10;
        double expResult = -10;
        double result = MyCalc.min(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of max method, of class MyCalc.
     */
    @Test
    public void testMax() {
        System.out.println("max");
        double a = -10;
        double b = 1;
        double expResult = 1;
        double result = MyCalc.max(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of mul method, of class MyCalc.
     */
    @Test
    public void testMul() {
        System.out.println("mul");
        double a = 2;
        int b = 3;
        double expResult = 8;
        double result = MyCalc.mul(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of equal method, of class MyCalc.
     */
    @Test
    public void testEqual() {
        System.out.println("equal");
        int a = 10;
        int b = 10;
        boolean expResult = true;
        boolean result = MyCalc.equal(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of qrt method, of class MyCalc.
     */
    @Test
    public void testQrt() {
        System.out.println("qrt");
        double a = 10;
        double expResult = 100;
        double result = MyCalc.qrt(a);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of progression method, of class MyCalc.
     */
    @Test
    public void testProgression() {
        System.out.println("progression");
        int x = 2;
        int d = 3;
        int n = 2;
        int expResult = 5;
        int result = MyCalc.progression(x, d, n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of sumProgression method, of class MyCalc.
     */
    @Test
    public void testSumProgression() {
        System.out.println("sumProgression");
        int x = 2;
        int d = 3;
        int n = 2;
        int expResult = 7;
        int result = MyCalc.sumProgression(x, d, n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
