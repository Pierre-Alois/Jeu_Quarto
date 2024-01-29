/*
Projet Java - Jeu Quarto
BERTIN Pierre-Aloïs - CALMET Pierre - SAID Gabriel
*/
package quarto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Plateau {
   
    // Attributs
    
    private int taille;
    private Piece[][] plateau;
    private int x,y;
    
    
    
    // Constructeur
    
    public Plateau(int taille, Piece[][] plateau, int x, int y){
        
        this.taille = taille;
        this.plateau = new Piece[taille][taille]; 
        this.x = x;
        this.y = y;
    }
    
    /*
      Méthode permettant de choisir la taille du plateau (3*3,4*4,5*5) 
      et de le créer.
     */
    public Piece[][] plateau (Joueur joueur){
        
        int taille ;
        Piece[][] plateau;
        Scanner sc = new Scanner(System.in);
        System.out.println(joueur + "Quelle taille du plateau choisissez-vous:" 
                                  + "\n" + "Tapez 3,4 ou 5");
        taille = sc.nextInt();
        plateau = new Piece[taille][taille];
        
        for(int p=0;p<taille*taille;p++){
            for(int q=0;q<taille*taille;q++){  
            }
        }
        
     return plateau;      
    }
    
    public void Choix_Piece(Joueur joueur, int taille){
        
        Scanner Scp = new Scanner(System.in);
        List<Piece> PI_dispo = new ArrayList<>();
        
        for(boolean haute : Arrays.asList(true,false)){
            for(String concistance : Arrays.asList("pleine","creuse")){
                for(String matiere : Arrays.asList("bois","marbre")){
                    for(String couleur : Arrays.asList("clair","foncée")){
                        for(String forme : Arrays.asList("ronde","carrée")){
                            PI_dispo.add(new Piece(haute,concistance,matiere,couleur,forme));
                        } 
                    }
                }
            }
        }
        int choix_pi=0;
        Scanner scp = new Scanner(System.in);
        System.out.println(joueur + ", vous allez devoir une pièce.\n " 
                + "Voici les pièces actuellement disponibles : \n" );
        
        for(Piece piece : PI_dispo){
            System.out.println(piece);
        }
        while(choix_pi<1 && choix_pi>PI_dispo.size()){
            choix_pi = scp.nextInt();
        }
        System.out.println("La pièce que vous avez choisie est donc : " 
                + PI_dispo.get(choix_pi));   
    }
    
    //Méthode permettant de vérifier l'alignement de pièces sur le plateau.
    public int Verif_alignement(){
        
        int cpt = 0;
        boolean algnt = false;
        
        return cpt;
    }
    
    public Piece Case_Libre(int x, int y){
   
        x= 0;
        y= 0;
        return plateau[x][y];
             
    }
}
