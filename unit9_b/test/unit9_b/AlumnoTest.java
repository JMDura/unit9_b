/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit9_b;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jose Miguel Dura Sirvent
 */
public class AlumnoTest {
    
    public AlumnoTest() {
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

    @Test
    public void testValidaNif() {
        System.out.println("validaNif");
        String nif = "";
        Alumno instance = new Alumno();
        boolean expResult = false;
        boolean result = instance.validaNif(nif);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCalculaTasaMatricula() {
        System.out.println("calculaTasaMatricula");
        int edad = 0;
        boolean familiaNumerosa = false;
        boolean repetidor = false;
        Alumno instance = new Alumno();
        float expResult = 0.0F;
        float result = instance.calculaTasaMatricula(edad, familiaNumerosa, repetidor);
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }
    
}
