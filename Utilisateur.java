/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arboretum;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Mathieu
 */
public class Utilisateur
{
    // attributs
    private String id;
    private String motDePasse;
    private String nom;
    private String prenom;
        

    /**
     * constructeur sans paramètre
     */
    public Utilisateur()
    {        
        id = "";
        motDePasse = "";
        nom = "";
        prenom = "";                                
    }
    
    
    /**
     * constructeur avec 4 paramètres
     * @param unPrenom
     * @param unNom 
     */
    public Utilisateur(String unId, String unMdp, String unNom, String unPrenom)
    {        
        this.id = unId;
        this.motDePasse = unMdp;
        this.nom = unNom;
        this.prenom = unPrenom;             
    }
    
       
    // accesseurs en lecture  
    
   /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the motDePasse
     */
    public String getMotDePasse() {
        return motDePasse;
    }

    /**
     * @param motDePasse the motDePasse to set
     */
    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }    
    
    public String getNom()
    {
        return nom;
    }
    
    public String getPrenom()
    {
        return prenom;
    }
    
    // modificateurs
    public void setNom(String unNom)
    {
        this.nom = unNom;
    }
        
    public void setPrenom(String unPrenom)
    {
        this.prenom = unPrenom;
    }
    
    /**
     * Retourne une représentation de l'utilisateur sous forme de String.
     * (prénom + nom)
     * @return 
     */
    public String toString() 
    {
        String desc = getId() + " " + getMotDePasse() + " " + nom + " " + prenom ;                        
        return desc;
    }
    
    /**
     * Calcule la valeur de hachage d'une chaine
     * @param algorithme
     * @param chaine
     * @return la chaine de caractères hachée
     */
    public static String hacher(String algorithme, String chaine) 
    {
        byte[] digest = null;
        try 
        {
            MessageDigest sha = MessageDigest.getInstance(algorithme);
            digest = sha.digest(chaine.getBytes());      
        } catch (NoSuchAlgorithmException e) 
        {
            e.printStackTrace();
        }
        
        char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a',
        'b', 'c', 'd', 'e', 'f' };
        StringBuffer buffer = new StringBuffer();
        for (int j = 0; j < digest.length; j++) {
            buffer.append(hexDigits[(digest[j] >> 4) & 0x0f]);
            buffer.append(hexDigits[digest[j] & 0x0f]);
        }
        return buffer.toString();
    }

 
    
    
}
