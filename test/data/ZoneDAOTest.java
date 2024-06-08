/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package data;

import arboretum.Arbre;
import arboretum.Zone;
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
public class ZoneDAOTest {
    
    public ZoneDAOTest() {
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
     * Test of getArbresParZones method, of class ZoneDAO.
     */
    @Test
    public void testGetArbresParZones() {
        System.out.println("getArbresParZones");
        String idZones = "";
        ArrayList<Arbre> expResult = null;
        ArrayList<Arbre> result = ZoneDAO.getArbresParZones(idZones);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getZones method, of class ZoneDAO.
     */
    @Test
    public void testGetZones() {
        System.out.println("getZones");
        ArrayList<Zone> expResult = new ArrayList<Zone>();
        Zone amer = new Zone("AMER", "américaine");
        ArrayList<Zone> result = ZoneDAO.getZones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
