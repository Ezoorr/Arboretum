/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
 *
 * @author Mathieu
 */
public class UtilisateurDAO {
    
        
    public static Utilisateur authentifieUtilisateur(String idUtilisateur, String motDePasse)
    {
        Utilisateur utilisateur = null;
        
        String mdpHache = Utilisateur.hacher("SHA-256", motDePasse);
        
        try
	{	    	    
	    Statement stmt = Passerelle.getConnexion().createStatement();	    
	    String requete = "SELECT utilisateur.* FROM utilisateur "
            + " WHERE utilisateur.id = '" + idUtilisateur + "'"
                    + " AND utilisateur.motDePasse = '" + mdpHache + "'";
            
            MonLogger.info(requete);
            
            ResultSet res = stmt.executeQuery(requete);	    
	    if ( res.next() ) 
            {
                String id, nom, prenom;

                id = res.getString("utilisateur.id");
                nom = res.getString("utilisateur.nom");
                prenom = res.getString("utilisateur.prenom");
                
                utilisateur = new Utilisateur(id, mdpHache, nom, prenom);                                          
            }	    
	    res.close();
	    stmt.close();	    
	}
	catch (Exception exc)
	{
	    exc.printStackTrace();
	}        
        return utilisateur;
    }        
        
    
    
}
