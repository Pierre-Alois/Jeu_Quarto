package quarto;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Jeu {
    
    //Attributs
    
    
    
    // Constructeur
    
    public Jeu(){
        
    }
    
    /*
    Méthode permettant le tirage au sort d'un joueur.
    Les chiffres 1 et 2 sont choisis au hasard. Si c'est 1 le joueur au pseudo 
    le plus cours commence et si c'est 2, le joueur au pseudo le plus long.
    Le joueur choisit devient le joueur 1.
    */
    public int Choix_Joueur(){
        Random rd = new Random();
        int choix_PL  = rd.nextInt(1,3);
        return choix_PL;   
    }
    
    /*
    Méthode permettant au joueur en cours de choisir une pièce et de la donner
    à son adversaire.
    */
    
    
    // Méthode permettant de choisir la taille du plateau (3*3,4*4,5*5)
    public int Grille(Joueur joueur){
        
        int taille ;
        Scanner sc = new Scanner(System.in);
        System.out.println(joueur + "Quelle taille du plateau choisissez-vous:" 
                                  + "\n" + "Tapez 3,4 ou 5");
        taille = sc.nextInt();
        return taille;      
    }
    
    
    // Méthode permettant de placer une pièce sur une case libre du plateau
    public void Placer(){
        
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
    public void jouer(){
        
    }
    
    
    
    
    



    

    
    
    
    
    
    
    
    
}
