/*
Projet Java - Jeu Quarto
BERTIN Pierre-Aloïs - CALMET Pierre - SAID Gabriel
 */
package quarto;

import java.util.Random;
import java.util.Scanner;

public class Jeu {

    public void tourDeJeu() {
        int dim;
        while (true) {
            System.out.println("Sur quel taille de plateau voulez-vous jouer ?");
            String taille = scan();
            if (taille.length() == 1 && Character.isDigit(taille.charAt(0))) {
                dim = Integer.valueOf(taille);
                break;
            }
        }
        Plateau p = new Plateau(dim);
        int x, y;

        while (true) {
            String coo = p.position(p.choixPiece());

            x = Integer.valueOf("" + coo.charAt(0));
            y = Integer.valueOf("" + coo.charAt(1));

            if (p.gettaille() != 4 && p.verifFig(x, y)) {
                break;
            }
            if (x == y && p.diag315()) {
                break;
            }
            if (p.gettaille() - 1 - x == y && p.diag45()) {
                break;
            }
            if (p.gettaille() == 4 && p.carre(x, y)) {
                break;
            }
            if (p.gettaille() == 4 && p.vertical(y)) {
                break;
            }
            if (p.gettaille() == 4 && p.horizontal(x)) {
                break;
            }
            p.afficher();
        }
        System.out.println("FINIE");
    }

    public String scan() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    /*
    Méthode permettant le tirage au sort d'un joueur.
    Les chiffres 1 et 2 sont choisis au hasard. Si c'est 1 alors le joueur 1
    commence. Sinon c'est le joueur 2 
    Le 1er joueur devra ensuite choisir une pièce.
     */
    public Joueur choixJoueur(Joueur joueur, Joueur joueur1, Joueur joueur2) {

        Random alea = new Random();
        int choix_PL = alea.nextInt(1, 3);
        if (choix_PL == 1) {
            joueur = joueur1;
            return joueur1;
        } else;
        joueur = joueur2;
        return joueur2;
    }

    /*
    Méthode permettant de choisir la taille du plateau (3×3,4×4,5×5)et de le créer.
     */
    public int taillePlateau() {
        Scanner pl = new Scanner(System.in);
        int taille;
        while (true) {
            //System.out.println("""
            //Quelle taille du plateau choisissez-vous ?
            //Tapez 3,4 ou 5.""");
            taille = pl.nextInt();
            if (taille == 3 || taille == 4 || taille == 5) {
                break;
            }
            //System.out.println("Valeur incorrecte.");
        }
        return taille;
    }
}
