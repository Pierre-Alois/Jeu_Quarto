/*
Projet Java - Jeu Quarto
BERTIN Pierre-Aloïs - CALMET Pierre - SAID Gabriel
*/
package quarto;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Plateau {

    // Attributs
    private final int taille;
    private Piece[][] plateau;
    private ArrayList liste;
    
    private static final String FichierQuarto = "FichierQuarto.txt";
    
    // Constructeur
    public Plateau(int taille){
        this.taille = taille;
        this.plateau = new Piece[taille][taille];
        
        /*
         A l'aide de la variable ISBN de type String, on use du langage binaire
         pour ajouter une piece unique à notre liste. 
        */
        ArrayList<Piece> liste = new ArrayList<>();
        int nb = 1;
        for(int f=0;f<taille;f++){
            nb = nb*2;
        }
        for(int t=0;t<nb;t++){
            String binary = Integer.toBinaryString(t);

            int s = binary.length();

            String z = "";

            for(int i=0;i<5-s;i++){
                z += "0";
            }
            binary = z + binary;
            
            liste.add(new Piece(binary));
        }
    }
    public Piece[][] getPlateau(){
        return plateau;
    }
            
    /* 
    Méthodes permettant de vérifier l'alignement de pièces sur le plateau. 
    On vérifiera d'abord les alignements standards(lignes, colonnes et
    diagonales) avant de vérifier les formes. 
     */
    
    // VERIF (valable pour 3×3 et 5×5 seulement !) :
    public boolean verifFig(int taille, int x, int y){
        for(int i=taille-1 ; i>=0 ; i--){
            int cpt = 1;
            char cara = plateau[x][y].getISBN().charAt(i);
            String coo = convert(x, y);
            ArrayList<String> annuaire = new ArrayList<String>();
            annuaire.add(coo);
            
            cpt += boucle(annuaire, x, y, cara, i);
            
            if(cpt >= 5){
                return true;
            }
        }
        return false;
    }
    /*
      Méthode permettant de reboucler la vérification d'un alignement sur les 
      3 différentes grilles.
    */
    public int boucle(ArrayList annuaire, int x, int y, char cara, int n){
        int cpt = 0;
        if(ajout(annuaire, x+1, y, cara, n)){
            cpt += 1 + boucle(annuaire, x+1, y, cara, n);
        }
        if(ajout(annuaire, x, y+1, cara, n)){
            cpt += 1 + boucle(annuaire, x, y+1, cara, n);
        }
        if(ajout(annuaire, x-1, y, cara, n)){
            cpt += 1 + boucle(annuaire, x-1, y, cara, n);
        }
        if(ajout(annuaire, x, y-1, cara, n)){
            cpt += 1 + boucle(annuaire, x, y-1, cara, n);
        }
        return cpt;
    }
    
    
    //Méthode ajoutant les coordonnées de la case étudiée dans la liste si...
    
    public boolean ajout(ArrayList annuaire, int x, int y, char cara, int n){
        if(plateau[x][y].getISBN().charAt(n) == cara){
            String coo = convert(x, y);
            if(!annuaire.contains(coo)){
            annuaire.add(coo);
            return true;
            }
        }
        return false;
    }
    
    //Méthode convertissant int → String pour plus de simplicité
    
    public String convert(int x, int y){
        String u = "" + x;
        String v = "" + y;
        return u + v;
    }
    
    // Méthode vérifiant si une case du plateau n'est pas occupée
    public Piece Case_Libre(int x, int y) {
        x = 0;
        y = 0;
        return plateau[x][y] = null;
    }
    
    
    //Méthode de sauvegarde. Gestion d'erreur à ajouter ! 
    public void Sauvegarde(String pseudo_J1,String pseudo_J2, 
                           Piece [][] plateau) throws IOException{
    
        try{
            FileWriter writer = new FileWriter("sauvegarde_quarto.txt");
        
        FileWriter fich = new FileWriter(FichierQuarto);
        fich.write(pseudo_J1 + System.lineSeparator()
              + pseudo_J2 + System.lineSeparator());
        fich.write(taille + System.lineSeparator());
        
        for(int y = 0;y<taille;y++){
            for(int x = 0; x<taille;x++){
                if(Case_Libre(y,x)!= null){
                    fich.write(plateau[y][x].getISBN());   
                }
                else{
                    fich.write("null");
                }
            }
        }
        } catch(IOException ex){
            System.out.println("Le fichier n'a pas pu être chargé");
        }
    }
    /*OLD
    
        /*ArrayList<Piece> PI_dispo = new ArrayList<>();
                
        for(int b = 0; b<8;b++){
            String bin = Integer.toBinaryString(b);
            PI_dispo.add(new Piece(bin));
            
        }
        for(int b = 0; b<16;b++){
            String bin = Integer.toBinaryString(b);
            PI_dispo.add(new Piece(bin));
            
        }
        for(int b = 0; b<32;b++){
            String bin = Integer.toBinaryString(b);
            PI_dispo.add(new Piece(bin));    
        }      
    }
    
    */
/*
    //Getters
    public Piece[][] getPlateau() {
        return plateau;
    }

    public int gettaille() {
        return taille;
    }

    public ArrayList getliste() {
        return liste;
    }

    
    Méthode où sont stockées l'ensemble des différentes pièces selon
    les plateaux
    
    public List Banque() {

        System.out.println("Vous avez choisi un plateau de taille " + gettaille() + "par" + gettaille() + "\n"
                + "Voici donc l'ensemble des pièces disponibles : ");

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
                        for (String consistance : Arrays.asList("pleine", "creuse")) {
                            PI_dispo.add(new Piece(haute, couleur, forme, consistance));
                        }
                    }
                }
            }
        } else {
            for (boolean haute : Arrays.asList(true, false)) {
                for (String couleur : Arrays.asList("claire", "foncée")) {
                    for (String forme : Arrays.asList("ronde", "carrée")) {
                        for (String consistance : Arrays.asList("pleine", "creuse")) {
                            for (String matiere : Arrays.asList("bois", "marbre")) {
                                PI_dispo.add(new Piece(haute, couleur, forme, consistance, matiere));
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
    
    public Object Choix_Piece(Joueur joueur , int choix) {

        Scanner Sc = new Scanner(System.in);
        String choix_J; //Piece Joker
        int choix_p;
        Piece piece = null; // Piece conervée
        Piece joker = null;
        System.out.println(joueur + ", vous allez devoir une pièce");

           Piece Joker
           Si le plateau est 3*3, on introduit alors une pièce Joker neutre qui
           ne s'associe avec aucune pièce. 
        
        if (gettaille() == 3) {
            System.out.println("Souhaitez-vous utiliser la pièce Joker 0/N ?");
            choix_J = Sc.nextLine();
            while (!choix_J.equals("O") || !choix_J.equals("N")) {
                System.out.println("Je n'ai pas bien compris : \n"
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
                    System.out.println("ERREUR: Il faut rentrer un numéro.");
                    choix_p = Sc.nextInt();
                    return choix_p;
                }
            }
        }
        return piece;
    }
   */
    /*
    public boolean Verif_alignements(int taille, Piece[][] plateau, Piece piece){

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
                if (plateau[i][j].getconsistance().equals(plateau[i][j + 1].getconsistance())) {
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
*/
    /*
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
                if (plateau[a][b].getconsistance().equals(plateau[a + 1][b].getconsistance())) {
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
*/
    /*
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
                if (plateau[p][q].getconsistance().equals(plateau[p + 1][q + 1].getconsistance())) {
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
*/
    /*
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
                if (plateau[m][n].getconsistance().equals(plateau[m - 1][n + 1].getconsistance())) {
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
*/
    /*
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
                if (plateau[r][s].getconsistance().equals(plateau[r][s + 1].getconsistance())) {
                    cpt += 1;
                    r++;
                    if (plateau[r - 1][s].getconsistance().equals(plateau[r][s].getconsistance())) {
                        cpt += 1;
                        s++;
                        if (plateau[r - 1][s - 1].getconsistance().equals(plateau[r][s].getconsistance())) {
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
        
        return cpt >= taille;
    }
    */
}
