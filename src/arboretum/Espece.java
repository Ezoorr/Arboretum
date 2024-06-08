/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboretum;

/**
 * Espèce d'un arbre.
 * @author Mathieu
 */
public class Espece
{
    private String id;
    private String nom;
    private String nomScientifique;
    
    private Continent leContinent;
    
    /**
     *
     */
    public Espece()
    {                     
    }
    
    /**
     *
     * @param id
     * @param nom
     * @param nomEspece
     * @param leContinent
     */
    public Espece(String id, String nom, String nomEspece, Continent leContinent)
    {
        this.id = id;
        this.nom = nom;
        this.nomScientifique = nomEspece;               
        this.leContinent = leContinent;
    }
        
    // getters

    /**
     *
     * @return
     */
    public String getId()
    {
        return id;
    }
    
    /**
     *
     * @return
     */
    public String getNom()
    {
        return nom;
    }
        
    /**
     *
     * @return
     */
    public String getNomScientifique()
    {
        return nomScientifique;
    }
    
    /**
     *
     * @return
     */
    public Continent getLeContinent()
    {
        return leContinent;
    }
    
    // setters

    /**
     *
     * @param id
     */
    public void setId(String id)
    {
        this.id = id;
    }
    
    /**
     *
     * @param nom
     */
    public void setNom(String nom)
    {
        this.nom = nom;
    }
    
    /**
     *
     * @param nomScientifique
     */
    public void setNomScientifique(String nomScientifique)
    {
        this.nomScientifique = nomScientifique;
    }
    
    /**
     *
     * @param leContinent
     */
    public void setLeContinent(Continent leContinent)
    {
        this.leContinent = leContinent;
    }
    
    public String toString()
    {
        return id + " - " + nom + " (" + nomScientifique + ")";
    }
    
    
    /**
     * Retourne le nom du continent (s'il n'est pas null).
     * @return le nom du continent
     */
    public String getNomContinent()
    {
        if (leContinent != null)
            return leContinent.getNom();
        else
            return "";
    }
    
    public String getGenre() {
    // On suppose que le genre est le premier mot dans le nom scientifique
    String[] mots = this.nomScientifique.split(" ");
    if (mots.length > 0) {
        return mots[0];
    } else {
        return ""; // ou une autre valeur par défaut
    }
}
}