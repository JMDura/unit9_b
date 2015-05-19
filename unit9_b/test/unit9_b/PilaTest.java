package unit9_b;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rosa Medina
 * @author Jose Miguel Dura Sirvent
 */
public class PilaTest {
    
    public PilaTest() {
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
     * Test of estaVacia method, of class Pila.
     */
    @Test
    public void testEstaVacia() {
        System.out.println("estaVacia");
        Pila instance = new Pila();
        boolean expResult = true;
        boolean result = instance.estaVacia();
        assertEquals(expResult, result);
        
        instance.apilar(5);
        expResult=false;
        result=instance.estaVacia();
        assertEquals(expResult,result);
    }

    /**
     * Test of estaLlena method, of class Pila.
     */
    @Test
    public void testEstaLlena() {
        System.out.println("estaLlena");
        Pila instance = new Pila();
        boolean expResult = false;
        boolean result = instance.estaLlena();
        assertEquals(expResult, result);
        
        instance.apilar(5);
        instance.apilar(5);
        instance.apilar(5);
        instance.apilar(5);
        instance.apilar(5);
        expResult=true;
        result=instance.estaLlena();
        assertEquals(expResult,result);
    }

    /**
     * Test of apilar method, of class Pila.
     */
    @Test
    public void testApilar() {
        System.out.println("apilar");
        int valor = 0;
        Pila instance = new Pila();
        instance.apilar(valor);
    }

    /**
     * Test of desapilar method, of class Pila.
     */
    @Test
    public void testDesapilar() {
        System.out.println("desapilar");
        Pila instance = new Pila();
        instance.apilar(5);
        int expResult = 5;
        int result = instance.desapilar();
        assertEquals(expResult, result);
    }

    /**
     * Test of vaciar method, of class Pila.
     */
    @Test
    public void testVaciar() {
        System.out.println("vaciar");
        Pila instance = new Pila();
        instance.vaciar();
    }
    
}
