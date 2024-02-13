/*
Projet Java - Jeu Quarto
BERTIN Pierre-Aloïs - CALMET Pierre - SAID Gabriel
*/
package quarto;

public class Piece {

    //Attributs
    
    private boolean haute;
    private String consistance;
    private String matiere;
    private String couleur;
    private String forme;
    private boolean creuse;
    
    // Constructeu
    
    public Piece(boolean haute,String consistance, String matiere ,  
                 String couleur, String forme){
        
        this.haute = haute;
        this.consistance = consistance;
        this.matiere = matiere;
        this.couleur = couleur; 
        this.forme = forme;    
    }
    
    //Getters
    
    public boolean gettaille(){
        return haute;
    }
    
    public String getconcistance(){
        return consistance;
    }
    
    public String getMadeOf(){
        return matiere;
    }
    
    public String getcolor(){
        return couleur;
    }
    
    public String getforme(){
        return forme;
    }
    
    //Méthode permettant d'afficher les pièces sur le plateau.
    public void Afficher_Piece(){
        System.out.println("Voici les caractéristiques de la pièce : \n" 
        + haute + "," + consistance + "," + matiere + "," + couleur + "," + forme);         
    } 
}
