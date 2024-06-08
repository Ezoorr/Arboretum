/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package arboretum;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Kocturk
 */
public class UtilisateurNGTest {
    
    public UtilisateurNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getId method, of class Utilisateur.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Utilisateur instance = new Utilisateur();
        String expResult = "";
        String result = instance.getId();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Utilisateur.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        String id = "";
        Utilisateur instance = new Utilisateur();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMotDePasse method, of class Utilisateur.
     */
    @Test
    public void testGetMotDePasse() {
        System.out.println("getMotDePasse");
        Utilisateur instance = new Utilisateur();
        String expResult = "";
        String result = instance.getMotDePasse();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMotDePasse method, of class Utilisateur.
     */
    @Test
    public void testSetMotDePasse() {
        System.out.println("setMotDePasse");
        String motDePasse = "";
        Utilisateur instance = new Utilisateur();
        instance.setMotDePasse(motDePasse);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNom method, of class Utilisateur.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        Utilisateur instance = new Utilisateur();
        String expResult = "";
        String result = instance.getNom();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrenom method, of class Utilisateur.
     */
    @Test
    public void testGetPrenom() {
        System.out.println("getPrenom");
        Utilisateur instance = new Utilisateur();
        String expResult = "";
        String result = instance.getPrenom();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNom method, of class Utilisateur.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String unNom = "";
        Utilisateur instance = new Utilisateur();
        instance.setNom(unNom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrenom method, of class Utilisateur.
     */
    @Test
    public void testSetPrenom() {
        System.out.println("setPrenom");
        String unPrenom = "";
        Utilisateur instance = new Utilisateur();
        instance.setPrenom(unPrenom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Utilisateur.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Utilisateur instance = new Utilisateur();
        String expResult = "";
        String result = instance.toString();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hacher method, of class Utilisateur.
     */
    @Test
public void testHacher() {
    Utilisateur utilisateur = new Utilisateur();
    String resultat = utilisateur.hacher("SHA-256","@dmin2024");
    assertEquals("6f4fa8ba7b9141a21d0fc6618653702740d1c10fb76997deb0d7f6f62ac1c4c3", resultat);
}
    
}
