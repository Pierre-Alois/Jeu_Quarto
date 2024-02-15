/*
Projet Java - Jeu Quarto
BERTIN Pierre-Aloïs - CALMET Pierre - SAID Gabriel
*/
package quarto;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
/*

*/
public class Jeu {
    
    /*
    Méthode permettant le tirage au sort d'un joueur.
    Les chiffres 1 et 2 sont choisis au hasard. Si c'est 1 alors le joueur 1
    commence. 2 sinon . 
    Le 1er joueur doit choisir une pièce.
    */
    public Joueur Choix_Joueur(Joueur joueur, Joueur joueur1, Joueur joueur2){
        
        Random rd = new Random();
        int choix_PL  = rd.nextInt(1,3);       
        if(choix_PL == 1){
            System.out.println(joueur1.getpseudo() + "vous commencez." 
                    + "Vous allez devoir choisir une pièce.");
            joueur1 = joueur; 
            return joueur1;
        }
        else;
            System.out.println(joueur2.getpseudo() + "vous commencez " 
                    + " Vous allez devoir choisir une pièce.");
            joueur2 = joueur;
            return joueur2;   
    }
    
     /*
      Méthode permettant de la placer une piece sur le plateau de jeu.
    */
    public Piece Placer(Joueur joueur, int taille, Piece piece, Plateau plateau,
                        int x, int y){
        
        Scanner sc = new Scanner(System.in);
        Piece [][] place = new Piece[taille][taille];
        int cln,ln = 0;
        
        while(x<0 || y<0 || x>=plateau.gettaille()|| y>=plateau.gettaille()){
            
            for(x=0;x<taille*taille;x++){
                for(y=0;y<taille*taille;y++){
                
                    if(plateau.Case_Libre(x,y) != null){
                        System.out.println(place[x][y] + "est déjà prise");
                    }
                
                    else{
                        ln = sc.nextInt();
                        cln = sc.nextInt();
                    System.out.println("Où voules-vous placer votre pièce ? \n " 
                    + "ligne : " + ln + "\n" + "colonne: " + cln);
                        piece = place[ln][cln];
                    }
                }
            }
        }
    return piece;    
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
    
    //Méthode permettant de jouer une partie. Boucle principale
    public void jouer(String joueur1,String joueur2){
    
    //On demande les pseudos des 2 joueurs
    joueur1 = JOptionPane.showInputDialog(" Joueur 1, write your pseudo : ");
    JOptionPane.showMessageDialog(null, "Vous vous appelez donc : " 
            + joueur1);
    joueur2 = JOptionPane.showInputDialog(" Joueur 2, write your pseudo : ");
    JOptionPane.showMessageDialog(null, "Vous vous appelez donc : " 
            + joueur2);   
    }   
}
