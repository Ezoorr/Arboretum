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
public class ArbreNGTest {
    
    public ArbreNGTest() {
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
     * Test of getId method, of class Arbre.
     */
    @Test
    public void testGetId() {
       System.out.println("getId");
  Arbre instance = new Arbre(1, "viel arbre", 1890, "photo", true, null, null);
  int expResult = 1;
  int result = instance.getId();
  assertEquals(result, expResult);

    }

    /**
     * Test of getDescription method, of class Arbre.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Arbre instance = new Arbre();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAnneePlantation method, of class Arbre.
     */
    @Test
    public void testGetAnneePlantation() {
        System.out.println("getAnneePlantation");
        Arbre instance = new Arbre();
        int expResult = 0;
        int result = instance.getAnneePlantation();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPhoto method, of class Arbre.
     */
    @Test
    public void testGetPhoto() {
        System.out.println("getPhoto");
        Arbre instance = new Arbre();
        String expResult = "";
        String result = instance.getPhoto();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEspece method, of class Arbre.
     */
    @Test
    public void testGetEspece() {
        System.out.println("getEspece");
        Arbre instance = new Arbre();
        Espece expResult = null;
        Espece result = instance.getEspece();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getZone method, of class Arbre.
     */
    @Test
    public void testGetZone() {
        System.out.println("getZone");
        Arbre instance = new Arbre();
        Zone expResult = null;
        Zone result = instance.getZone();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isRemarquable method, of class Arbre.
     */
    @Test
    public void testIsRemarquable() {
        System.out.println("isRemarquable");
        Arbre instance = new Arbre();
        boolean expResult = false;
        boolean result = instance.isRemarquable();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Arbre.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Arbre instance = new Arbre();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class Arbre.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        Arbre instance = new Arbre();
        instance.setDescription(description);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAnneePlantation method, of class Arbre.
     */
    @Test
    public void testSetAnneePlantation() {
        System.out.println("setAnneePlantation");
        int anneePlantation = 0;
        Arbre instance = new Arbre();
        instance.setAnneePlantation(anneePlantation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPhoto method, of class Arbre.
     */
    @Test
    public void testSetPhoto() {
        System.out.println("setPhoto");
        String photo = "";
        Arbre instance = new Arbre();
        instance.setPhoto(photo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRemarquable method, of class Arbre.
     */
    @Test
    public void testSetRemarquable() {
        System.out.println("setRemarquable");
        boolean remarquable = false;
        Arbre instance = new Arbre();
        instance.setRemarquable(remarquable);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEspece method, of class Arbre.
     */
    @Test
    public void testSetEspece() {
        System.out.println("setEspece");
        Espece lEspece = null;
        Arbre instance = new Arbre();
        instance.setEspece(lEspece);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setZone method, of class Arbre.
     */
    @Test
    public void testSetZone() {
        System.out.println("setZone");
        Zone laZone = null;
        Arbre instance = new Arbre();
        instance.setZone(laZone);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Arbre.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Arbre instance = new Arbre();
        String expResult = "";
        String result = instance.toString();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNomEspece method, of class Arbre.
     */
    @Test
    public void testGetNomEspece() {
        System.out.println("testGetNomEspece");
    Arbre instance = new Arbre();
    String expResult = "";
    String result = instance.getNomEspece();
    assertEquals(result, expResult);
    }

    /**
     * Test of getAge method, of class Arbre.
     */
    @Test
    public void testGetAge() {
         System.out.println("testGetAge");
    Arbre instance = new Arbre();
    int expResult = 0;
    int result = instance.getAge();
    assertEquals(result, expResult);
    }
    
}
