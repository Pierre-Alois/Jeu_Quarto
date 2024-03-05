/*
Projet Java - Jeu Quarto
BERTIN Pierre-Aloïs - CALMET Pierre - SAID Gabriel
*/
package quarto;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Jeu{
    
    /*
    Méthode permettant le tirage au sort d'un joueur.
    Les chiffres 1 et 2 sont choisis au hasard. Si c'est 1 alors le joueur 1
    commence. Sinon c'est le joueur 2 
    Le 1er joueur devra ensuite choisir une pièce.
    */
    public Joueur Choix_Joueur(Joueur joueur, Joueur joueur1, Joueur joueur2){
        
        Random rd = new Random();
        int choix_PL  = rd.nextInt(1,3);       
        if(choix_PL == 1){           
            joueur1 = joueur; 
            return joueur1;
        }
        else;
            joueur2 = joueur;
            return joueur2;   
    }

    /*
    Méthode permettant de choisir la taille du plateau (3×3,4×4,5×5) 
    et de le créer.
    */
    public int taille_Plateau(){
        Scanner pl = new Scanner(System.in);
        int taille;
        while(true){
            //System.out.println("""
                               //Quelle taille du plateau choisissez-vous ?
                               //Tapez 3,4 ou 5.""");
            taille = pl.nextInt();
            if(taille == 3 || taille == 4 || taille == 5){
                break;
            }
            //System.out.println("Valeur incorrecte.");
        }
        return taille;
    }
    
    /*
    Instance plateau.
    */
    Plateau plateau = new Plateau(taille_Plateau());
    
    
    
    //Méthode permettant la reprise d'une partie précédement sauvegardée. 
    public void Rependre_partie(){
    }
    
    //Méthode permettant de recommencer une nouvelle partie à zéro. 
    public void Recommencer_Partie(){   
    }
    
    //Méthode permettant de jouer une partie. Boucle principale
    public void jouer(String joueur1,String joueur2, Plateau plateau){
    
    //On demande les pseudos des 2 joueurs
    joueur1 = JOptionPane.showInputDialog(" Joueur 1, write your pseudo : ");
    JOptionPane.showMessageDialog(null, "Vous vous appelez donc : " 
            + joueur1);
    joueur2 = JOptionPane.showInputDialog(" Joueur 2, write your pseudo : ");
    JOptionPane.showMessageDialog(null, "Vous vous appelez donc : " 
            + joueur2);
    
    //Jeu J = new Jeu();
    }   
}
