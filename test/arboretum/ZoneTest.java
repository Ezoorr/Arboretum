/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package arboretum;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author cemko
 */
public class ZoneTest {
    
    public ZoneTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Zone.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Zone instance = new Zone();
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNom method, of class Zone.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        Zone instance = new Zone();
        String expResult = "";
        String result = instance.getNom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArbres method, of class Zone.
     */
    @Test
    public void testGetArbres() {
        System.out.println("getArbres");
        Zone instance = new Zone();
        ArrayList<Arbre> expResult = null;
        ArrayList<Arbre> result = instance.getArbres();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Zone.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        String id = "";
        Zone instance = new Zone();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNom method, of class Zone.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String nom = "";
        Zone instance = new Zone();
        instance.setNom(nom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArbres method, of class Zone.
     */
    @Test
    public void testSetArbres() {
        System.out.println("setArbres");
        ArrayList<Arbre> lesArbres = null;
        Zone instance = new Zone();
        instance.setArbres(lesArbres);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Zone.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Zone instance = new Zone();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
