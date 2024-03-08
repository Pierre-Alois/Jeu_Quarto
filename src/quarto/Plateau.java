/*
Projet Java - Jeu Quarto
BERTIN Pierre-Aloïs - CALMET Pierre - SAID Gabriel
*/
package quarto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;
import java.util.Scanner;

public class Plateau {

    // Attributs
    private final int taille;
    private Piece[][] plateau;
    private ArrayList<Piece> liste;
    
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
            String binaire = Integer.toBinaryString(t);

            int s = binaire.length();

            String z = "";

            for(int i=0;i<5-s;i++){
                z += "0";
            }
            binaire = z + binaire;
            
            liste.add(new Piece(binaire));
        }
        if(taille==3){
            liste.add(new Piece("xxxxx"));
        }
        this.liste = new ArrayList<Piece>();
        this.liste.addAll(liste);
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
            if(caseLibre(taille-1, 0)){
                break;
            }
            int cpt = 1;
            String cara = "" + plateau[taille-1][0].getISBN().charAt(i);
            for(int j=1;j<taille;j++){
                if(caseLibre(taille-1-j, j)){
                    return false;
                }
                String test = "" + plateau[taille-1-j][j].getISBN().charAt(i);
                if(!test.equals(cara)){
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
            if(caseLibre(0,0)){
                break;
            }
            int cpt = 1;
            String cara = "" + plateau[0][0].getISBN().charAt(i);
            for(int j=1;j<taille;j++){
                if(caseLibre(j, j)){
                    return false;
                }
                String test = "" + plateau[j][j].getISBN().charAt(i);
                if(!test.equals(cara)){
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
        for(int i=4 ; i>=5-taille ; i--){
            int cpt = 1;
            String cara = "" + plateau[x][y].getISBN().charAt(i);
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
    public int boucle(ArrayList annuaire, int x, int y, String cara, int n){
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
    public boolean ajout(ArrayList annuaire, int x, int y, String cara, int n){
        if(caseLibre(x,y)){
            return false;
        }
        String test = "" + plateau[x][y].getISBN().charAt(n);
        if(test.equals(cara)){
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
        for(int i=4 ; i>=1 ; i--){
            String cara = "" + plateau[x][y].getISBN().charAt(i);
            boolean bas = false, droite = false, haut = false, gauche = false;
    // Définition de bas, droite, haut et gauche correspondant aux cases autour du pion posé.
            if(x != 3 && !caseLibre(x+1, y)){
                String test = "" + plateau[x+1][y].getISBN().charAt(i);
                if(test.equals(cara)){
                    bas = true;
                }
            }
            if(y != 3 && !caseLibre(x, y+1)){
                String test = "" + plateau[x][y+1].getISBN().charAt(i);
                if(test.equals(cara)){
                    droite = true;
                }
            }
            if(x != 0 && !caseLibre(x-1, y)){
                String test = "" + plateau[x-1][y].getISBN().charAt(i);
                if(test.equals(cara)){
                    haut = true;
                }
            }
            if(y != 0 && !caseLibre(x, y-1)){
                String test = "" + plateau[x][y-1].getISBN().charAt(i);
                if(test.equals(cara)){
                    gauche = true;
                }
            }
    // Vérification des carrés en fonction de bas, droite, haut et gauche.
            if(bas && droite && !caseLibre(x+1, y+1)){
                String test = "" + plateau[x+1][y+1].getISBN().charAt(i);
                if(test.equals(cara)){
                    return true;
                }
            }
            if(droite && haut && !caseLibre(x-1, y+1)){
                String test = "" + plateau[x-1][y+1].getISBN().charAt(i);
                if(test.equals(cara)){
                    return true;
                }
            }
            if(haut && gauche && !caseLibre(x-1, y-1)){
                String test = "" + plateau[x-1][y-1].getISBN().charAt(i);
                if(test.equals(cara)){
                    return true;
                }
            }
            if(gauche && bas && !caseLibre(x+1, y-1)){
                String test = "" + plateau[x+1][y-1].getISBN().charAt(i);
                if(test.equals(cara)){
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
            if(caseLibre(x, 0)){
                break;
            }
            int cpt = 1;
            String cara = "" + plateau[x][0].getISBN().charAt(i);
            for(int j=1;j<4;j++){
                if(caseLibre(x, j)){
                    return false;
                }
                String test = "" + plateau[x][j].getISBN().charAt(i);
                if(!test.equals(cara)){
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
            if(caseLibre(0,y)){
                break;
            }
            int cpt = 1;
            String cara = "" + plateau[0][y].getISBN().charAt(i);
            for(int j=1;j<4;j++){
                if(caseLibre(j, y)){
                    return false;
                }
                String test = "" + plateau[j][y].getISBN().charAt(i);
                if(!test.equals(cara)){
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
    
    
    
    // Méthode pour choisir son PION.
    public Piece choixPiece(){
        String c, f, t, h = "", s = "", z = "";
        String str = "";
        boolean stop = false;
        while(true){
            System.out.println("""
                               Quelle couleur ?
                               0 = blanc ; 1 = noir ; x = immeuble""");
            //Scanner
            c = scan();
            System.out.println("""
                               Quelle forme ?
                               0 = carré ; 1 = rond ; x = immeuble""");
            //Scanner
            f = scan();
            System.out.println("""
                               Quel intérieur ?
                               0 = plein ; 1 = troué ; x = immeuble""");
            //Scanner
            t = scan();
            if(taille>=4){
                System.out.println("""
                                   Quelle taille ?
                                   0 = grand ; 1 = petit""");
                //Scanner
                h = scan();
                if(taille>4){
                    System.out.println("""
                                       Quelle coupe ?
                                       0 = entier ; 1 = tranché""");
                    //Scanner
                    s = scan();
                }
            }
            if(taille==3){
                if(c.equals("x") && f.equals("x") && t.equals("x")){
                    z = "xx";
                }else{
                    z = "00";
                }
            }else if(taille==4){
                z = "0";
            }
            str = z + s + h + t + f + c;
            ListIterator<Piece> ite = liste.listIterator();
            while(ite.hasNext()){
                if(ite.next().getISBN().equals(str)){
                    ite.remove();
                    stop = true;
                    break;
                }
            }
            if(stop){
                break;
            }
            System.out.println("Cette pièce n'est pas disponible.");
        }
        Piece pion = new Piece(str);
        return pion;
    }
    
    // Méthode pour poser son PION.
    public String position(Piece pion){
        int x, y;
        String coo, u, v;
        while(true){
            System.out.println("""
                               Veuillez choisir la case où poser votre pion.
                               {Exemples : 11 ; 45 ; 33; 52 ...}""");
            //Scanner
            coo = scan();
            if(coo.length() != 2){
                System.out.println("Rentrez seulement DEUX chiffres.");
                continue;
            }
            if(!Character.isDigit(coo.charAt((0))) || !Character.isDigit(coo.charAt(1))){
                System.out.println("Rentrez seulement deux CHIFFRES.");
                continue;
            }
            u = "" + coo.charAt(0);
            v = "" + coo.charAt(1);
            x = Integer.valueOf(u);
            y = Integer.valueOf(v);
                        
            x--;
            y--;
            
            if(x >= taille || y >= taille){
                System.out.println("Case inexistante.");
                continue;
            }
            
            if(caseLibre(x, y)){
                break;
            }
            System.out.println("Case déjà occupée.");
        }
        plateau[x][y] = pion;
        coo = "" + x + y;
        return coo;
    }
    
    // Méthode vérifiant si une case du plateau n'est pas occupée.
    public boolean caseLibre(int x, int y) {
        return plateau[x][y] == null;
    }
    
    //Scanner
    public String scan(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    
    public String ordiFacile(){
        Random alea = new Random();
        Piece pion = liste.remove(alea.nextInt(0, liste.size()));
        ArrayList<String> libre = new ArrayList<String>();
        for(int i=0;i<taille;i++){
            for(int j=0;j<taille;j++){
                if(caseLibre(i, j)){
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
    
    public void afficher(){
        for(int i=0;i<taille;i++){
            for(int j=0;j<taille;j++){
                System.out.print(plateau[i][j] + " | ");
            }
            System.out.println("\n");
        }
    }
    
    //Méthode de sauvegarde permettant la reprise d'une partie précédement sauvegardée. 
    //Gestion d'erreur à ajouter ! 
    
    public void sauvegarde(String pseudo_J1,String pseudo_J2) throws IOException{
    
        try{
        FileWriter fich = new FileWriter(FichierQuarto);
        fich.write(pseudo_J1 + System.lineSeparator() + pseudo_J2 + System.lineSeparator());
        fich.write(taille + System.lineSeparator());
        
        for(int x = 0;x<taille;x++){
            for(int y = 0; y<taille;y++){
                if(!caseLibre(x,y)){
                    fich.write(plateau[x][y].getISBN());   
                }
                else{
                    fich.write("null");
                }
            }
        } 
        fich.close();              // ferme le fichier
        } catch(IOException ex){
            System.out.println("Le fichier n'a pas pu être chargé");
        }
    }
    
    public Object[][] charger() throws FileNotFoundException, IOException{
        
        String ligne ;                           // Lire une ligne du fichier
        String choix;
        Scanner sc = new Scanner(System.in);
        Object[][] p = new Object[0][8];
        try (BufferedReader br = new BufferedReader(new FileReader(FichierQuarto)))
        {
            System.out.println("Une partie a été sauvegardée. "
                               + "Voulez-vous la reprendre (O/N) ? ");
            choix = sc.nextLine();
            while(!choix.equals("O")|| !choix.equals("N")){
                System.out.println("Une partie a été sauvegardée. "
           + "Voulez-vous la reprendre (O/N) ? ");
                choix = sc.nextLine();
            }
            switch (choix){
                
                case "O" :
                    while((ligne = br.readLine()) != null){
                System.out.println(ligne);        // On affiche la ligne
                ligne = br.readLine();              // On lit la ligne suivante
                }
                br.close();
                break;
                
                case "N":
          System.out.println("Vous avez abandonnée votre partie précédente."
                             + " Voulez-vous recommencer une partie ? (O/N)");
                choix = sc.nextLine();
                while(!choix.equals("O")|| !choix.equals("N")){
                    System.out.println("Vous avez abandonnée votre partie précédente."
                             + " Voulez-vous recommencer une partie ? (O/N)");
                    choix = sc.nextLine();   
                }
                switch (choix){
                    
                    case "O":
                        // On créer une nouvelle partie
                        break;
                    
                    case "N":
              System.out.println("A très vite pour de nouvelle aventures :)");
                        break;       
                }
                break;          
            }   
        } catch(IOException ex){
            ex.printStackTrace();           
        }
    return p;   
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