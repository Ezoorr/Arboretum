/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package data;

import arboretum.Espece;
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
public class EspeceDAOTest {
    
    public EspeceDAOTest() {
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
     * Test of getEspece method, of class EspeceDAO.
     */
    @Test
    public void testGetEspece() {
        System.out.println("getEspece");
        String idEspece = "";
        Espece expResult = null;
        Espece result = EspeceDAO.getEspece(idEspece);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEspeces method, of class EspeceDAO.
     */
    @Test
    public void testGetEspeces() {
        System.out.println("getEspeces");
        ArrayList<Espece> expResult = null;
        ArrayList<Espece> result = EspeceDAO.getEspeces();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNbEspeces method, of class EspeceDAO.
     */
    @Test
    public void testGetNbEspeces() {
        System.out.println("getNbEspeces");
        int expResult = 0;
        int result = EspeceDAO.getNbEspeces();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rechercherEspeces method, of class EspeceDAO.
     */
    @Test
    public void testRechercherEspeces() {
        System.out.println("rechercherEspeces");
        String motCle = "";
        ArrayList<Espece> expResult = null;
        ArrayList<Espece> result = EspeceDAO.rechercherEspeces(motCle);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGenre method, of class EspeceDAO.
     */
    @Test
    public void testGetGenre() {
        System.out.println("getGenre");
        ArrayList<String> expResult = null;
        ArrayList<String> result = EspeceDAO.getGenre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
