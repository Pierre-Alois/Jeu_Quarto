
package quarto;

public class Piece {

    //Attributs
    
    private boolean haute;
    private String concistance;
    private String matiere;
    private String couleur;
    private String forme;
    private boolean creuse; 
    
    // Constructeu
    
    public Piece(boolean haute,String concistance, String matiere , String couleur, String forme){
        
        this.haute = haute;
        this.concistance = concistance;
        this.matiere = matiere;
        this.couleur = couleur; 
        this.forme = forme;
         
    }
    //Getters
    
    public boolean gettaille(){
        
        return haute;
    }
    
    public String getconcistance(){
        
        return concistance;
    }
    
    public String getMadeOf(){
        
        return matiere;
    }
    
    public String getcolor(){
        
        return couleur;
    }
    
    public String getforme(){
        
        return forme;
    }
    
    //Setters
    
    public void settaille(){
        
        this.haute = haute;
    }
    
    public void setconcistance(){
        
        this.concistance = concistance;
    }
    
    public void setMadeOf(){
        
        this.matiere = matiere;
    }
    
    public void setcolor(){
        
        this.couleur = couleur; 
    }
    
    public void setforme(){
        
        this.forme = forme; 
    }
    
    //Méthode permettant d'afficher les pièces sur le plateau.
    public void Afficher_Piece(){
        
    System.out.println("Voici les caractéristiques de la pièce : \n" 
     + haute + "," + concistance + "," + matiere + "," + couleur + "," + forme);
              
    }
    
      
}
