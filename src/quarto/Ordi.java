/*
Projet Java - Jeu Quarto
BERTIN Pierre-Aloïs - CALMET Pierre - SAID Gabriel
 */
package quarto;

public class Ordi extends Joueur {

    // Attributs
    private final String visible;
    
    // Constructeur
    public Ordi(String pseudo) {
        super(pseudo);
        switch (pseudo) {
            case "Y,6c3L=30Fln}k":
                visible = "Ordi débutant";
                break;
            case "c(W}6$eY4sY2l9":
                visible = "Odri expérimenté";
                break;
            case "_/9,EUzMj427ix":
                visible = "Ordi expert";
                break;
            default:
                visible = "";
                break;
        }
    }

    // Getter
    public String getvisible(){
        return visible;
    }
    
    // toString
    @Override
    public String toString(){
        return visible;
    }
}
