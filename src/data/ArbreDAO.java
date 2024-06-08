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
 * DAO pour les arbres.
 * @author Mathieu
 */
public class ArbreDAO
{
    /**
     * Récupère un arbre à partir de son identifiant.
     * @param idArbre L'id de l'arbre.
     * @return L'arbre.
     */
    public static Arbre getArbre(int idArbre)
    {
        Arbre lArbre = null;
        try
	{	    	    
	    Statement stmt = Passerelle.getConnexion().createStatement();	    
	    String requete = "SELECT arbre.*, espece.*, continent.*, zone.* "
                    + "FROM arbre, espece, continent, zone "
                    + " WHERE arbre.id = " + idArbre
                    + " AND arbre.idEspece = espece.id "
                    + " AND espece.idContinent = continent.id "
                    + " AND arbre.idZone = zone.id ";
            
            MonLogger.info(requete);
            
            ResultSet res = stmt.executeQuery(requete);	    
	    if ( res.next() ) 
            {
                int id, anneePlantation;
                String description, photo, idEspece;
                String nomEspece, nomScientifique;
                String idContinent, nomContinent;
                String idZone, nomZone;
                boolean remarquable;

                id = res.getInt("arbre.id");
                description = res.getString("arbre.description");
                anneePlantation = res.getInt("arbre.anneePlantation");
                photo = res.getString("arbre.photo");
                remarquable = res.getBoolean("arbre.remarquable");
                
                idEspece = res.getString("espece.id");
                nomEspece = res.getString("espece.nom");
                nomScientifique = res.getString("espece.nomScientifique");
                idContinent = res.getString("continent.id");
                nomContinent = res.getString("continent.nom");
                idZone = res.getString("zone.id");
                nomZone = res.getString("zone.nom");
                
                Continent continent = new Continent(idContinent, nomContinent);

                Espece espece = new Espece(idEspece, nomEspece, nomScientifique, continent);
                
                Zone zone = new Zone(idZone, nomZone);
                
                lArbre = new Arbre(id, description, anneePlantation, photo, remarquable, espece, zone);                                          
            }	    
	    res.close();
	    stmt.close();	    
	}
	catch (Exception exc)
	{
	    exc.printStackTrace();
	}        
        return lArbre;
    }   
    
    /**
     * Récupère la liste des arbres classés par id.
     * @return la liste des arbres classées par id
     */
    public static ArrayList<Arbre> getArbres()
    {        
        ArrayList<Arbre> liste = new ArrayList<Arbre>();
        try
	{	    	    
	    Statement stmt = Passerelle.getConnexion().createStatement();
	    String requete = "SELECT arbre.*, espece.*, continent.*, zone.* "
                    + " FROM arbre, espece, continent, zone "
                    + " WHERE arbre.idEspece = espece.id "
                    + " AND espece.idContinent = continent.id "
                    + " AND arbre.idZone = zone.id "
                    + " ORDER BY arbre.id";
            
            MonLogger.info(requete);
            
	    ResultSet res = stmt.executeQuery(requete);	                
            
	    while (res.next()) 
            {
                int id, anneePlantation;
                String description, photo, idEspece;
                String nomEspece, nomScientifique;
                String idContinent, nomContinent;
                String idZone, nomZone;
                boolean remarquable;

                id = res.getInt("arbre.id");
                description = res.getString("arbre.description");
                anneePlantation = res.getInt("arbre.anneePlantation");
                photo = res.getString("arbre.photo");
                remarquable = res.getBoolean("arbre.remarquable");
                
                idEspece = res.getString("espece.id");
                nomEspece = res.getString("espece.nom");
                nomScientifique = res.getString("espece.nomScientifique");
                idContinent = res.getString("continent.id");
                nomContinent = res.getString("continent.nom");
                
                idZone = res.getString("zone.id");
                nomZone = res.getString("zone.nom");;
                
                Continent continent = new Continent(idContinent, nomContinent);

                Espece espece = new Espece(idEspece, nomEspece, nomScientifique, continent);
                
                Zone zone = new Zone(idZone, nomZone);
                
                Arbre unArbre = new Arbre(id, description, anneePlantation, photo, remarquable, espece, zone);
                liste.add(unArbre);
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
     * Récupère la liste des arbres pour un id d'espèce donné.
     * @param idEspece l'id de l'espèce recherchée.
     * @return la liste des arbres classées par id.
     */
    public static ArrayList<Arbre> getArbresPourEspece(String idEspece)
    {        
        ArrayList<Arbre> liste = new ArrayList<Arbre>();
        try
	{	    	    
	    Statement stmt = Passerelle.getConnexion().createStatement();
	    String requete = "SELECT arbre.*, espece.*, continent.*, zone.* "
                    + "FROM arbre, espece, continent, zone "
                    + " WHERE arbre.idEspece = espece.id "
                    + " AND espece.idContinent = continent.id "
                    + " AND espece.id = '" + idEspece + "'"
                    + " AND arbre.idZone = zone.id "
                    + " ORDER BY arbre.id";
            
            MonLogger.info(requete);
            
	    ResultSet res = stmt.executeQuery(requete);	                
            
	    while (res.next()) 
            {
                int id, anneePlantation;
                String description, photo;
                String nomEspece, nomScientifique;
                String idContinent, nomContinent;
                String idZone, nomZone;
                boolean remarquable;

                id = res.getInt("arbre.id");
                description = res.getString("arbre.description");
                anneePlantation = res.getInt("arbre.anneePlantation");
                photo = res.getString("arbre.photo");
                remarquable = res.getBoolean("arbre.remarquable");
                
                idEspece = res.getString("espece.id");
                nomEspece = res.getString("espece.nom");
                nomScientifique = res.getString("espece.nomScientifique");
                idContinent = res.getString("continent.id");
                nomContinent = res.getString("continent.nom");
                
                idZone = res.getString("zone.id");
                nomZone = res.getString("zone.nom");;
                
                Continent continent = new Continent(idContinent, nomContinent);

                Espece espece = new Espece(idEspece, nomEspece, nomScientifique, continent);
                
                Zone zone = new Zone(idZone, nomZone);
                
                Arbre unArbre = new Arbre(id, description, anneePlantation, photo, remarquable, espece, zone);
                liste.add(unArbre);
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
     * Récupère le nombre d'arbres.
     * @return le nombre d'arbres.
     */
    public static int getNbArbres()
    {        
        int nb = 0;
        try
	{	    	    
	    Statement stmt = Passerelle.getConnexion().createStatement();
            String requete = "SELECT count(*) as nbr FROM arbre";
	    ResultSet res = stmt.executeQuery(requete);
            MonLogger.info(requete);
	    
	    if (res.next()) 
            {                
                //nb = res.getInt(1); // ok
                nb = res.getInt("nbr"); // ok                
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
    
    public static int getNbArbrePlantee()
    {        
        int nb = 0;
        try
	{	    	    
	    Statement stmt = Passerelle.getConnexion().createStatement();
            String requete = "SELECT count(*) as nbr FROM arbre WHERE anneePlantation = 2024";
	    ResultSet res = stmt.executeQuery(requete);
            MonLogger.info(requete);
	    
	    if (res.next()) 
            {                
                //nb = res.getInt(1); // ok
                nb = res.getInt("nbr"); // ok                
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

