/*
Projet Java - Jeu Quarto
BERTIN Pierre-Aloïs - CALMET Pierre - SAID Gabriel
*/
package quarto;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
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
        ArrayList<Piece> liste = new ArrayList<Piece>();
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
        if(taille==3){
            liste.add(new Piece("xxxxx"));
        }
    }
    
    //Getters
    public Piece[][] getplateau(){
        return plateau;
    }

    public int gettaille() {
        return taille;
    }

    public ArrayList getliste() {
        return liste;
    }
            
    
    
    // VÉRIF
    
    // Valable pour tout :
    
    /*
    Méthodes pour vérifier un alignement dans les diagonales qui fonctionnent
    pour les 3 grilles.
    Il faut juste s'assurer que x == y pour diag315()
    et que taille-1-x == y pour diag45().
    */
    // Diagonale bas-gauche --> haut-droite
    public boolean diag45(){
        for(int i=taille-1 ; i>=0 ; i--){
            int cpt = 0;
            char cara = plateau[taille-1][0].getISBN().charAt(i);
            for(int j=1;j<taille;j++){
                if(plateau[taille-1-j][j].getISBN().charAt(i)!= cara){
                    break;
                }
                cpt++;
            }
            if(cpt == taille){
                return true;
            }
        }
        return false;
    }
    
    // Diagonale haut-gauche -->  bas-droite
    public boolean diag315(){
        for(int i=taille-1 ; i>=0 ; i--){
            int cpt = 1;
            char cara = plateau[0][0].getISBN().charAt(i);
            for(int j=1;j<taille;j++){
                if(plateau[j][j].getISBN().charAt(i)!= cara){
                    break;
                }
                cpt++;
            }
            if(cpt == taille){
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
        for(int i=taille-1 ; i>=0 ; i--){
            int cpt = 1;
            char cara = plateau[x][y].getISBN().charAt(i);
            String coo = convert(x, y);
            ArrayList<String> annuaire = new ArrayList<String>();
            annuaire.add(coo);
            
            cpt += boucle(annuaire, x, y, cara, i);
            
            if(cpt >= taille){
                return true;
            }
        }
        return false;
    }
    
    /*
    Méthode récursive qui vérifie si une piéce l adjacente à la précédente
    possède la caractéristique de référence.
    */
    public int boucle(ArrayList annuaire, int x, int y, char cara, int n){
        int cpt = 0;
        if(x != taille-1){
            if(ajout(annuaire, x+1, y, cara, n)){
                cpt += 1 + boucle(annuaire, x+1, y, cara, n);
            }
        }
        if(y != taille-1){
            if(ajout(annuaire, x, y+1, cara, n)){
                cpt += 1 + boucle(annuaire, x, y+1, cara, n);
            }
        }
        if(x != 0){
            if(ajout(annuaire, x-1, y, cara, n)){
                cpt += 1 + boucle(annuaire, x-1, y, cara, n);
            }
        }
        if(y != 0){
            if(ajout(annuaire, x, y-1, cara, n)){
                cpt += 1 + boucle(annuaire, x, y-1, cara, n);
            }
        }
        return cpt;
    }
    
    /*
    Méthode ajoutant les coordonnées de la case étudiée dans la liste
    si un pion y est présent avec la même carctéristique que le premier.
    */
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
    
    /*
    Méthode convertissant les deux entiers correspondant à des coordonnées
    en une chaîne.
    */
    public String convert(int x, int y){
        String u = "" + x;
        String v = "" + y;
        return u + v;
    }
    
    // Valable pour 4×4 seulement :
    
    /*
    Méthode pour vérifier un carré en 4×4.
    */
    public boolean carre(int x, int y){
        for(int i=3 ; i>=0 ; i--){
            char cara = plateau[x][y].getISBN().charAt(i);
            boolean bas, droite, haut, gauche;
    // Définition de bas, droite, haut et gauche correspondant aux cases autour du pion posé.
            if(x != 3){
                if(plateau[x+1][y].getISBN().charAt(i) == cara){
                    bas = true;
                }
            }
            bas = false;
            if(y != 3){
                if(plateau[x][y+1].getISBN().charAt(i) == cara){
                    droite = true;
                }
            }
            droite = false;
            if(x != 0){
                if(plateau[x-1][y].getISBN().charAt(i) == cara){
                    haut = true;
                }
            }
            haut = false;
            if(y != 0){
                if(plateau[x][y-1].getISBN().charAt(i) == cara){
                    gauche = true;
                }
            }
            gauche = false;
    // Vérification des carrés en fonction de bas, droite, haut et gauche.
            if(bas && droite){
                if(plateau[x+1][y+1].getISBN().charAt(i) == cara){
                    return true;
                }
            }
            if(droite && haut){
                if(plateau[x-1][y+1].getISBN().charAt(i) == cara){
                    return true;
                }
            }
            if(haut && gauche){
                if(plateau[x-1][y-1].getISBN().charAt(i) == cara){
                    return true;
                }
            }
            if(gauche && bas){
                if(plateau[x+1][y-1].getISBN().charAt(i) == cara){
                    return true;
                }
            }
        }
        return false;
    }
    
    /*
    Méthode pour vérifier un alignement horizontal.
    */
    public boolean horizontal(int x){
        for(int i=3 ; i>=0 ; i--){
            int cpt = 1;
            char cara = plateau[x][0].getISBN().charAt(i);
            for(int j=1;j<4;j++){
                if(plateau[x][j].getISBN().charAt(i)!= cara){
                    break;
                }
                cpt++;
            }
            if(cpt == 4){
                return true;
            }
        }
        return false;
    }
    
    /*
    Méthode pour vérifier un alignement vertical.
    */
    public boolean vertical(int y){
        for(int i=3 ; i>=0 ; i--){
            int cpt = 1;
            char cara = plateau[0][y].getISBN().charAt(i);
            for(int j=1;j<4;j++){
                if(plateau[j][y].getISBN().charAt(i)!= cara){
                    break;
                }
                cpt++;
            }
            if(cpt == 4){
                return true;
            }
        }
        return false;
    }
    
    // FIN VÉRIF
    
    // Méthode vérifiant si une case du plateau n'est pas occupée.
    public boolean caseLibre(int x, int y) {
        return plateau[x][y] == null;
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
                if(!caseLibre(y,x)){
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
}
/*
    USINE À GAZ
    
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
    */