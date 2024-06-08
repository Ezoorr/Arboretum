package test;

import arboretum.*;
import data.*;
import java.util.ArrayList;

public class TestDAO 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
//        Continent cAfri = ContinentDAO.getContinent("AFRI");
//        System.out.println( cAfri );
//        
//        ArrayList<Continent>lesContinents=ContinentDAO.getContinents();
//        for(Continent unContinent : lesContinents)
//        {
//            System.out.println(unContinent.toString());
//        }
//        int nbContinents=ContinentDAO.getNbContinents();
//        System.out.println(nbContinents);
        ArrayList<String> genres = EspeceDAO.getGenre();
    //Collections.sort(genres); // Tri alphabétique
        for (String genre : genres) {
        System.out.println(genre);
    }
    }    
}
