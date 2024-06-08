/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import arboretum.*;
import data.*;
import java.util.ArrayList;

/**
 *
 * @author Mathieu
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // Test date du jour
        
        DateFormat formateur = new SimpleDateFormat("yyyy");
        Date date = new Date();
        int annee = Integer.parseInt (formateur.format(date) );
        System.out.println(annee);
        
        // 
        Continent aSud = new Continent("AMES", "Amérique du Sud");
        
        Espece e1 = new Espece("ARA", "araucaria du Chili", "Araucaria araucana", aSud);
        
        Zone z1 = new Zone("", "");
        
        Arbre a1 = new Arbre(1, "viel arbre", 1890, "photo", true, null, null);
        System.out.println("Espèce de a1 : " + a1.getNomEspece());
        
        Arbre a2 = new Arbre(2, "jeune arbre", 1970, "photo", false, e1, null);
        System.out.println("Espèce de a2 : " + a2.getNomEspece());
        
        //EspeceDAO especeDAO = new EspeceDAO();
        //ArbreDAO arbreDAO = new ArbreDAO();
        //Object liste = EspeceDAO.getEspeces();
        //Object objet = EspeceDAO.getEspece("ARA");
        //Object liste = ArbreDAO.getArbres();
        //Object liste = ArbreDAO.getArbresPourEspece("ARA");
        
//        System.out.println(liste);
//        System.out.println(objet);
        
//        Arbre arbre = ArbreDAO.getArbre(1);
//        System.out.println(arbre.getZone());
//        
//        Continent cAfri = ContinentDAO.getContinent("AFRI");
//        System.out.println( cAfri );
//        
//        ArrayList<Continent> lesContinents = ContinentDAO.getContinents();
//        System.out.println(lesContinents);

        Utilisateur util = new Utilisateur("id_test", "mdp", "nom", "prenom");
        System.out.println(util);
    }
    
}
