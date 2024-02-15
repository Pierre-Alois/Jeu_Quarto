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
    private int x, y;
    private List liste;

    // Constructeur
    public Plateau(int taille, Piece[][] plateau, List liste) {
        this.taille = taille;
        this.plateau = new Piece[taille][taille];
        this.liste = liste;
    }

    /*
      Méthode permettant de choisir la taille du plateau (3*3,4*4,5*5) 
      et de le créer.
     */
    public Piece[][] plateau(Joueur joueur) {

        Piece[][] plateau;
        Scanner pl = new Scanner(System.in);
        System.out.println(joueur + "Quelle taille du plateau choisissez-vous:"
                + "\n" + "Tapez 3,4 ou 5");
        taille = pl.nextInt();
        plateau = new Piece[taille][taille];

        return plateau;
    }

    //Getters
    public Piece[][] getPlateau() {
        return plateau;
    }

    public int gettaille() {
        return taille;
    }

    public List getliste() {
        return liste;
    }

    /*
     Méthode où sont stockées l'ensemble des différentes pièces selon
     les plateaux
     */
    public List Banque() {

        System.out.println("Vous avez choisi un plateau de taille "
                + gettaille() + "par" + gettaille() + "\n" + "Voici donc l'ensemble"
                + " des pièces disponibles : ");

        Piece piece;
        List<Piece> PI_dispo = new ArrayList<>();

        if (gettaille() == 3) {
            for (boolean haute : Arrays.asList(true, false)) {
                for (String couleur : Arrays.asList("claire", "foncée")) {
                    for (String forme : Arrays.asList("ronde", "carrée")) {
                        PI_dispo.add(new Piece(haute, couleur, forme));
                    }
                }
            }
        } else if (gettaille() == 4) {
            for (boolean haute : Arrays.asList(true, false)) {
                for (String couleur : Arrays.asList("claire", "foncée")) {
                    for (String forme : Arrays.asList("ronde", "carrée")) {
                        for (String concistance : Arrays.asList("pleine", "creuse")) {
                            PI_dispo.add(new Piece(haute, couleur, forme, concistance));
                        }
                    }
                }
            }
        } else {
            for (boolean haute : Arrays.asList(true, false)) {
                for (String couleur : Arrays.asList("claire", "foncée")) {
                    for (String forme : Arrays.asList("ronde", "carrée")) {
                        for (String concistance : Arrays.asList("pleine", "creuse")) {
                            for (String matiere : Arrays.asList("bois", "marbre")) {
                                PI_dispo.add(new Piece(haute, couleur, forme, concistance, matiere));
                            }
                        }
                    }
                }
            }
        }
    return PI_dispo;
    }

    /*
      Méthode permettant au joueur de choisir la piece qu'il souhaite poser. 
      Elle renvoie un Objet de type Piece (si c'est la pièce Joker). Int sinon 
     */
    public Object Choix_Piece(Joueur joueur) {

        Scanner Sc = new Scanner(System.in);
        String choix_J; //Piece Joker
        int choix_p;
        Piece piece = null; // Piece conervée
        Piece joker = null;
        System.out.println(joueur + ", vous allez devoir une pièce");

        /* Piece Joker
           Si le plateau est 3*3, on introduit alors une pièce Joker neutre qui
           ne s'associe avec aucune pièce. 
         */
        if (gettaille() == 3) {
            System.out.println("Souhaitez-vous utiliser la pièce Joker 0/N ?");
            choix_J = Sc.nextLine();
            while (!choix_J.equals("O") || !choix_J.equals("N")) {
                System.out.println("Je n'ai pas comrpris : \n"
                        + "Souhaitez-vous utiliser la pièce Joker ?" + " 0/N ?");
            }
            if (choix_J.equals("O")) {
                piece = joker;
                return piece;
            } else {
                System.out.println("Voici alors les pièces disponibles :\n");
                for (Object pieces : getliste()) {
                    for (int j = 0; j < gettaille() * gettaille(); j++) { //taille de la boucle à vérifier
                        System.out.println("j:" + pieces);
                    }
                }
                System.out.println("Taper le numéro pour choisir la pièce :");
                choix_p = Sc.nextInt();
                while (choix_p < gettaille() * gettaille() || choix_p >= 0) {
                    System.out.println("ERREUR: Il faut rentre un numéro.");
                    choix_p = Sc.nextInt();
                    return choix_p;
                }
            }
        }
        return piece;
    }

    /* 
    Méthodes permettant de vérifier l'alignement de pièces sur le plateau. 
    On vérifiera d'abord les alignements standards(lignes, colonnes et
    diagonales) avant se vérifier les formes. 
     */
    public boolean Verif_alignements(int taille, Piece[][] plateau, Piece piece) {

        // List<Integer> cpt = new ArrayList<>();
        int cpt = 1;

        // Verification des lignes
        for (int i = 0; i < taille;) {
            for (int j = 0; j < taille - 1; j++) {
                if (plateau[i][j].gethauteur() == plateau[i][j + 1].gethauteur()) {
                    cpt += 1;
                } else {
                    cpt = 1; // On réinitialise le compteur pour regarder les autres caractéristiques
                }
                if (plateau[i][j].getcolor().equals(plateau[i][j + 1].getcolor())) {
                    cpt += 1;
                } else {
                    cpt = 1;
                }
                if (plateau[i][j].getforme().equals(plateau[i][j + 1].getforme())) {
                    cpt += 1;
                } else {
                    cpt = 1;
                }
                if (plateau[i][j].getconcistance().equals(plateau[i][j + 1].getconcistance())) {
                    cpt += 1;
                } else {
                    cpt = 1;
                }
                if (plateau[i][j].getMadeOf().equals(plateau[i][j + 1].getMadeOf())) {
                    cpt += 1;
                } else {
                    cpt = 1;
                }
            }
            i++;
        }

        //Vérification des colonnes
        for (int a = 0; a < taille - 1; a++) {
            for (int b = 0; b < taille;) {

                if (plateau[a][b].gethauteur() == plateau[a + 1][b].gethauteur()) {
                    cpt += 1;
                } else {
                    cpt = 1;
                }
                if (plateau[a][b].getcolor().equals(plateau[a + 1][b].getcolor())) {
                    cpt += 1;
                } else {
                    cpt = 1;
                }
                if (plateau[a][b].getforme().equals(plateau[a + 1][b].getforme())) {
                    cpt += 1;
                } else {
                    cpt = 1;
                }
                if (plateau[a][b].getconcistance().equals(plateau[a + 1][b].getconcistance())) {
                    cpt += 1;
                } else {
                    cpt = 1;
                }
                if (plateau[a][b].getMadeOf().equals(plateau[a + 1][b].getMadeOf())) {
                    cpt += 1;
                } else {
                    cpt = 1;
                }
                b++;
            }
        }

        //Vérification sur la diagonale Haut gaucheB → as droite
        for (int p = 0; p < taille - 2; p++) {
            for (int q = 0; q < taille - 2; q++) {
                if (plateau[p][q].gethauteur() == plateau[p + 1][q + 1].gethauteur()) {
                    cpt += 1;
                } else {
                    cpt = 1;
                }
                if (plateau[p][q].getcolor().equals(plateau[p + 1][q + 1].getcolor())) {
                    cpt += 1;
                } else {
                    cpt = 1;
                }
                if (plateau[p][q].getforme().equals(plateau[p + 1][q + 1].getforme())) {
                    cpt += 1;
                } else {
                    cpt = 1;
                }
                if (plateau[p][q].getconcistance().equals(plateau[p + 1][q + 1].getconcistance())) {
                    cpt += 1;
                } else {
                    cpt = 1;
                }
                if (plateau[p][q].getMadeOf().equals(plateau[p + 1][q + 1].getMadeOf())) {
                    cpt += 1;
                } else {
                    cpt = 1;
                }
            }
        }

        //Verification sur la diagonale Bas gauche → Haut droit
        for (int m = taille - 1; m >= 0; m--) {
            for (int n = 0; n < taille; n++) {

                if (plateau[m][n].gethauteur() == plateau[m - 1][n + 1].gethauteur()) {
                    cpt += 1;
                } else {
                    cpt = 1;
                }
                if (plateau[m][n].getcolor().equals(plateau[m - 1][n + 1].getcolor())) {
                    cpt += 1;
                } else {
                    cpt = 1;
                }
                if (plateau[m][n].getforme().equals(plateau[m - 1][n + 1].getforme())) {
                    cpt += 1;
                } else {
                    cpt = 1;
                }
                if (plateau[m][n].getconcistance().equals(plateau[m - 1][n + 1].getconcistance())) {
                    cpt += 1;
                } else {
                    cpt = 1;
                }
                if (plateau[m][n].getMadeOf().equals(plateau[m - 1][n + 1].getMadeOf())) {
                    cpt += 1;
                } else {
                    cpt = 1;
                }
            }
        }

        // Vérifications des "L" Grille 3*3
        
        // Vérification des "carrés" Grille 4*4
        for (int r = 0; r < 2;) {
            for (int s = 0; s < 2;) {
                if (plateau[r][s].gethauteur() == plateau[r][s + 1].gethauteur()) {
                    cpt += 1;
                    r++;
                    if (plateau[r - 1][s].gethauteur() == plateau[r][s].gethauteur()) {
                        cpt += 1;
                        s++;
                        if (plateau[r - 1][s - 1].gethauteur() == plateau[r][s].gethauteur()) {
                            cpt += 1;
                        } else {
                            cpt = 1;
                        }
                    } else {
                        cpt = 1;
                    }
                } else {
                    cpt = 1;
                }
                if (plateau[r][s].getcolor().equals(plateau[r][s + 1].getcolor())) {
                    cpt += 1;
                    r++;
                    if (plateau[r - 1][s].getcolor().equals(plateau[r][s].getcolor())) {
                        cpt += 1;
                        s++;
                        if (plateau[r - 1][s - 1].getcolor().equals(plateau[r][s].getcolor())) {
                            cpt += 1;
                        } else {
                            cpt = 1;
                        }
                    } else {
                        cpt = 1;
                    }
                } else {
                    cpt = 1;
                }
                if (plateau[r][s].getforme().equals(plateau[r][s + 1].getforme())) {
                    cpt += 1;
                    r++;
                    if (plateau[r - 1][s].getforme().equals(plateau[r][s].getforme())) {
                        cpt += 1;
                        s++;
                        if (plateau[r - 1][s - 1].getforme().equals(plateau[r][s].getforme())) {
                            cpt += 1;
                        } else {
                            cpt = 1;
                        }
                    } else {
                        cpt = 1;
                    }
                } else {
                    cpt = 1;
                }
                if (plateau[r][s].getconcistance().equals(plateau[r][s + 1].getconcistance())) {
                    cpt += 1;
                    r++;
                    if (plateau[r - 1][s].getconcistance().equals(plateau[r][s].getconcistance())) {
                        cpt += 1;
                        s++;
                        if (plateau[r - 1][s - 1].getconcistance().equals(plateau[r][s].getconcistance())) {
                            cpt += 1;
                        } else {
                            cpt = 1;
                        }
                    } else {
                        cpt = 1;
                    }
                } else {
                    cpt = 1;
                }
                if (plateau[r][s].getMadeOf().equals(plateau[r][s + 1].getMadeOf())) {
                    cpt += 1;
                    r++;
                    if (plateau[r - 1][s].getMadeOf().equals(plateau[r][s].getMadeOf())) {
                        cpt += 1;
                        s++;
                        if (plateau[r - 1][s - 1].getMadeOf().equals(plateau[r][s].getMadeOf())) {
                            cpt += 1;
                        } else {
                            cpt = 1;
                        }
                    } else {
                        cpt = 1;
                    }
                } else {
                    cpt = 1;
                }
                s++;
            }
            r++;
        }

        // Vérifications pour grille 5*5
        
        return cpt >= gettaille();
    }

    public Piece Case_Libre(int x, int y) {
        x = 0;
        y = 0;
        return plateau[x][y] = null;
    }
}
