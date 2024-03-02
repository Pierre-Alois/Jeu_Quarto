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
    
    public Piece Banque(ArrayList<Piece> liste_P){
        
        Scanner sc = new Scanner(System.in);
        
        //System.out.println("Voici l'ensemble des pieces disponibles : ");
        for(int i = 0; i<liste_P.size();i++){
            System.out.println((i+1) + "→ " + liste_P.get(i));
        }
        //System.out.println("Choisissez votre pièce par son numéro : ");
        int choix_PI = sc.nextInt();
        
        while(choix_PI<1 || choix_PI>liste_P.size()){
            choix_PI = sc.nextInt();
        }
      
    return  liste_P.get(choix_PI-1);
    }
}
