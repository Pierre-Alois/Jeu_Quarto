/*
Projet Java - Jeu Quarto
BERTIN Pierre-Aloïs - CALMET Pierre - SAID Gabriel
*/
package quarto;

public class Joueur {
    
    //Attributs
    
    String pseudo_J1,pseudo_J2;
    
    //Constructeur
    
    public Joueur(String pseudo_J1,String pseudo_J2){
        
        this.pseudo_J1 = pseudo_J1;
        this.pseudo_J2 = pseudo_J2;
    }
    
    //Getter
    
    public String getpseudo(){
        return pseudo_J1 + pseudo_J2;
    }    
}
