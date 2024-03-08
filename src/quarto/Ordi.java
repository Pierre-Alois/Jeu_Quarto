/*
Projet Java - Jeu Quarto
BERTIN Pierre-Aloïs - CALMET Pierre - SAID Gabriel
*/
package quarto;

public class Ordi extends Joueur {
    
    // Attributs
    private final String id;
    
    // Constructeur
    public Ordi(String pseudo) {
        super(pseudo);
        switch (pseudo) {
            case "Ordi débutant":
                id = "Y,6c3L=30Fln}k";
                break;
            case "Odri expérimenté":
                id = "c(W}6$eY4sY2l9";
                break;
            case "Ordi expert":
                id = "_/9,EUzMj427ix";
                break;
            default:
                id = "";
                break;
        }
    }
    
    // Getter
    public String getid(){
        return id;
    }
}