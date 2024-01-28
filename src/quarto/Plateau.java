
package quarto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Plateau {
   
    // Attributs
    
    private int taille;
    private int[][] plateau;
    
    
    // Constructeur
    
    public Plateau(int taille, int[][] plateau){
        
        this.taille = taille;
        this.plateau = plateau;
            
    }
    
    //Méthode permettant d'afficher le plateau de jeu 
    
    public void plateau(){
        
        for(int i=0;i<taille;i++){
            for(int j=0; j<taille;j++){
                
                
            }
        }
    }
    
    public void Choix_Piece(Joueur joueur, int taille){
        
        Scanner choix_PI = new Scanner(System.in);
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
        
        System.out.println(joueur + ", vous allez devoir une pièce.\n " 
                + "Voici les pièces actuellement disponibles : \n" );
        
        for(Piece piece : PI_dispo){
            System.out.println(piece);
        }     
    }
    
    
    
    //Méthode permettant de vérifier l'alignement de pièces sur le plateau.
    public int Verif_alignement(){
        
        int cpt = 0;
        boolean algnt = false;
        
        return cpt;
    }


    
    
    
 
    
    
    
       
}
