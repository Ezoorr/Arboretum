/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboretum;

/**
 * Classe utilitaire pour l'affichage du menu.
 * @author Mathieu
 */
public class Menu
{
    
    /**
     * Affichage du menu général.
     */
    public static void afficherMenuGeneral()
    {
	System.out.println("\n**** Gestion de l'Arboretum ****");
        System.out.print("[A]rbres ");
        System.out.print("[C]ontinents ");
        System.out.print("[E]speces ");
        System.out.print("[S]tatistique ");
        System.out.println("[Z]ones ");
        

        
        System.out.println("[Q] - Quitter \n");  
        System.out.println("Entrez votre choix (majuscule ou minuscule) \n");
    }   
    
    /**
     * Affichage du sous menu des arbres
     */
    public static void afficherMenuArbres()
    {        
	System.out.println("A1 - Afficher la liste des arbres (+ espèces)");
	System.out.println("A2 - Afficher le nombre d'arbres");        
        System.out.println("A3 - Rechercher des arbres par espèce");
        System.out.println("A4 - Rechercher des arbres par date de plantation");        
        
	System.out.println("Q - Quitter \n");
    }
    
    /**
     * Affichage du sous menu des continents
     */
    public static void afficherMenuContinents()
    {        
	System.out.println("C1 - Afficher la liste des continents");
        System.out.println("C2 - Afficher le nombre de continents");
        
	System.out.println("Q - Quitter \n");
    }
        
    /**
     * Affichage du sous menu des espèces.
     */
    public static void afficherMenuEspeces()
    {        
	System.out.println("E1 - Afficher la liste des espèces");
	System.out.println("E2 - Afficher le nombre d'espèces");
        System.out.println("E3 - Rechercher une espèce par mot-clé");
        System.out.println("E4 - Afficher tout les genres");
        
	System.out.println("Q - Quitter \n");
    }    
    
    /**
     * Affichage du sous menu des visites.
     */
    public static void afficherMenuZones()
    {        
	System.out.println("Z1 - nombre d'arbre d'une zone");	
           
	System.out.println("Q - Quitter \n");
    }   
    
    // AFFICHAGE STAT
    public static void afficherMenuStat()
    {        
	System.out.println("S1 : le nombre total d'arbre planté ");
        
        System.out.println("S2 : le nombre total d'arbre planté en 2024");

	System.out.println("Q - Quitter \n");
    }
    // AFFICHAGE GENRE
    
    public static void afficherGenre()
    {        
	System.out.println("G1 : afficher tout les genres ");
        
   
	System.out.println("Q - Quitter \n");
    }
}
