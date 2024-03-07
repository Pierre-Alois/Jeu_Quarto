/*
Projet Java - Jeu Quarto
BERTIN Pierre-Aloïs - CALMET Pierre - SAID Gabriel
*/
package quarto;

import java.util.ArrayList;
import java.util.Scanner;

public class Joueur {
    
    //Attributs
    private final String pseudo;
    
    //Constructeur
    public Joueur(String pseudo){
        this.pseudo = pseudo;
    }
    
    //Getter
    public String getpseudo(){
        return pseudo;
    }
       
    // toString :
    @Override
    public String toString(){
        return pseudo; 
    }
    
}
