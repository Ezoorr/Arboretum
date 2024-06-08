/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mathieu
 */
public class MonLogger
{
    public static boolean ACTIF = true;   
    
    private final static Logger LOGGER = Logger.getLogger("arboretum");
    
    static
    {
        try
        {
            FileHandler fh = new FileHandler("Arboretum.log");
            LOGGER.addHandler(fh);
        } 
        catch (Exception e) 
        {
            LOGGER.severe("Impossible d'associer le FileHandler");
        } 
    }
    
    public static void info(String message)
    {
        if (ACTIF)
            LOGGER.info(message);
    }
    
    public static void warning(String message)
    {
        if (ACTIF)
            LOGGER.warning(message);
    }
}
