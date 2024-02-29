/*
Projet Java - Jeu Quarto
BERTIN Pierre-Aloïs - CALMET Pierre - SAID Gabriel
*/
package quarto;

public class Piece {

    // Attribut :                   // Pion 00000 → Entier(section) - Grand - Plein(trou) - Carré - Blanc
    private final String ISBN;      // Pion 11111 →     Tranché     - Petit -    Troué    -  Rond - Noir
                                    // Pion xxxxx →     Arrondi     - Moyen -   Taillé    - Croix - Violet (SPÉCIAL 3×3 !!!)
    // Constructeur :
    public Piece(String ISBN){
        this.ISBN = ISBN;
    }
    
    // Getter :
    public String getISBN(){
        return ISBN;
    }
    
    // toString :
    @Override
    public String toString(){
        return ISBN; 
    }
}



// OLD

/*
    //Attributs
    private boolean haute;
    private String consistance;
    private String matiere;
    private String couleur;
    private String forme;
    private boolean creuse;

    
    //Constructeurs au nombre de 3 car 3 types de pièces différentes. 
    
    public Piece(boolean haute, String couleur, String forme){
        this.haute = haute;
        this.couleur = couleur;
        this.forme = forme;
    }

    public Piece(boolean haute, String couleur, String forme, String consistance){
        this.haute = haute;
        this.couleur = couleur;
        this.forme = forme;
        this.consistance = consistance;
    }

    public Piece(boolean haute, String couleur, String forme, String consistance, String matiere){
        this.haute = haute;
        this.couleur = couleur;
        this.forme = forme;
        this.consistance = consistance;
        this.matiere = matiere;
    }

    //Getters
    public boolean gethauteur() {
        return haute;
    }

    public String getconsistance() {
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
*/