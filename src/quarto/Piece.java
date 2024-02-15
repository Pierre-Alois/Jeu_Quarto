/*
Projet Java - Jeu Quarto
BERTIN Pierre-Aloïs - CALMET Pierre - SAID Gabriel
 */
package quarto;

public class Piece {

    //Attributs
    private boolean haute;
    private String concistance;
    private String matiere;
    private String couleur;
    private String forme;
    private boolean creuse;

    /*
      Constructeurs au nombre de 3 car 3 types de pièces différentes. 
    */
    public Piece(boolean haute, String couleur, String forme) {
        this.haute = haute;
        this.couleur = couleur;
        this.forme = forme;
    }

    public Piece(boolean haute, String couleur, String forme,
            String consistance) {
        this.haute = haute;
        this.couleur = couleur;
        this.forme = forme;
        this.concistance = concistance;
    }

    public Piece(boolean haute, String couleur, String forme,
            String concistance, String matiere) {
        this.haute = haute;
        this.couleur = couleur;
        this.forme = forme;
        this.concistance = concistance;
        this.matiere = matiere;
    }
    
    //Getters
    public boolean gethauteur() {
        return haute;
    }

    public String getconcistance() {
        return concistance;
    }

    public String getMadeOf() {
        return matiere;
    }

    public String getcolor() {
        return couleur;
    }

    public String getforme() {
        return forme;
    }

    public String toString(){
        return haute + couleur + forme + concistance + matiere; 
    }
}
