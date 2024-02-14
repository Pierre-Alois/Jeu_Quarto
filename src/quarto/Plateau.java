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
            // PI_dispo.add(piece_joker) On ajoute dans la liste la pièce Joker.
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
        for (Piece pieces : PI_dispo) {
            System.out.println(pieces);
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
                while (choix_p > gettaille() * gettaille() || choix_p < 0) {
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
    On vérifiera d'abord les alignements standards( lignes, colonnes et
    diagonales) avant se vérifier les formes. 
     */
    public boolean Verif_alignements(int taille, Piece[][] plateau, Piece piece) {

        // List<Integer> cpt = new ArrayList<>();
        // Verification des lignes
        for (int x = 0; x < gettaille() ; x++) {

            if (plateau[x][0].gethauteur() == plateau[x][1].gethauteur()
                    && plateau[x][0].gethauteur() == plateau[x][2].gethauteur()) {
                return true;
            } else if (plateau[x][0].getcolor().equals(plateau[x][1].getcolor())
                    && plateau[x][0].getcolor().equals(plateau[x][2].getcolor())) {
                return true;
            } else if (plateau[x][0].getforme().equals(plateau[x][1].getforme())
                    && plateau[x][0].getforme().equals(plateau[x][2].getforme())) {
                return true;
            } else if (plateau[x][0].getconcistance().equals(plateau[x][1].getconcistance())
                    && plateau[x][0].getconcistance().equals(plateau[x][2].getconcistance())) {
                return true;
            } else if (plateau[x][0].getMadeOf().equals(plateau[x][1].getMadeOf())
                    && plateau[x][0].getMadeOf().equals(plateau[x][2].getMadeOf())) {
                return true;
            }
        }

        //Vérification des colonnes
        for (int y = 0; y < gettaille() ; y++) {

            if (plateau[0][y].gethauteur() == plateau[1][y].gethauteur()
                    && plateau[0][y].gethauteur() == plateau[2][y].gethauteur()) {
                return true;
            } else if (plateau[0][y].getcolor().equals(plateau[1][y].getcolor())
                    && plateau[0][y].getcolor().equals(plateau[2][y].getcolor())) {
                return true;
            } else if (plateau[0][y].getforme().equals(plateau[1][y].getforme())
                    && plateau[0][y].getforme().equals(plateau[2][y].getforme())) {
                return true;
            } else if (plateau[0][y].getconcistance().equals(plateau[1][y].getconcistance())
                    && plateau[0][y].getconcistance().equals(plateau[2][y].getconcistance())) {
                return true;
            } else if (plateau[0][y].getMadeOf().equals(plateau[1][y].getMadeOf())
                    && plateau[0][y].getMadeOf().equals(plateau[2][y].getMadeOf())) {
                return true;
            }
        }

        //Vérification sur la diagonale Haut gauche - Bas droite
        for (int p = 0; p < gettaille() ; p++) {
            for (int q = 0; q < gettaille() * gettaille(); q++) {

                if (plateau[p][q].gethauteur() == plateau[p + 1][q + 1].gethauteur()) {
                    return true;
                } else if (plateau[p][q].getcolor().equals(plateau[p + 1][q + 1].getcolor())) {
                    return true;
                } else if (plateau[p][q].getforme().equals(plateau[p + 1][q + 1].getforme())) {
                    return true;
                } else if (plateau[p][q].getconcistance().equals(plateau[p + 1][q + 1].getconcistance())) {
                    return true;

                } else if (plateau[p][q].getMadeOf().equals(plateau[p + 1][q + 1].getMadeOf())) {
                    return true;
                }
            }
        }

        //Verification sur la diagonale Bas gauche - Haut droit
        for (int m = gettaille(); m >= 0; m--) {
            for (int n = 0; n < gettaille(); n++) {
                
                if (plateau[m][n].gethauteur() == plateau[m - 1][n + 1].gethauteur()) {
                    return true;
                }
                else if(plateau[m][n].getcolor().equals(plateau[m-1][n+1].getcolor())){
                    return true;
                }
                else if(plateau[m][n].getforme().equals(plateau[m-1][n+1].getforme())){
                    return true;   
                }
                else if(plateau[m][n].getconcistance().equals(plateau[m-1][n+1].getconcistance())){
                    return true;  
                }
                else if(plateau[m][n].getMadeOf().equals(plateau[m-1][n+1].getMadeOf())){
                    return true;     
                }
            }
        }

        // Vérifications des "L
        // Vérification des "carrés"
        // Vérifications pour grille 5*5
        return false;
    }

    

    public Piece Case_Libre(int x, int y) {
        x = 0;
        y = 0;
        return plateau[x][y] = null;
    }
}
