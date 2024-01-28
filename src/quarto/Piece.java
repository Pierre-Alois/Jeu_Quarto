
package quarto;

public class Piece {

    //Attributs
    
    private boolean haute;
    private String couleur;
    private String forme;
    private boolean creuse; 
    
    // Constructeu
    
    public Piece(boolean haute, String couleur , boolean creuse){
        
        this.haute = haute;
        this.couleur = couleur; 
        this.forme = forme;
        this.creuse = creuse; 
        
    }
    //Getters
    
    public boolean gettaille(){
        
        return haute;
    }
    
    public String getcolor(){
        
        return couleur;
    }
    
    public String getforme(){
        
        return forme;
    }
    
    public boolean getcreuse(){
        
        return creuse;
    }
    
    //Méthode permettant d'afficher les pièces sur le plateau.
    public void Afficher_Piece(){
    
    }
    
    
       
}
