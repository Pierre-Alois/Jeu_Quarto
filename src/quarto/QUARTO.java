/*
Projet Java - Jeu Quarto
BERTIN Pierre-Aloïs - CALMET Pierre - SAID Gabriel
*/
package quarto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class QUARTO {

    public static void main(String[] args) throws IOException {
        
        /*
        Class Main : 
        Appeler les méthodes pour vérifier si ça marche. 
        
        Classe Joueur : 
        pseudo
        ordinateur → sous-class de joueur
        
        Class Piece : 
        5 caractéristiques
        ajout d'un pion joker.
        
        Dans la classe Jeu :
           plateau , taillepl, listePi, 2 joueurs
           les 2 joueurs
           saisir les infos(taille...)
           créer une nouvelle partie
           tirer au sort le 1er joueur qui choisit 
           faire choisir une pièce
           faire poser une pièce
           vérifier si une ligne est formée
           vérifier si la partie est terminée
           faire un tour de jeu
           interrompre partie
           reprendre partie
        
        public void choix_Piece (int choix){
            ...
        }
        → Prgrm principal(main){
        Jeu j = new Jeu()
        Scanner sc = new Scanner();
        sout("Choisissez un numéro de pièce : )
        int choix = sc.nextInt()
        j.choix_Piece(choix)
        
        OU (après sout, et après avoir afficher toutes les pièces)
        
        j.choix_Piece(2) par exemple. 
        
        
        }
        */
        
        // Test
        /*int l = 4;
        Plateau p = new Plateau(l);
        int x, y;
        
        System.out.println(p.getClass().getSimpleName());
        
        while(true){
            String coo = p.position(p.choixPiece());
            
            x = Integer.valueOf("" + coo.charAt(0));
            y = Integer.valueOf("" + coo.charAt(1));
            
            if(l != 4 && p.verifFig(x, y)){
                break;
            }
            if(x==y && p.diag315()){
                break;
            }
            if(l-1-x == y && p.diag45()){
                break;
            }
            if(l == 4 && p.carre(x, y)){
                break;
            }
            if(l == 4 && p.vertical(y)){
                break;
            }
            if(l == 4 && p.horizontal(x)){
                break;
            }
            p.afficher();
        }
        System.out.println("FINIE");
        Scanner sc = new Scanner(System.in);
        String q = sc.nextLine();
        System.out.println(q.isBlank());*/
        
        Jeu j = new Jeu();
        j.tourDeJeu();
    }
}
