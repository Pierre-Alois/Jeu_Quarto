/*
Projet Java - Jeu Quarto
BERTIN Pierre-Aloïs - CALMET Pierre - SAID Gabriel
 */
package quarto;

public class Piece {

    // Attribut                  // Pion 00000 → Entier(section) - Grand - Plein(trou) - Carré - Blanc
    private final String ISBN;   // Pion 11111 → Tranché - Petit - Troué - Rond - Noir

    // Pion joker (xxxxx) → Arrondi - Moyen - Taillé - Croix - Violet (pour plateau 3*3 uniquement)
    // Constructeur 
    public Piece(String ISBN) {
        this.ISBN = ISBN;
    }

    // Getter 
    public String getISBN() {
        return ISBN;
    }

    // toString 
    @Override
    public String toString() {
        return ISBN;
    }
}
