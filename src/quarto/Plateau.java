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
            boolean bas = false, droite = false, haut = false, gauche = false;
    // Définition de bas, droite, haut et gauche correspondant aux cases autour du pion posé.
            if(x != 3){
                if(plateau[x+1][y].getISBN().charAt(i) == cara){
                    bas = true;
                }
            }
            if(y != 3){
                if(plateau[x][y+1].getISBN().charAt(i) == cara){
                    droite = true;
                }
            }
            if(x != 0){
                if(plateau[x-1][y].getISBN().charAt(i) == cara){
                    haut = true;
                }
            }
            if(y != 0){
                if(plateau[x][y-1].getISBN().charAt(i) == cara){
                    gauche = true;
                }
            }
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
    
    
    
    // Méthode pour choisir son PION.
    public Piece choixPiece(){
        String c, f, t, h = "", s = "", z = "";
        String str = "";
        while(true){
            System.out.println("Quelle couleur ?");
            //Scanner
            c = "?";
            System.out.println("Quelle forme ?");
            //Scanner
            f = "?";
            System.out.println("Quel intérieur ?");
            //Scanner
            t = "?";
            if(taille>=4){
                System.out.println("Quelle taille ?");
                //Scanner
                h = "?";
                if(taille>4){
                    System.out.println("Quelle coupe ?");
                    //Scanner
                    s = "?";
                }
            }
            if(taille==3){
                z += "00";
            }else if(taille==4){
                z += "0";
            }
            str = z + s + h + t + f + c;
            if(liste.contains(str)){
                break;
            }
            System.out.println("Cette pièce n'est pas disponible.");
        }
        
        Piece pion = new Piece(str);
        
        ListIterator<Piece> ite = liste.listIterator();
        while(ite.hasNext()){
            if(ite.next().getISBN().equals(str)){
                ite.remove();
            }
        }
        return pion;
    }
    
    // Méthode pour poser son PION.
    public void position(Piece pion){
        int x, y;
        while(true){
            System.out.println("Veuillez choisir la case où poser votre pion.");
            //Scanner
            String coo = "??";
            /*
            Valeur à rentrer manuellement, le scanner n'est pas utile pour l'instant
            puisque la case sera choisie plus tard grâce à l'interface graphique.
            */
            x = coo.charAt(0);
            y = coo.charAt(1);
            if(caseLibre(x, y)){
                break;
            }
        }
        plateau[x-1][y-1] = pion;
    }
    
    // Méthode vérifiant si une case du plateau n'est pas occupée.
    public boolean caseLibre(int x, int y) {
        return plateau[x][y] == null;
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
    

    //Méthode permettant de recommencer une nouvelle partie à zéro. 
    public void Recommencer_Partie(){   
    }
    
    public void depuisFichierCommandes() throws FileNotFoundException, IOException{
        FileReader fileC = new FileReader(FichierQuarto);        // ouvrir le fichier en lecture
        BufferedReader br = new BufferedReader(fileC);
        String numero = br.readLine();                                 // lire une ligne du fichier
        /*while(numero != null){
            String donnees = br.readLine();
            String[] info = donnees.split(" : ");
            String email = info[0];
            LocalDate emission = dateEcrite(info[1]);
            LocalDate livraison = dateEcrite(info[2]);
            float total = Float.valueOf(info[3]);
            String nombreLignes = br.readLine();
            int nbL = Integer.valueOf(nombreLignes);
            LigneCommande[] lignes = new LigneCommande[nbL];
            for (int i=0;i<nbL;i++){
                String ligne = br.readLine();
                String[] bon = ligne.split(" : ");
                String ref = bon[0];
                int nbExpl = Integer.valueOf(bon[1]);
                Equipement eq = recherche(ref);
                LigneCommande lc = new LigneCommande(nbExpl, eq);
                lignes[i] = lc;
            }
            Commande com = new Commande(numero, email, emission, livraison, lignes);
            lstCmd[nbCmd] = com;
            nbCmd++;
            numero = br.readLine();
        }
        classement();                   // On met les éléments dans l'ordre.
        fich.close();                   // fermer le fichier
        */
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