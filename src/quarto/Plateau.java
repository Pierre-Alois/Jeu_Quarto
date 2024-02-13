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
    
    public Plateau(int taille, Piece[][] plateau){
        this.taille = taille;
        this.plateau = new Piece[taille][taille];     
    }
    
    /*
      Méthode permettant de choisir la taille du plateau (3*3,4*4,5*5) 
      et de le créer.
     */
    public Piece[][] plateau (Joueur joueur){
        
        Piece[][] plateau;
        Scanner pl = new Scanner(System.in);
        System.out.println(joueur + "Quelle taille du plateau choisissez-vous:" 
                                  + "\n" + "Tapez 3,4 ou 5");
        taille = pl.nextInt();
        this.plateau = new Piece[taille][taille];
        
    return this.plateau;      
    }
    
    //Getters
    
    public Piece[][] getPlateau(){
        return plateau;   
    }
    
    public int gettaille(){
        return taille;
    }
    
    public Piece Choix_Piece(Joueur joueur, int taille){
        
        Piece piece = null;
        Scanner Scp = new Scanner(System.in);
        List<Piece> PI_dispo = new ArrayList<>();
        
        //On pourra changer les caractéristiques
        for(boolean haute : Arrays.asList(true,false)){
            for(String concistance : Arrays.asList("pleine","creuse")){
                for(String matiere : Arrays.asList("bois","marbre")){
                    for(String couleur : Arrays.asList("claire","foncée")){
                        for(String forme : Arrays.asList("ronde","carrée")){
                            PI_dispo.add(new Piece(haute,concistance,matiere,couleur,forme));
                        } 
                    }
                }
            }
        }
        int choix_pi=0;
        String choix_J;
        Piece joker = null; 
        
        System.out.println(joueur + ", vous allez devoir une pièce");
        
        // Piece Joker
        if(taille == 3){
           System.out.println("Souhaitez-vous utiliser la pièce Joker 0/N ?");
           choix_J = Scp.nextLine();
            
            if(choix_J.equals("O")){
                piece = joker;
                return piece;
            }
            else{
                System.out.println("Voici alors les pièces disponibles :\n" );
                for(Piece pieces : PI_dispo){
                    System.out.println(pieces);
                }       
                while(choix_pi<1 && choix_pi>PI_dispo.size()){
                    choix_pi = Scp.nextInt();
                }
        System.out.println("La pièce que vous avez choisie est donc : " 
                + PI_dispo.get(choix_pi));
                
            }
        return PI_dispo.get(choix_pi); 
        }
    return piece;   
    }
    
    /* 
    Méthode permettant de vérifier l'alignement de pièces sur le plateau. 
    On vérifiera d'abord verticalement et horizontalement puis en diagonale.
    */
    public boolean Verif_alignement(int taille, int x, int y){
        
        int cpt = 0;
        Piece piece1,piece2,piece3,piece4,piece5 = plateau[x][y];
        
        // Vérifications
        for(int i = 0;i<plateau.length;i++){
            for(int j = 0; j<plateau.length;j++){
                
            }
        }
        
    return cpt == taille; // Si le compteur vaut la taille du plateau → 3-4-5 pièces sont alignées 
    }
    
    public Piece Case_Libre(int x, int y){
        x = 0;
        y = 0;
        return plateau[x][y]= null;        
    }    
}
