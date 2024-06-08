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
import java.util.HashSet;
import java.util.Set;
import util.MonLogger;

/**
 * Classe d'accès aux données de la table Espece.
 * @author Mathieu
 */
public class EspeceDAO
{
    /**
     * Récupère une espèce à partir de son identifiant.
     * @param idEspece L'id de l'Espece
     * @return l'espèce
     */
    public static Espece getEspece(String idEspece)
    {
        Espece espece = null;
        try
	{	    	    
	    Statement stmt = Passerelle.getConnexion().createStatement();	    
	    String requete = "SELECT espece.id, espece.nom, espece.nomScientifique, "
                    + " continent.id, continent.nom "
                    + " FROM espece, continent "
                    + " WHERE espece.id = '" + idEspece + "'"
                    + " AND espece.idContinent = continent.id";
            
            MonLogger.info(requete);
            
            ResultSet res = stmt.executeQuery(requete);	    
	    if ( res.next() ) 
            {
                String id, nom, nomScientifique;
                String idContinent, nomContinent;

                id = res.getString("espece.id");
                nom = res.getString("espece.nom");
                nomScientifique = res.getString("espece.nomScientifique");
                idContinent = res.getString("continent.id");
                nomContinent = res.getString("continent.nom");
                
                Continent continent = new Continent(idContinent, nomContinent);

                espece = new Espece(id, nom, nomScientifique, continent);                                               
            }	    
	    res.close();
	    stmt.close();	    
	}
	catch (Exception exc)
	{
	    exc.printStackTrace();
	}        
        return espece;
    }
    
    /**
     * Récupère la liste des espèces classées par nom.
     * @return la liste des espèces classées par nom
     */
    public static ArrayList<Espece> getEspeces()
    {        
        ArrayList<Espece> liste = new ArrayList<Espece>();
        try
	{	    	    
	    Statement stmt = Passerelle.getConnexion().createStatement();
            String requete = "SELECT espece.*, continent.* "
                    + " FROM espece, continent"
                    + " WHERE espece.idContinent = continent.id"
                    + " ORDER BY espece.nom ";
	    ResultSet res = stmt.executeQuery(requete);
	    
            MonLogger.info(requete);
            
	    while (res.next()) 
            {
                String id, nom, nomScientifique;
                String idContinent, nomContinent;

                id = res.getString("espece.id");
                nom = res.getString("espece.nom");
                nomScientifique = res.getString("espece.nomScientifique");
                idContinent = res.getString("continent.id");
                nomContinent = res.getString("continent.nom");
                
                Continent continent = new Continent(idContinent, nomContinent);

                Espece espece = new Espece(id, nom, nomScientifique, continent);                              
                liste.add(espece);
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
     * Récupère le nombre d'espèces.
     * @return le nombre d'espèces.
     */
    public static int getNbEspeces()
    {        
        int nb = 0;
        try
	{	    	    
	    Statement stmt = Passerelle.getConnexion().createStatement();
            String requete = "SELECT count(*) as nbr FROM espece";
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
    
    /**
     * Recherche des espèces par le nom courant à partir d'un mot clé.
     * @param motCle
     * @return 
     */
    public static ArrayList<Espece> rechercherEspeces(String motCle)
    {                  
        ArrayList<Espece> liste = new ArrayList<Espece>();
        try
	{	    	    
	    Statement stmt = Passerelle.getConnexion().createStatement();
            String requete = "SELECT espece.*, continent.* "
                    + " FROM espece, continent"
                    + " WHERE espece.idContinent = continent.id"
                    + " AND espece.nom LIKE '%" + motCle + "%'"
                    + " ORDER BY espece.nom ";
	    ResultSet res = stmt.executeQuery(requete);
	    
            MonLogger.info(requete);
            
	    while (res.next()) 
            {
                String id, nom, nomScientifique;
                String idContinent, nomContinent;

                id = res.getString("espece.id");
                nom = res.getString("espece.nom");
                nomScientifique = res.getString("espece.nomScientifique");
                idContinent = res.getString("continent.id");
                nomContinent = res.getString("continent.nom");
                
                Continent continent = new Continent(idContinent, nomContinent);

                Espece espece = new Espece(id, nom, nomScientifique, continent);                              
                liste.add(espece);
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
    
    public static ArrayList<String> getGenre()
        {
            ArrayList<String> liste = new ArrayList<String>();
            ArrayList<String> listeSansDoublons = new ArrayList<String>();
            try
            {
                Statement stmt = Passerelle.getConnexion().createStatement();
                String requete = "SELECT DISTINCT espece.nomScientifique FROM espece, continent ORDER BY espece.nom ";
                ResultSet res = stmt.executeQuery(requete);

                MonLogger.info(requete);



                while (res.next()) 
                {
                    String nomScientifique;
                    nomScientifique = res.getString("espece.nomScientifique");
                    String[] mots = nomScientifique.split(" ");
                    liste.add(mots[0]);

                    Set<String> set = new HashSet<>(liste);
                    listeSansDoublons = new ArrayList<>(set);
                }

                res.close();
                stmt.close();
            }
            catch (Exception exc)
            {
                exc.printStackTrace();
            }
            return listeSansDoublons;
        }
    
}
