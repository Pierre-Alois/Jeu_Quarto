/*
Projet Java - Jeu Quarto
BERTIN Pierre-Aloïs - CALMET Pierre - SAID Gabriel
*/
package quarto;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Jeu {
    
    //Attributs
    
    // Constructeur
    
    public Jeu(){
           
    }
    
    /*
    Méthode permettant le tirage au sort d'un joueur.
    Les chiffres 1 et 2 sont choisis au hasard. Si c'est 1 alors le joueur 1
    commence. 2 sinon . 
    */
    public Joueur Choix_Joueur(Joueur joueur1, Joueur joueur2){
        
        Random rd = new Random();
        int choix_PL  = rd.nextInt(1,3);
        if(choix_PL == 1){
            System.out.println( joueur1.getpseudo() + "vous commencez.");
            return joueur1;
        }
        else;
        System.out.println(joueur2.getpseudo() + "vous commencez");
        return joueur2 ;   
    }
    
    // Méthode permettant de placer une pièce sur une case libre du plateau
    public void Placer(Joueur joueur, int taille, Piece piece, Piece[][] plateau){
        
        System.out.println("Voici la pièce que vous avez choisie :" 
                + piece);
    }
    
    //Méthode permettant la mise ne pause d'une partie,ainsi que sa sauvegarde.
    public void Sauvegarde(){

    }
    
    //Méthode permettant la reprise d'une partie précédement suavegardée. 
    public void Rependre_partie(){
    
    }
    
    //Méthode permettant de recommencer une nouvelle partie à zéro. 
    public void Recommencer_Partie(){
        
    }
    
    //Méthode permettant de jouer une partie
    public void jouer(String joueur1,String joueur2){
        
    joueur1 = JOptionPane.showInputDialog(" Joueur 1, write your pseudo : ");
    JOptionPane.showMessageDialog(null, "So il will be" 
            + joueur1);
    joueur2 = JOptionPane.showInputDialog(" Joueur 2, write your pseudo : ");
    JOptionPane.showMessageDialog(null, "So il will be" 
            + joueur2);
        
    }
    
    
    
    
    



    

    
    
    
    
    
    
    
    
}
