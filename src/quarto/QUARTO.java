/*
Projet Java - Jeu Quarto
BERTIN Pierre-Aloïs - CALMET Pierre - SAID Gabriel
*/
package quarto;

import java.io.IOException;
import java.util.ArrayList;
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
          
        
        //System.out.println("Hello world");
        
        //public void jouer(String joueur1,String joueur2){
    
        //On demande les pseudos des 2 joueurs
        /*String joueur1 = JOptionPane.showInputDialog(" Joueur 1, write your pseudo : ");
        JOptionPane.showMessageDialog(null, "Vous vous appelez donc : " + joueur1);
        String joueur2 = JOptionPane.showInputDialog(" Joueur 2, write your pseudo : ");
        JOptionPane.showMessageDialog(null, "Vous vous appelez donc : " + joueur2);*/
    
        //Tests
        
        Joueur J1 = new Joueur("Didier");
        Joueur J2 = new Joueur("PA");
        
        ArrayList<Piece> liste_P = new ArrayList<>();
        liste_P.add(new Piece("000"));
        liste_P.add(new Piece("11111"));
        liste_P.add(new Piece("1001"));
        
        Piece P_J1 = J1.Banque(liste_P);
        Piece P_J2 = J2.Banque(liste_P);
        
        Plateau plateau = new Plateau(3);
        
        plateau.Sauvegarde(J1.getpseudo(), J2.getpseudo(),plateau.getPlateau());
        
    }
}
