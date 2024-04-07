/*
Projet Java - Jeu Quarto
BERTIN Pierre-Aloïs - CALMET Pierre - SAID Gabriel
*/
package quarto;

import java.util.Random;
import java.util.Scanner;

public class Jeu{
    
    Joueur j1;
    Joueur j2;
    Plateau p;

    public Jeu(){
        
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
            this.j2 = new Ordi("Ordi débutant");
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
    }
    
    public void tourDeJeu(){
        
        int x, y, qui;
        String coo;
        
        qui = choixJoueur();
        
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
     Méthode permettant le choix aléatoire du joueur actuel. 
     -1 → le joueur 1 joue
      1 → le joueur 2 joue
    */
    public int choixJoueur(){
        Random alea = new Random();
        int n  = alea.nextInt(0, 2);
        return 1-2*n;
    }
}
