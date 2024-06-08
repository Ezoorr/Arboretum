/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboretum;

import java.util.ArrayList;
import java.util.Scanner;
import data.*;
import java.util.Collections;
import util.MonLogger;

/**
 * Classe principale de l'application. VERSION FINALE
 * @author Mathieu
 * @version finale
 */
public class Program
{
    // scanner utile pour la saisi
    // déclaré comme statique afin d'être utilisé dans toutes les méthodes de la classe
    private static Scanner sc = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {	
        // Activation du mode Deboggage, si demandé
        System.out.println("Activer le mode Debogage ? (O / N)");
        String reponse = sc.nextLine();
        if (reponse.equalsIgnoreCase("O"))
        {
            MonLogger.ACTIF = true;
            MonLogger.info("Mode debogage actif");
        }            
        else
        {
            // Mode debogage désactivé
            MonLogger.ACTIF = false;            
        }
        
        // authentification
        authentifier();

        // choix de l'utilisateur
	String choix = "X";
        // affichage du menu            
	Menu.afficherMenuGeneral();
           
        // "Q" permet de Quitter l'application
        // tant que le choix est différent de "Q" : saisie + traitement
	while (! choix.equalsIgnoreCase("Q"))
	{
            // menu choisi par l'utilisateur
	    choix = sc.nextLine();                       
            
            //
            // traitement en fonction du choix
            // MENUS
            //
            //  Menu arbres
            if (choix.equalsIgnoreCase("A"))
            {
                Menu.afficherMenuArbres();                
            }            
            
            // menu continents
            else if (choix.equalsIgnoreCase("C"))
            {
                Menu.afficherMenuContinents();
            }
            
            // menu espèces
            else if (choix.equalsIgnoreCase("E"))
            {
                Menu.afficherMenuEspeces();
            }
            
            // Menu Zones
            else if (choix.equalsIgnoreCase("Z"))
            {
                Menu.afficherMenuZones();
            }    
             else if (choix.equalsIgnoreCase("S"))
            {
                Menu.afficherMenuStat();
            }            
                      
            
            //
            // Sous-menus ARBRES
            //
            // Afficher la liste des arbres (+ espèces)
            else if (choix.equalsIgnoreCase("A1"))
            {
                afficherArbres();
                Menu.afficherMenuGeneral();
            }
            
            // Afficher le nombre d'arbres
            else if (choix.equalsIgnoreCase("A2"))
            {
                afficherNbArbres();
                Menu.afficherMenuGeneral();
            }
            
            // Rechercher des arbres par espèce
            else if (choix.equalsIgnoreCase("A3"))
            {
                rechercherArbresParEspece();
                Menu.afficherMenuGeneral();
            }
            
            // Rechercher des arbres par date de plantation
            else if (choix.equalsIgnoreCase("A4"))
            {
                rechercherArbresParDate();
                Menu.afficherMenuGeneral();
            }                        
            
            //
            // Sous-menus CONTINENTS
            //
            // Afficher la liste des continents
            else if (choix.equalsIgnoreCase("C1"))
            {
                afficherContinents();
                Menu.afficherMenuGeneral();
            }
            
            // Afficher le nombre de continents
            else if (choix.equalsIgnoreCase("C2"))
            {
                afficherNbContinents();
                Menu.afficherMenuGeneral();
            }
            
            //
            // Sous-menus ESPECES
            //
            // Afficher la liste des espèces
            else if (choix.equalsIgnoreCase("E1"))
            {
                afficherEspeces();
                Menu.afficherMenuGeneral();
            }
            
            // Afficher le nombre d'espèces
            else if (choix.equalsIgnoreCase("E2"))
            {
                afficherNbEspeces();
                Menu.afficherMenuGeneral();
            }
            
            // Rechercher des espèces par mot-clé
            else if (choix.equalsIgnoreCase("E3"))
            {
                rechercherEspecesMotCle();
                Menu.afficherMenuGeneral();
            }
             else if (choix.equalsIgnoreCase("E4"))
            {
                afficherGenres();
                Menu.afficherMenuGeneral();
            }

            else if (choix.equalsIgnoreCase("S1"))
            {
                afficherNbArbre();
                Menu.afficherMenuGeneral();
            }
            else if (choix.equalsIgnoreCase("S1"))
            {
                afficherNbArbre();
                Menu.afficherMenuGeneral();
            } 
            else if (choix.equalsIgnoreCase("S2"))
            {
                afficherNbArbrePlante();
                Menu.afficherMenuGeneral();
            }
            else if (choix.equalsIgnoreCase("Z1"))
            {
                rechercherArbreParZones();
                Menu.afficherMenuGeneral();
            }
           
            
            
            //
            // Quitter
            //
            else if (choix.equalsIgnoreCase("Q"))
            {
                System.out.println("Au revoir");
                break;
            }
            
            // sinon si c'est un choix quelconque
            else
            {
                System.out.println("mauvais choix. Re saisir :");            	    
            }
        }        
    }
    
    
    //
    // Méthodes métier
    //    
    
    private static void authentifier()
    {
        boolean authentifOK = false;
        while (! authentifOK)
        {
            System.out.println("Saisissez votre id :");
            String id = sc.nextLine();
            System.out.println("Saisissez votre mot de passe :");
            String motDePasse = sc.nextLine();
            
            Utilisateur unUtilisateur;
            unUtilisateur = UtilisateurDAO.authentifieUtilisateur(id, motDePasse);
            
            // test si c'est réussi
            if(unUtilisateur != null)
            {
                authentifOK = true;
                System.out.println("Bienvenue : " + unUtilisateur.getPrenom() + " " + unUtilisateur.getNom());
                //System.out.println("Bienvenue : " + unUtilisateur.toString());
            }
            else
            {
                System.out.println("Id et/ou mot de passe incorrect. Recommencez.");
            }            
        }        
    }
    
    /**
     * Affichage des arbres.
     */
    public static void afficherArbres()
    {
        System.out.println("Liste des arbres \n ");
        ArrayList<Arbre> listeArbres = ArbreDAO.getArbres();
        
        for (Arbre unArbre : listeArbres)        
            System.out.println( unArbre );
        
    } 
    
    /**
     * Affichage du nombre d'arbres arbres.
     */
    public static void afficherNbArbres()
    {        
        int nb = ArbreDAO.getNbArbres();
        System.out.println("Nombre total d'arbres " + nb + "\n");               
    }     
      
    /**
     * Affichage de l'âge moyen des arbre.
     */
    public static void afficherAgeMoyen()
    {
        // manière 1 : calcul avec une boucle
        ArrayList<Arbre> listeArbres = ArbreDAO.getArbres();
        float total = 0;
        float ageMoyen;
        for (Arbre unArbre : listeArbres) 
        {
            total += unArbre.getAge();
        }
        ageMoyen = total / listeArbres.size();
        System.out.println( "l'âge moyen est : " + ageMoyen );
        
        // manière 2 : requête SQL
        ageMoyen = 0; //ArbreDAO.getAgeMoyenArbres();
        System.out.println( "l'âge moyen est : " + ageMoyen );
    }
    
    /**
     * Recherche d'arbres par id d'espèce.
     */
    public static void rechercherArbresParEspece()
    {
        System.out.println( "Saisissez un id d'espèce : ");
        String idSaisi = sc.nextLine();
        ArrayList<Arbre> listeArbres = ArbreDAO.getArbresPourEspece(idSaisi);
        if (listeArbres.isEmpty())
        {
            System.out.println("aucun arbre pour cette espèce");
        }
        else
        {
            for (Arbre unArbre : listeArbres)        
                System.out.println( unArbre );        
        }
    }
          
    /**
     * Recherche d'arbres par année de plantation.
     */
    public static void rechercherArbresParDate()
    {
        System.out.println( "Saisissez une année de plantation : ");
        String saisie = sc.nextLine();
        
        // manière 1
        int anneeSaisie = Integer.parseInt(saisie);
        ArrayList<Arbre> listeArbres = ArbreDAO.getArbres();
        for (Arbre unArbre : listeArbres) 
        {
                int anneeArbre = unArbre.getAnneePlantation();        
                if (anneeArbre == anneeSaisie)
                    System.out.println( unArbre );
        }
        
        // manière 2 avec requête SQL
    }          
    

    
    //
    // CONTINENTS
    //
    
    /**
     * Affichage des continents.
     */
    public static void afficherContinents()
    {
        System.out.println("Liste des continents \n ");
        ArrayList<Continent> listeContinents = ContinentDAO.getContinents();
        
        for (Continent unContinent : listeContinents)        
            System.out.println( unContinent );
        
    } 
    
    /**
     * Affichage du nombre de continents.
     */
    public static void afficherNbContinents()
    {        
        int nb = ContinentDAO.getNbContinents();
        System.out.println("Nombre total de continents " + nb + "\n");               
    }     
    
    //
    // ESPECES
    //
    
    /**
     * Affichage des espèces.
     */
    public static void afficherEspeces()
    {        
        System.out.println("Liste des espèces \n ");
        // déclaration d'une liste de type ArrayList<Espece>
        ArrayList<Espece> listeEspeces = EspeceDAO.getEspeces();
        
        // boucle for qui affiche chaque espèce
        for (Espece uneEspece : listeEspeces)        
            System.out.println( uneEspece );               
    }
    
    /**
     * Affichage le nombre des espèces.
     */
    public static void afficherNbEspeces()
    {        
        int nb = EspeceDAO.getNbEspeces();
        System.out.println("Nombre total d'espèces " + nb + "\n");                      
    }
    
    /**
     * Recherche d'espèces par mot-clé.
     */
    public static void rechercherEspecesMotCle()
    {
        System.out.println("Saisissez un mot-clé (sans accent) : ");
        // saisie d'un mot clé
        String motCle = sc.nextLine();
        // recherche des espèces correspondant au mot clé au moyen de EspeceDAO
        ArrayList<Espece> listeEspeces = EspeceDAO.rechercherEspeces(motCle);
        // si la liste a une taille de zéro : afficher un message d'info
        if (listeEspeces.size() == 0)
            System.out.println("Aucune espèce trouvée.");
        // sinon afficher toutes les espèces
        else
        {
            for (Espece uneEspece : listeEspeces)        
                System.out.println( uneEspece );
        }
    }
    public static void afficherNbArbre()
    {        
        int nb = ArbreDAO.getNbArbres();
        System.out.println("Nombre total d'espèces " + nb + "\n");                      
    }
    public static void afficherNbArbrePlante()
    {        
        int nb = ArbreDAO.getNbArbrePlantee();
        System.out.println("Nombre total d'espèces " + nb + "\n");                      
    }
    
        
    
     
     // AFFICHAGE ZONE
     
//    public static void afficherNbArbreZone() {
//
//    System.out.println("Liste des zones :\n");
//    ArrayList<Zone> zones = ZoneDAO.getZones();
//    for (Zone zone : zones) {
//        System.out.println("ID : " + zone.getId());
//    }
//
//    System.out.println("Veuillez saisir l'identifiant de la zone : ");
//    String zoneId = sc.nextLine();
//    int nbArbresDansZone = ZoneDAO.getNbArbresDansZone(zoneId);
//    System.out.println("Nombre d'arbres dans la zone : " + nbArbresDansZone);
//    }
    public static void rechercherArbreParZones()
    {
       ArrayList<Zone> listeZones = ZoneDAO.getZones(); 
       System.out.println("Liste des zones \n ");

        for (Zone uneZone : listeZones){
            System.out.println( uneZone );
        }

        System.out.println("Veuillez saisir une zone");
        String zones = sc.nextLine();

        ArrayList<Arbre> listeArbreParZones = ZoneDAO.getArbresParZones(zones);
        for (Arbre unArbre : listeArbreParZones){
            System.out.println( unArbre );
        }


    }
    
    
    // AFFICHER LE NOM SCIENTIFIQUE 
    public static void afficherGenres() {
    ArrayList<String> genres = EspeceDAO.getGenre();
    //Collections.sort(genres); // Tri alphabétique
        for (String genre : genres) {
        System.out.println(genre);
    }
  }
}
