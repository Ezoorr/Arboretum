/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboretum;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Mathieu
 */
public class Arbre 
{

    private int id;
    private String description;
    private int anneePlantation;    
    private String photo;
    private boolean remarquable;
    
    private Espece lEspece;
    
    private Zone laZone;
    
    /**
     * Constructeur vide.
     */
    public Arbre()
    {        
    }
    
    /**
     * Constructeur avec 6 paramètres.
     * @param id identifiant de l'arbre
     * @param description
     * @param anneePlantation année de plantation
     * @param photo fichier de la photo
     * @param remarquable indique si l'arbre est classé remarquable
     * @param lEspece l'espèe ce l'arbre 
     * @param laZone la zone où est situé l'arbre
     */
    public Arbre(int id, String description, int anneePlantation, String photo, 
            boolean remarquable, Espece lEspece, Zone laZone)
    {
        this.id = id;
        this.description = description;
        this.anneePlantation = anneePlantation;
        this.photo = photo;            
        this.remarquable = remarquable;
        this.lEspece = lEspece; 
        this.laZone = laZone;
    }
    
    // get

    /**
     *
     * @return
     */
    public int getId()
    {
        return id;
    }
    
    /**
     *
     * @return
     */
    public String getDescription()
    {
        return description;
    }
    
    /**
     *
     * @return
     */
    public int getAnneePlantation()
    {
        return anneePlantation;
    }
    
    /**
     *
     * @return
     */
    public String getPhoto()
    {
        return photo;
    }
    
    /**
     *
     * @return
     */
    public Espece getEspece()
    {
        return lEspece;
    }

    /**
     * @return  laZone
     */
    public Zone getZone() {
        return laZone;
    }
    
    public boolean isRemarquable()
    {
        return remarquable;
    }
    
    // set

    /**
     *
     * @param id
     */
    public void setId(int id)
    {
        this.id = id;
    }
        
    /**
     *
     * @param description
     */
    public void setDescription(String description)
    {
        this.description = description;
    }
    
    /**
     *
     * @param anneePlantation
     */
    public void setAnneePlantation(int anneePlantation)
    {
        this.anneePlantation = anneePlantation;
    }
    
    /**
     *
     * @param photo
     */
    public void setPhoto(String photo)
    {
        this.photo = photo;
    }
    
    public void setRemarquable(boolean remarquable)
    {
        this.remarquable = remarquable;
    }
    
    /**
     *
     * @param lEspece
     */
    public void setEspece(Espece lEspece)
    {
        this.lEspece = lEspece;
    }

    /**
     * @param laZone the laZone to set
     */
    public void setZone(Zone laZone) {
        this.laZone = laZone;
    }
    
    // toString Retourne l'arbre sous forme de String.
     // @return Une chaîne de caractères représentant l'arbre.
//    // 1ère version    
//    public String toString()
//    {
//        String str = "Arbre : " + id + " " + description;
//        if (lEspece != null)
//            str = str + " (" + lEspece.getNom() + ")"; 
//        return str;
//    }
    
    /**
     *
     * @return
     */
    public String toString()
    {
        String str = "Arbre : " + id + " " + description + " - " + lEspece;        
        return str;
    }
    
    /**
     *
     * @return
     */
    public String getNomEspece()
    {
        if (lEspece != null)
            return lEspece.getNom();
        else 
            return "";
    }
    
    
     // Retourne l'âge de l'arbre, en supposant que l'année courante soit 2021.
     // @return l'âge de l'arbre

    /**
     *
     * @return
     */
     
    public int getAge()
    {
        // année courante
        int anneeCourante;
        DateFormat formateur = new SimpleDateFormat("yyyy");
        Date date = new Date();
        anneeCourante = Integer.parseInt( formateur.format(date) );
                
        return anneeCourante - anneePlantation;        
    }
    
}
