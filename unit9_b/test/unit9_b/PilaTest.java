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
        boolean expResult = false;
        boolean result = instance.estaVacia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of desapilar method, of class Pila.
     */
    @Test
    public void testDesapilar() {
        System.out.println("desapilar");
        Pila instance = new Pila();
        int expResult = 0;
        int result = instance.desapilar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of vaciar method, of class Pila.
     */
    @Test
    public void testVaciar() {
        System.out.println("vaciar");
        Pila instance = new Pila();
        instance.vaciar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
