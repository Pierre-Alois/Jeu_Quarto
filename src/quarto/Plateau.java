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
    private List liste; 
    
    // Constructeur
    
    public Plateau(int taille, Piece[][] plateau, List liste){
        this.taille = taille;
        this.plateau = new Piece[taille][taille];
        this.liste = liste; 
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
        plateau = new Piece[taille][taille];
        
        return plateau;      
    }
    
    //Getters
    
    public Piece[][] getPlateau(){
        return plateau;   
    }
    
    public int gettaille(){
        return taille;
    }
    
    public List getliste(){
        return liste;
    }
    
    /*
     Méthode où sont stockées l'ensemble des différentes pièces selon
     les plateaux
    */
    public List Banque(){
        
        System.out.println("Vous avez choisi un plateau de taille " 
        + gettaille() + "par" + gettaille() + "\n" + "Voici donc l'ensemble"
        + " des pièces disponibles : ");
        
        Piece piece;
        List<Piece> PI_dispo = new ArrayList<>();
        
        if(gettaille()==3){
            // PI_dispo.add(piece_joker) On ajoute dans la liste la pièce Joker.
            for(boolean haute : Arrays.asList(true,false)){
                for(String couleur : Arrays.asList("claire","foncée")){
                    for(String forme : Arrays.asList("ronde","carrée")){
                        PI_dispo.add(new Piece(haute,couleur,forme));
                    }
                }
            }
        }
        else if(gettaille()== 4){
            for(boolean haute : Arrays.asList(true,false)){
                for(String couleur : Arrays.asList("claire","foncée")){
                    for(String forme : Arrays.asList("ronde","carrée")){
                        for(String concistance : Arrays.asList("pleine","creuse")){
                            PI_dispo.add(new Piece(haute,couleur,forme,concistance));  
                        }   
                    }
                }
            }
        }
        else{
            for(boolean haute : Arrays.asList(true,false)){
                for(String couleur : Arrays.asList("claire","foncée")){
                    for(String forme : Arrays.asList("ronde","carrée")){
                        for(String concistance : Arrays.asList("pleine","creuse")){
                            for(String matiere : Arrays.asList("bois","marbre")){
                                PI_dispo.add(new Piece(haute,couleur,forme,concistance,matiere));  
                            }    
                        }   
                    }
                }
            }  
        }
        for(Piece pieces : PI_dispo){
            System.out.println(pieces);   
        }
        return PI_dispo;
    }
    
    public Piece Choix_Piece(Joueur joueur){
        
        Scanner Sc = new Scanner(System.in);
        String choix_p; //Choix piece
        Piece piece_J = null; // Piece jouée
        Piece joker = null;
        System.out.println(joueur + ", vous allez devoir une pièce");
        
        /* Piece Joker
           Si le plateau est 3*3, on introduit alors une pièce Joker neutre qui
           ne s'associe avec aucune pièce. 
        */
        if(gettaille() == 3){
            System.out.println("Souhaitez-vous utiliser la pièce Joker 0/N ?");
            choix_p = Sc.nextLine();
            while(!choix_p.equals("O")||!choix_p.equals("N")){
                System.out.println("Souhaitez-vous utiliser la pièce Joker"
                                  + " 0/N ?");          
            }
            if(choix_p.equals("O")){
                piece_J = joker; 
                return piece_J;
            }
            else{
                System.out.println("Voici alors les pièces disponibles :\n");
                for(Object pieces : getliste()){
                    for(int j=0;j<gettaille()*gettaille();j++){
                        System.out.println("j:" + pieces);
                    }   
                }
                
        System.out.println("La pièce que vous avez choisie est donc : " 
                + getliste());
                
            }
        return piece_J;
        }
    return piece_J;   
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
