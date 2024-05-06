/*
Projet Java - Jeu Quarto
BERTIN Pierre-Aloïs - CALMET Pierre - SAID Gabriel
 */
package quarto;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;
import java.util.Scanner;

public class Plateau {

    // Attributs
    private final int taille;
    private Piece[][] plateau;
    private ArrayList<Piece> liste;
    
    // Constructeur
    public Plateau(int taille) {
        this.taille = taille;
        this.plateau = new Piece[taille][taille];

        /*
         A l'aide de la variable ISBN de type String, on use du langage binaire
         pour ajouter une piece unique à notre liste. 
         */
        ArrayList<Piece> liste = new ArrayList<Piece>();
        int nb = 1;
        for (int f = 0; f < taille; f++) {
            nb = nb * 2;
        }
        for (int t = 0; t < nb; t++) {
            String binaire = Integer.toBinaryString(t);

            int s = binaire.length();

            String z = "";

            for (int i = 0; i < 5 - s; i++) {
                z += "0";
            }
            binaire = z + binaire;

            liste.add(new Piece(binaire));
        }
        if (taille == 3) {
            liste.add(new Piece("xxxxx"));
        }
        this.liste = new ArrayList<Piece>();
        this.liste.addAll(liste); // La liste de pièce est prête pour le jeu
    }
    
    // Getters
    public Piece[][] getplateau(){
        return plateau;
    }

    public int gettaille() {
        return taille;
    }

    public ArrayList getliste() {
        return liste;
    }
            
    // Setter
    public void setplateau(int x, int y, String val){
        ListIterator<Piece> ite = liste.listIterator();
        while(ite.hasNext()){
            if(ite.next().getISBN().equals(val)){
                ite.remove();
                break;
            }
        }
        Piece pion = new Piece(val);
        plateau[x][y] = pion;
    }
    
    // VÉRIF
    // Valable pour tout :
    /*
    Méthodes pour vérifier un alignement dans les diagonales qui fonctionnent
    pour les toutes grilles.
    Il faut juste s'assurer que x == y pour diag315()
    et que taille-1-x == y pour diag45().
     */
    // Diagonale bas-gauche --> haut-droite
    public boolean diag45() {
        for (int i = taille - 1; i >= 0; i--) {
            if (caseLibre(taille - 1, 0)) {
                break;
            }
            int cpt = 1;
            String cara = "" + plateau[taille - 1][0].getISBN().charAt(i);
            for (int j = 1; j < taille; j++) {
                if (caseLibre(taille - 1 - j, j)) {
                    return false;
                }
                String test = "" + plateau[taille - 1 - j][j].getISBN().charAt(i);
                if (!test.equals(cara)) {
                    break;
                }
                cpt++;
            }
            if (cpt == taille) {
                return true;
            }
        }
        return false;
    }

    // Diagonale haut-gauche -->  bas-droite
    public boolean diag315() {
        for (int i = taille - 1; i >= 0; i--) {
            if (caseLibre(0, 0)) {
                break;
            }
            int cpt = 1;
            String cara = "" + plateau[0][0].getISBN().charAt(i);
            for (int j = 1; j < taille; j++) {
                if (caseLibre(j, j)) {
                    return false;
                }
                String test = "" + plateau[j][j].getISBN().charAt(i);
                if (!test.equals(cara)) {
                    break;
                }
                cpt++;
            }
            if (cpt == taille) {
                return true;
            }
        }
        return false;
    }

    // Valable pour 3×3 et 5×5 seulement :
    /*
    Méthode pour vérifier une figure dans les grilles 3×3 et 5×5.
    */
    public boolean verifFig(int x, int y){
        for(int i=4 ; i>=5-taille ; i--){
            int cpt = 1;
            String cara = "" + plateau[x][y].getISBN().charAt(i); // On relève les caractéristiques du PION à cette coordonée
            String coo = convert(x, y);
            ArrayList<String> annuaire = new ArrayList<String>();
            annuaire.add(coo);

            cpt += boucle(annuaire, x, y, cara, i);

            if (cpt >= taille) {
                return true;
            }
        }
        return false;
    }

    /*
    Méthode récursive qui vérifie si une piéce l adjacente à la précédente
    possède la caractéristique de référence.
     */
    public int boucle(ArrayList annuaire, int x, int y, String cara, int n) {
        int cpt = 0;
        if (x != taille - 1) {
            if (ajout(annuaire, x + 1, y, cara, n)) {
                cpt += 1 + boucle(annuaire, x + 1, y, cara, n);
            }
        }
        if (y != taille - 1) {
            if (ajout(annuaire, x, y + 1, cara, n)) {
                cpt += 1 + boucle(annuaire, x, y + 1, cara, n);
            }
        }
        if (x != 0) {
            if (ajout(annuaire, x - 1, y, cara, n)) {
                cpt += 1 + boucle(annuaire, x - 1, y, cara, n);
            }
        }
        if (y != 0) {
            if (ajout(annuaire, x, y - 1, cara, n)) {
                cpt += 1 + boucle(annuaire, x, y - 1, cara, n);
            }
        }
        return cpt;
    }

    /*
    Méthode ajoutant les coordonnées de la case étudiée dans la liste
    si un pion y est présent avec la même carctéristique que le premier.
     */
    public boolean ajout(ArrayList annuaire, int x, int y, String cara, int n) {
        if (caseLibre(x, y)) {
            return false;
        }
        String test = "" + plateau[x][y].getISBN().charAt(n);
        if (test.equals(cara)) {
            String coo = convert(x, y);
            if (!annuaire.contains(coo)) {
                annuaire.add(coo);
                return true;
            }
        }
        return false;
    }

    /*
    Méthode convertissant les deux entiers correspondant à des coordonnées
    en une chaîne.
     */
    public String convert(int x, int y) {
        String u = "" + x;
        String v = "" + y;
        return u + v;
    }

    // Valable pour 4×4 seulement :
    /*
    Méthode pour vérifier un carré en 4×4.
    */
    public boolean carre(int x, int y){
        for(int i=4 ; i>=1 ; i--){
            String cara = "" + plateau[x][y].getISBN().charAt(i);
            boolean bas = false, droite = false, haut = false, gauche = false;
            // Définition de bas, droite, haut et gauche correspondant aux cases autour du pion posé.
            if (x != 3 && !caseLibre(x + 1, y)) {
                String test = "" + plateau[x + 1][y].getISBN().charAt(i);
                if (test.equals(cara)) {
                    bas = true;
                }
            }
            if (y != 3 && !caseLibre(x, y + 1)) {
                String test = "" + plateau[x][y + 1].getISBN().charAt(i);
                if (test.equals(cara)) {
                    droite = true;
                }
            }
            if (x != 0 && !caseLibre(x - 1, y)) {
                String test = "" + plateau[x - 1][y].getISBN().charAt(i);
                if (test.equals(cara)) {
                    haut = true;
                }
            }
            if (y != 0 && !caseLibre(x, y - 1)) {
                String test = "" + plateau[x][y - 1].getISBN().charAt(i);
                if (test.equals(cara)) {
                    gauche = true;
                }
            }
            // Vérification des carrés en fonction de bas, droite, haut et gauche.
            if (bas && droite && !caseLibre(x + 1, y + 1)) {
                String test = "" + plateau[x + 1][y + 1].getISBN().charAt(i);
                if (test.equals(cara)) {
                    return true;
                }
            }
            if (droite && haut && !caseLibre(x - 1, y + 1)) {
                String test = "" + plateau[x - 1][y + 1].getISBN().charAt(i);
                if (test.equals(cara)) {
                    return true;
                }
            }
            if (haut && gauche && !caseLibre(x - 1, y - 1)) {
                String test = "" + plateau[x - 1][y - 1].getISBN().charAt(i);
                if (test.equals(cara)) {
                    return true;
                }
            }
            if (gauche && bas && !caseLibre(x + 1, y - 1)) {
                String test = "" + plateau[x + 1][y - 1].getISBN().charAt(i);
                if (test.equals(cara)) {
                    return true;
                }
            }
        }
        return false;
    }

    /*
    Méthode pour vérifier un alignement horizontal.
     */
    public boolean horizontal(int x) {
        for (int i = 3; i >= 0; i--) {
            if (caseLibre(x, 0)) {
                break;
            }
            int cpt = 1;
            String cara = "" + plateau[x][0].getISBN().charAt(i);
            for (int j = 1; j < 4; j++) {
                if (caseLibre(x, j)) {
                    return false;
                }
                String test = "" + plateau[x][j].getISBN().charAt(i);
                if (!test.equals(cara)) {
                    break;
                }
                cpt++;
            }
            if (cpt == 4) {
                return true;
            }
        }
        return false;
    }

    /*
    Méthode pour vérifier un alignement vertical.
     */
    public boolean vertical(int y) {
        for (int i = 3; i >= 0; i--) {
            if (caseLibre(0, y)) {
                break;
            }
            int cpt = 1;
            String cara = "" + plateau[0][y].getISBN().charAt(i);
            for (int j = 1; j < 4; j++) {
                if (caseLibre(j, y)) {
                    return false;
                }
                String test = "" + plateau[j][y].getISBN().charAt(i);
                if (!test.equals(cara)) {
                    break;
                }
                cpt++;
            }
            if (cpt == 4) {
                return true;
            }
        }
        return false;
    }

    // FIN VÉRIF
    // Méthode pour choisir son PION.
    public Piece choixPiece() {
        String c, f, t, h = "", s = "", z = "";
        String str = "";
        boolean stop = false;
        while (true) {
            System.out.println("""
                                Quelle couleur ?
                                0 = blanc ; 1 = noir ; x = immeuble""");

            c = scan();
            System.out.println("""
                                Quelle forme ?
                                0 = carré ; 1 = rond ; x = immeuble""");

            f = scan();
            System.out.println("""
                                Quel intérieur ?
                                0 = plein ; 1 = troué ; x = immeuble""");

            t = scan();
            if (taille >= 4) {
                System.out.println("""
                                    Quelle taille ?
                                    0 = grand ; 1 = petit""");

                h = scan();
                if (taille > 4) {
                    System.out.println("""
                                    Quelle coupe ?
                                    0 = entier ; 1 = tranché""");

                    s = scan();
                }
            }
            if (taille == 3) {
                if (c.equals("x") && f.equals("x") && t.equals("x")) {
                    z = "xx";
                } else {
                    z = "00";
                }
            } else if (taille == 4) {
                z = "0";
            }

            str = z + s + h + t + f + c; // Ensemble des caractéristiques du PION
            ListIterator<Piece> ite = liste.listIterator();
            while (ite.hasNext()) {
                if (ite.next().getISBN().equals(str)) {
                    ite.remove();
                    stop = true; // Le PION existe bien et on le pioche
                    break;
                }
            }
            if (stop) {
                break;
            }
            System.out.println("Cette pièce n'est pas disponible.");
        }
        Piece pion = new Piece(str);
        return pion;
    }

    // Méthode pour poser son PION.
    public String position(Piece pion) {
        int x, y;
        String coo, u, v;
        while (true) {
            System.out.println("""
                               Veuillez choisir la case où poser votre pion.
                               {Exemples : 11 ; 45 ; 33; 52 ...}""");

            coo = scan();
            if (coo.length() != 2) {
                System.out.println("Rentrez seulement DEUX chiffres.");
                continue;
            }
            if (!Character.isDigit(coo.charAt((0))) || !Character.isDigit(coo.charAt(1))) {
                System.out.println("Rentrez seulement deux CHIFFRES.");
                continue;
            }
            u = "" + coo.charAt(0);
            v = "" + coo.charAt(1);
            x = Integer.valueOf(u);
            y = Integer.valueOf(v);
            
            if(x != 0){
                x--;
            }
            if(y != 0){
                y--;
            }
            
            if(x >= taille || y >= taille){
                System.out.println("Case inexistante.");
                continue;
            }

            if (caseLibre(x, y)) {
                break;
            }
            System.out.println("Case déjà occupée.");
        }
        plateau[x][y] = pion;
        coo = "" + x + y;
        return coo;
    }
    
    // Méthode qui permet de placer un pion depuis l'interface graphique.
    public void posePion(String coo, String ISBN){
        int x = Integer.valueOf("" + coo.charAt(1)) - 1;
        int y = Integer.valueOf("" + coo.charAt(2)) - 1;
        plateau[x][y] = new Piece(ISBN);
    }
    
    // Méthode vérifiant si une case du plateau n'est pas occupée.
    public boolean caseLibre(int x, int y) {
        return plateau[x][y] == null;
    }

    //Scanner
    public String scan() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public String ordiFacile() {
        Random alea = new Random();
        Piece pion = liste.remove(alea.nextInt(0, liste.size()));
        ArrayList<String> libre = new ArrayList<String>();
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                if (caseLibre(i, j)) {
                    libre.add("" + i + j);
                }
            }
        }
        String coo = libre.get(alea.nextInt(0, libre.size()));
        int x = Integer.valueOf("" + coo.charAt(0));
        int y = Integer.valueOf("" + coo.charAt(1));
        plateau[x][y] = pion;
        return coo;
    }

    public void afficher() {
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                System.out.print(plateau[i][j] + " | ");
            }
            System.out.println("\n");
        }
    }
}

   
