/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arboretum;

import java.util.ArrayList;

/**
 *
 * @author Mathieu
 */
public class Zone {



    private String id;
    private String nom;
    
    private ArrayList<Arbre> lesArbres;
    
    /**
     * 
     */
    public Zone()
    {
        lesArbres = new ArrayList<Arbre>();
    }
    
    /**
     * 
     */
    public Zone(String id, String nom)
    {
        this.id = id;
        this.nom = nom;
        lesArbres = new ArrayList<Arbre>();
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
    
    /**
     * @return the lesArbres
     */
    public ArrayList<Arbre> getArbres() {
        return lesArbres;
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
    
    /**
     * @param lesArbres the lesArbres to set
     */
    public void setArbres(ArrayList<Arbre> lesArbres) {
        this.lesArbres = lesArbres;
    }
    
    // toString
    public String toString()
    {
        return "Zone : " + id + " " + nom;
    }    
    
}
