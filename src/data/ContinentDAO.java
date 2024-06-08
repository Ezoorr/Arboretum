/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;

import arboretum.*;
import util.MonLogger;

/**
 * DAO pour les continents.
 * @author Mathieu
 */
public class ContinentDAO
{
    /**
     * Récupère un continent à partir de son identifiant.
     * @param idContinent L'id du continent
     * @return le continent
     */
    public static Continent getContinent(String idContinent)
    {
        Continent leContinent = null;
        try
	{	    	    
	    Statement stmt = Passerelle.getConnexion().createStatement();	    
	    String requete = "SELECT continent.id, continent.nom FROM continent "
            + " WHERE continent.id = '" + idContinent + "'";
            
            MonLogger.info(requete);
            
            ResultSet res = stmt.executeQuery(requete);	    
	    if ( res.next() ) 
            {
                String id, nom;

                id = res.getString("continent.id");
                nom = res.getString("continent.nom");
                
                leContinent = new Continent(id, nom);                                          
            }	    
	    res.close();
	    stmt.close();	    
	}
	catch (Exception exc)
	{
	    exc.printStackTrace();
	}        
        return leContinent;
    }    


    /**
     * Récupère la liste des continents classées par nom.
     * @return la liste des continents classées par nom
     */
    public static ArrayList<Continent> getContinents()
    {        
        ArrayList<Continent> liste = new ArrayList<Continent>();
        try
	{	    	    
	    Statement stmt = Passerelle.getConnexion().createStatement();
            String requete = "SELECT id, nom FROM continent ORDER BY nom ";
	    ResultSet res = stmt.executeQuery(requete);
            MonLogger.info(requete);
	    
	    while (res.next()) 
            {
                String id = res.getString("id");
                String nom = res.getString("nom");
                
                Continent unContinent = new Continent(id, nom);
                liste.add(unContinent);
            }	    
	    res.close();
	    stmt.close();	    
	}
	catch (Exception exc)
	{
	    exc.printStackTrace();
	}
	return liste;
    }
   
    
    /**
     * Récupère le nombre de continents.
     * @return le nombre de continents.
     */
    public static int getNbContinents()
    {        
        int nb = 0;
        try
	{	    	    
	    Statement stmt = Passerelle.getConnexion().createStatement();	
            String requete = "SELECT count(*) as nbr FROM continent";
            MonLogger.info(requete);
	    ResultSet res = stmt.executeQuery(requete);
	    
	    if (res.next()) 
            {                                
                nb = res.getInt("nbr"); 
                // ou bien : nb = res.getInt(1);                 
            }
	    
	    res.close();
	    stmt.close();	    
	}
	catch (Exception exc)
	{
	    exc.printStackTrace();
	}
	return nb;
    }        
}