/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit9_b;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jose Miguel Dura Sirvent
 */
public class AlumnoTest {
   
    @Test
    public void testValidaNif() {
        System.out.println("validaNif");
        String nif = "48669823Y";
        Alumno instance = new Alumno();
        boolean expResult = true;
        boolean result = instance.validaNif(nif);
        assertEquals(expResult, result);
        
        nif="4866982Y";
        expResult=false;
        result=instance.validaNif(nif);
        assertEquals(expResult,result);
        
        nif="";
        expResult=false;
        result=instance.validaNif(nif);
        assertEquals(expResult,result);
        
        nif="Y48669823";
        expResult=false;
        result=instance.validaNif(nif);
        assertEquals(expResult,result);
        
        nif="48669823O";
        expResult=false;
        result=instance.validaNif(nif);
        assertEquals(expResult,result);
        
        
        
    }

    @Test
    public void testCalculaTasaMatricula() {
        System.out.println("calculaTasaMatricula");
        int edad = 15;
        boolean familiaNumerosa = false;
        boolean repetidor = true;
        Alumno instance = new Alumno();
        float expResult = 2000.0F;
        float result = instance.calculaTasaMatricula(edad, familiaNumerosa, repetidor);
        assertEquals(expResult, result, 0.0);
        
        edad = 15;
        familiaNumerosa = true;
        repetidor = true;
        expResult = 250.0F;
        result = instance.calculaTasaMatricula(edad, familiaNumerosa, repetidor);
        assertEquals(expResult, result, 0.0);
        
        edad = 70;
        familiaNumerosa = false;
        repetidor = true;
        expResult = 250.0F;
        result = instance.calculaTasaMatricula(edad, familiaNumerosa, repetidor);
        assertEquals(expResult, result, 0.0);
        
        edad = 55;
        familiaNumerosa = false;
        repetidor = false;
        expResult = 400.0F;
        result = instance.calculaTasaMatricula(edad, familiaNumerosa, repetidor);
        assertEquals(expResult, result, 0.0);
        
        edad = 15;
        familiaNumerosa = false;
        repetidor = false;
        expResult = 500.0F;
        result = instance.calculaTasaMatricula(edad, familiaNumerosa, repetidor);
        assertEquals(expResult, result, 0.0);
    }
    
}
