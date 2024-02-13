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

    // Constructeurs
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
        this.consistance = consistance;
    }

    public Piece(boolean haute, String couleur, String forme,
            String consistance, String matiere) {
        this.haute = haute;
        this.couleur = couleur;
        this.forme = forme;
        this.consistance = consistance;
        this.matiere = matiere;
    }

    /*
     Méthodes où sont stockées l'ensemble des différentes pièces selon
     les plateaux
     */
    //Getters
    public boolean gettaille() {
        return haute;
    }

    public String getconcistance() {
        return consistance;
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

    //Méthode permettant d'afficher les pièces sur le plateau.
    public void Afficher_Piece() {
        System.out.println("Voici les caractéristiques de la pièce : \n"
                + haute + "," + consistance + "," + matiere + "," + couleur + "," + forme);
    }
}
