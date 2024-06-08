/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fretiere
 */
public class TestLogger {

    private final static Logger LOGGER = Logger.getLogger("arboretum");
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LOGGER.info("salut");
        LOGGER.warning("attention");
        LOGGER.log(Level.SEVERE, "c'est grave");
        LOGGER.info("fin");
        
        
    try {
      FileHandler fh = new FileHandler("TestLogging.log");
      LOGGER.addHandler(fh);
    } catch (SecurityException e) {
      LOGGER.severe("Impossible d'associer le FileHandler");
    } catch (IOException e) {
      LOGGER.severe("Impossible d'associer le FileHandler");
    }
    LOGGER.info("Lancement de l'application");
    }
    
}
