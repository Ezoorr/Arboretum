/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboretum;

/**
 * Classe métier représentant un continent.
 * @author Mathieu
 */
public class Continent
{
    private String id;
    private String nom;
    
    /**
     *
     */
    public Continent()
    {        
    }
    
    /**
     *
     * @param id
     * @param nom
     */
    public Continent(String id, String nom)
    {        
        this.id = id;
        this.nom = nom;
    }
    
    // get

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
    
    // set

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
    
    // toString
    public String toString()
    {
        return "Continent : " + id + " " + nom;
    }
}
