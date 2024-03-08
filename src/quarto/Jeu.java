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
import java.util.Random;
import java.util.Scanner;

public class Jeu{
    
    private Joueur j1;
    private Joueur j2;
    private Plateau p;
    
    private static final String FichierQuarto = "FichierQuarto.txt";

    public Jeu() throws IOException{
        
        int qui, partie = charger();
        
        if(partie == 0){
            String p1, p2, taille;
            int dim;

            while(true){
                System.out.println("Saisissez le pseudonyme du joueur 1 :");
                p1 = scan();
                if(!p1.isBlank()){
                    break;
                }
            }
            this.j1 = new Joueur(p1);

            System.out.println("Saisissez le pseudonyme du joueur 2 ou appuyez sur 'Entrée' pour jouer contre l'ordinateur :");
            p2 = scan();
            if(p2.isBlank()){
                this.j2 = new Ordi("Y,6c3L=30Fln}k");
            }else{
                this.j2 = new Joueur(p2);
            }

            while(true){
                System.out.println("Sur quelle taille de plateau voulez-vous jouer ?");
                taille = scan();
                if(taille.length() == 1 && Character.isDigit(taille.charAt(0))){
                    dim = Integer.valueOf(taille);
                    if(dim >= 3 && dim <= 5){
                        break;
                    }
                }
            }
            this.p = new Plateau(dim);
            
            qui = choixJoueur();
        }else{
            qui = partie;
        }
        tourDeJeu(qui);
    }
    
    public void tourDeJeu(int qui) throws IOException{
        
        int x, y;
        String coo;
        
        while(true){
            
            if(qui == 1){
                System.out.println("C'est à " + j1 + " de jouer.");
            }else{
                System.out.println("C'est à " + j2 + " de joueur.");
            }
            
            if(qui == -1 && j2.getClass().getSimpleName().equals("Ordi")){
                coo = p.ordiFacile();
            }else{
                coo = p.position(p.choixPiece());
            }
            
            p.afficher();
            
            x = Integer.valueOf("" + coo.charAt(0));
            y = Integer.valueOf("" + coo.charAt(1));
            
            if(verifTot(x, y)){
                break;
            }
            
            qui = qui * (-1);
            
            System.out.println("Tapez 'S' puis 'Entrée' pour sauvegarder, sinon tapez juste 'Entrée'.");
            String sauv = scan();
            if(sauv.toUpperCase().equals("S")){
                sauvegarde(qui);
            }
        }
        if(qui == 1){
                System.out.println(j1 + " a gagné !");
            }else{
                System.out.println(j2 + " a gagné !");
            }
    }
    
    
    
    public boolean verifTot(int x, int y){
        
        if(x==y && p.diag315()){
            return true;
        }
        if(p.gettaille()-1-x == y && p.diag45()){
            return true;
        }
        
        if(p.gettaille() != 4 && p.verifFig(x, y)){
            return true;
        }
        
        if(p.gettaille() == 4){
            if(p.carre(x, y)){
                return true;
            }
            if(p.vertical(y)){
                return true;
            }
            if(p.horizontal(x)){
                return true;
            }
        }
        return false;
    }
    
    public String scan(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    
    /*
    Méthode permettant le tirage au sort d'un joueur.
    Les chiffres 1 et 2 sont choisis au hasard. Si c'est 1 alors le joueur 1
    commence. Sinon c'est le joueur 2 
    Le 1er joueur devra ensuite choisir une pièce.
    */
    public int choixJoueur(){
        Random alea = new Random();
        int n  = alea.nextInt(0, 2);
        return 1-2*n;
    }
    
    public void sauvegarde(int qui) throws IOException{
        try{
            FileWriter fich = new FileWriter(FichierQuarto);
            fich.write(j1 + System.lineSeparator() + j2.getpseudo() + System.lineSeparator());
            fich.write(qui + System.lineSeparator());
            fich.write(p.gettaille() + System.lineSeparator());

            for(int x = 0;x<p.gettaille();x++){
                for(int y = 0; y<p.gettaille();y++){
                    if(!p.caseLibre(x,y)){
                        fich.write(p.getplateau()[x][y].getISBN() + System.lineSeparator());
                    }
                    else{
                        fich.write("null" + System.lineSeparator());
                    }
                }
            } 
            fich.close();              // ferme le fichier
        } catch(IOException ex){
            System.out.println("Le fichier n'a pas pu être sauvegarder.");
        }
    }
    
    public int charger() throws FileNotFoundException, IOException{
        
        String ligne, choix1;
        int qui = 0, taille;
        
        Object[] p = new Object[8];
        try {
            FileReader fich = new FileReader(FichierQuarto);
            BufferedReader br = new BufferedReader(fich);
            
            ligne = br.readLine();
            if(ligne != null){
                while(true){
                    System.out.println("Une partie a été sauvegardée. Voulez-vous la reprendre (O/N) ?");
                    choix1 = scan();
                    if(choix1.equals("O") || choix1.equals("N")){
                        break;
                    }
                }
                
                if(choix1.equals("O")){
                    this.j1 = new Joueur(ligne);
                    ligne = br.readLine();
                    if(ligne.equals("Y,6c3L=30Fln}k")){
                        this.j2 = new Ordi(ligne);
                    }else{
                        this.j2 = new Joueur(ligne);
                    }
                    qui = Integer.valueOf(br.readLine());
                    taille = Integer.valueOf(br.readLine());
                    
                    this.p = new Plateau(taille);
                    
                    for(int x = 0;x<taille;x++){
                        for(int y = 0; y<taille;y++){
                            ligne = br.readLine();
                            if(ligne.equals("null")){
                                continue;
                            }
                            this.p.setplateau(x, y, ligne);
                        }
                    }
                }
            }
            fich.close();
        } catch(IOException ex){
            System.out.println("Pas de fichier de sauvegarde.");
        }
        return qui;
    }
}