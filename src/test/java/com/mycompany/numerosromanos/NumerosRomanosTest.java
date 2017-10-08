/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.numerosromanos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eliez
 */
public class NumerosRomanosTest {
    
    public NumerosRomanosTest() {
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
     * Test of MostraCorrespondente method, of class NumerosRomanos.
     */
    @Test
    public void testMostraCorrespondente() {
        System.out.println("TESTE 1");
        int numero = 2;
        NumerosRomanos instance = new NumerosRomanos();
        String expResult = "II";
        String result = instance.MostraCorrespondente(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testMostraCorrespondente2() {
        System.out.println("TESTE 2");
        int numero = 10;
        NumerosRomanos instance = new NumerosRomanos();
        String expResult = "X";
        String result = instance.MostraCorrespondente(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testMostraCorrespondente3() {
        System.out.println("TESTE 3");
        int numero = 1000;
        NumerosRomanos instance = new NumerosRomanos();
        String expResult = "M";
        String result = instance.MostraCorrespondente(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testMostraCorrespondente4() {
        System.out.println("TESTE 4");
        int numero = 600;
        NumerosRomanos instance = new NumerosRomanos();
        String expResult = "DC";
        String result = instance.MostraCorrespondente(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testMostraCorrespondente5() {
        System.out.println("TESTE 5");
        int numero = 19;
        NumerosRomanos instance = new NumerosRomanos();
        String expResult = "XIX";
        String result = instance.MostraCorrespondente(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testMostraCorrespondente6() {
        System.out.println("TESTE 6");
        int numero = 3000;
        NumerosRomanos instance = new NumerosRomanos();
        String expResult = "MMM";
        String result = instance.MostraCorrespondente(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testMostraCorrespondente7() {
        System.out.println("TESTE 7");
        int numero = 4;
        NumerosRomanos instance = new NumerosRomanos();
        String expResult = "IV";
        String result = instance.MostraCorrespondente(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testMostraCorrespondente8() {
        System.out.println("TESTE 8");
        int numero = 42;
        NumerosRomanos instance = new NumerosRomanos();
        String expResult = "XLII";
        String result = instance.MostraCorrespondente(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testMostraCorrespondente9() {
        System.out.println("TESTE 9");
        int numero = 910;
        NumerosRomanos instance = new NumerosRomanos();
        String expResult = "CMX";
        String result = instance.MostraCorrespondente(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testMostraCorrespondente10() {
        System.out.println("TESTE 10");
        int numero = 3000;
        NumerosRomanos instance = new NumerosRomanos();
        String expResult = "MMM";
        String result = instance.MostraCorrespondente(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }   
    
     @Test
    public void testMostraCorrespondente11() {
        System.out.println("TESTE 11");
        int numero = 51;
        NumerosRomanos instance = new NumerosRomanos();
        String expResult = "LI";
        String result = instance.MostraCorrespondente(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    } 
    
     @Test
    public void testMostraCorrespondente12() {
        System.out.println("TESTE 12");
        int numero = 95;
        NumerosRomanos instance = new NumerosRomanos();
        String expResult = "XCV";
        String result = instance.MostraCorrespondente(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    } 
    
     @Test
    public void testMostraCorrespondente13() {
        System.out.println("TESTE 13");
        int numero = 7;
        NumerosRomanos instance = new NumerosRomanos();
        String expResult = "VII";
        String result = instance.MostraCorrespondente(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    } 
    
    @Test
    public void testMostraCorrespondente14() {
        System.out.println("TESTE 10");
        int numero = 444;
        NumerosRomanos instance = new NumerosRomanos();
        String expResult = "CDXLIV";
        String result = instance.MostraCorrespondente(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    } 
}
