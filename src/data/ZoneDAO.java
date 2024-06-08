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
 * DAO pour les zones.
 * @author Mathieu
 */
public class ZoneDAO 
{
//    
    
//        public static int getNbArbresDansZone(String zoneId) {
//        int nbArbres = 0;
//        try {
//            // Préparation de la requête SQL
//            String query = "SELECT COUNT(*) AS nbArbres FROM arbre WHERE idZone = ?";
//            PreparedStatement statement = Passerelle.getConnexion().prepareStatement(query);
//            statement.setString(1, zoneId);
//            
//            // Exécution de la requête
//            ResultSet resultSet = statement.executeQuery();
//            
//            // Traitement du résultat
//            if (resultSet.next()) {
//                nbArbres = resultSet.getInt("nbArbres");
//            }
//            
//            // Fermeture des ressources
//           
//        } catch (SQLException e) {
//            // Gestion des erreurs SQL
//            e.printStackTrace();
//        }
//        return nbArbres;
//    }
    public static ArrayList<Arbre> getArbresParZones(String idZones)
    {
        ArrayList<Arbre> liste = new ArrayList<Arbre>();
        try
    {
        Statement stmt = Passerelle.getConnexion().createStatement();
        String requete = "SELECT Distinct arbre.*"
                    + " FROM arbre"
                    + " WHERE arbre.idZone = '" + idZones + "'";

            MonLogger.info(requete);

        ResultSet res = stmt.executeQuery(requete);

        while (res.next()) 
            {
                int id, anneePlantation;
                String description, photo;
                String idZone, nomZone;
                boolean remarquable;

                id = res.getInt("arbre.id");
                description = res.getString("arbre.description");
                anneePlantation = res.getInt("arbre.anneePlantation");
                photo = res.getString("arbre.photo");
                remarquable = res.getBoolean("arbre.remarquable");



                Arbre unArbre = new Arbre(id, description, anneePlantation, photo, remarquable, null, null);
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
    
     public static ArrayList<Zone> getZones() {
        ArrayList<Zone> zones = new ArrayList<>();
        try {
             
             Statement stmt = Passerelle.getConnexion().createStatement();
            // Préparation de la requête SQL
            String query = "SELECT * FROM zone";
           
            
            // Exécution de la requête
            ResultSet res = stmt.executeQuery(query);            
            // Traitement du résultat
            while (res.next()) {
                // Création d'un objet Zone à partir des données de la base de données
                Zone zone = new Zone();
                zone.setId(res.getString("id"));
                zone.setNom(res.getString("nom"));
                
                // Ajout de la zone à la liste
                zones.add(zone);
            }
            
            // Fermeture des ressources
            
        } catch (SQLException e) {
            // Gestion des erreurs SQL
            e.printStackTrace();
        }
        return zones;
    }
    
}
