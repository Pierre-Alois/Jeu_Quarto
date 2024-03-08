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

    public Piece(String ISBN) {
        this.ISBN = ISBN;
    }

    // Getter :
    public String getISBN() {
        return ISBN;
    }

    // toString :
    @Override
    public String toString() {
        return ISBN;
    }

}
