/*
Projet Java - Jeu Quarto
BERTIN Pierre-Aloïs - CALMET Pierre - SAID Gabriel
 */
package fiches; 
//FAcccueil est notre fiche principale et toutes nos fonctions passeront par celle-ci

import javax.swing.JOptionPane;

public class FAccueil extends javax.swing.JFrame {

    private final DInfos infos;
    private final DOrdi ordi;
    private final FJeu jeu;
    
    private int taille;   //Variable désignant notre taille (Index de notre ComboBox : 0,1 et 2 et non la "taille de la grille")
    private String pseudoJ1;
    private String pseudoJ2;
    
    public FAccueil(){
        initComponents();
        infos = new DInfos(this,false); // FAccueil est le parent de DInfos
        ordi = new DOrdi(this, false);  // FAccueil est le parent de DOrdi
        jeu = new FJeu();                          // FAccueil est le parent de FJeu
    }
    
    private void importDonnees(){
        this.taille = infos.tailledelagrille(); // Récupération de la taille de la grille
        this.pseudoJ1 = infos.pseudonymes()[0]; // Récupération des pseudos
        this.pseudoJ2 = infos.pseudonymes()[1];
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bCommencer = new javax.swing.JButton();
        bReprendre = new javax.swing.JButton();
        lTitre = new javax.swing.JLabel();
        bQuitter = new javax.swing.JButton();
        bRègles = new javax.swing.JButton();
        bCredit = new javax.swing.JButton();
        bCookie = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Accueil");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        bCommencer.setBackground(new java.awt.Color(0, 204, 102));
        bCommencer.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        bCommencer.setForeground(new java.awt.Color(255, 255, 255));
        bCommencer.setText("Commencer Partie");
        bCommencer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCommencerActionPerformed(evt);
            }
        });

        bReprendre.setBackground(new java.awt.Color(0, 204, 255));
        bReprendre.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        bReprendre.setForeground(new java.awt.Color(255, 255, 255));
        bReprendre.setText("Reprendre Partie");
        bReprendre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bReprendreActionPerformed(evt);
            }
        });

        lTitre.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lTitre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTitre.setText("Quarto X Quarto");

        bQuitter.setBackground(new java.awt.Color(255, 51, 0));
        bQuitter.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        bQuitter.setForeground(new java.awt.Color(255, 255, 255));
        bQuitter.setText("Quitter");
        bQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bQuitterActionPerformed(evt);
            }
        });

        bRègles.setBackground(new java.awt.Color(255, 102, 255));
        bRègles.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        bRègles.setText("Règles de Jeu");
        bRègles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRèglesActionPerformed(evt);
            }
        });

        bCredit.setBackground(new java.awt.Color(185, 185, 185));
        bCredit.setFont(new java.awt.Font("Constantia", 3, 14)); // NOI18N
        bCredit.setForeground(new java.awt.Color(255, 255, 255));
        bCredit.setText("Crédits");
        bCredit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCreditActionPerformed(evt);
            }
        });

        bCookie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_jeu/téléchargement.jpeg"))); // NOI18N
        bCookie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCookieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(bRègles, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addComponent(lTitre)
                .addGap(292, 292, 292))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(bQuitter, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bCommencer)
                        .addGap(74, 74, 74)
                        .addComponent(bReprendre)
                        .addGap(187, 187, 187))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bCookie)
                        .addGap(322, 322, 322))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(lTitre))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(bRègles, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCommencer, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bReprendre, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(bCookie)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bQuitter, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCommencerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCommencerActionPerformed
        this.setVisible(false); //Nous rendons invisible FAcceuil
        infos.setVisible(true); //Nous rendons visible FInfos
    }//GEN-LAST:event_bCommencerActionPerformed

    private void bReprendreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bReprendreActionPerformed
        jeu.charger();
        this.setVisible(false);
    }//GEN-LAST:event_bReprendreActionPerformed

    private void bQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bQuitterActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bQuitterActionPerformed

    //Rappel des règles du jeu pour jouer dans de bonnes conditions
    private void bRèglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRèglesActionPerformed

        String msg = """
              Bienvenue cher(e) joueur(se) ☺,
                                   
              Voici l'emplacement où tu pourras retrouver les règles de jeu.
                                   
              Vous disposez d'une grille de taille 3x3, 4x4 ou 5x5 en fonction de votre choix.
              Le jeu se joue à 2 joueurs, si vous êtes seul pas de problème, on a pensé à tout : 
              vous pourrez jouer contre un ordinateur avec 2 niveaux de difficulté.
                                   
              Au début de la partie, un joueur est tiré au sort pour commencer la partie.
              Il choisit une des pièces puis la donne à son adversaire. L'adversaire devra alors la placer sur une des cases libres du plateau.
              Les rôles sont ensuite inversés et le jeu se poursuit.
                                   
              But du jeu : Aligner 3, 4 ou 5 pièces, en fonction de la taille de plateau choisie, avec au moins une caractérsique commune.
              → Horizontalement, verticalement, en diagonale, en carré ou autre forme avec les pions contiguës, soyez créatifs !
                                   
              Grille 3x3 : 9 pièces avec 3 caractéristiques 
              → La couleur : Noire ou blanche
              → La forme : Carrée ou Ronde 
              → Et/ou trouée 
              Attention il existe une pièce joker, disponible uniquement en 3x3, différente des autres.
                                   
              Grille 4x4 : 16 pièces avec 4 caractéristiques 
              → Nous ajoutons la taille : la pièce est petite ou grande 
                                   
               Grille 5x5 : 25 pièces avec 5 caractéristiques
              → Nous ajoutons ici la section : la pièce est soit entière soit entière soit tranchée
                                   
              Bon match , que le ou la meilleur(e) gagne et gare à l'ordinateur ;) !
              
              """;
                JOptionPane.showMessageDialog(this,msg); //Appparition d'une pop-up pour afficher les règles
    }//GEN-LAST:event_bRèglesActionPerformed

    private void bCreditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCreditActionPerformed
        String credit = """ 
                        Réalisé par Pierre Calmet, Pierre-Aloïs Bertin et Gabriel Said
                        Remerciement à toute l'équipe enseignante pour cette année d'apprentissage
                        Tous droits réservés © 
                             """;
        JOptionPane.showMessageDialog(this,credit);
    }//GEN-LAST:event_bCreditActionPerformed

    /*
    Cette méthode sera exécutée dès lors que l'on effectuera des actions de type
    "setVisible" sur cette fiche.
    */
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        if(infos.getQuitus()){      
            importDonnees();
            infos.resetQuitus();
            this.setVisible(false);
            if(infos.isSolo()){
                ordi.setVisible(true);
            }else {
                jeu.setTaille(taille);
                jeu.setPseudoJ1(pseudoJ1);
                jeu.setPseudoJ2(pseudoJ2);
                jeu.setVisible(true);
                this.setVisible(false);
            }
        }else if(infos.isSolo() && !ordi.retourCliqué()){
            jeu.setTaille(taille);
            jeu.setPseudoJ1(pseudoJ1);
            jeu.setPseudoJ2("Y,6c3L=30Fln}k");
            jeu.setVisible(true);
            this.setVisible(false);
        }else if(ordi.retourCliqué()){
            infos.resetSolo();
        }
    }//GEN-LAST:event_formComponentShown

    private void bCookieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCookieActionPerformed
       String cookie = "En appuyant sur ce bouton acceptez-vous les cookies présents sur notre jeu ?";
       JOptionPane.showConfirmDialog(this, cookie);
    }//GEN-LAST:event_bCookieActionPerformed
 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FAccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FAccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FAccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FAccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FAccueil().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCommencer;
    private javax.swing.JButton bCookie;
    private javax.swing.JButton bCredit;
    private javax.swing.JButton bQuitter;
    private javax.swing.JButton bReprendre;
    private javax.swing.JButton bRègles;
    private javax.swing.JLabel lTitre;
    // End of variables declaration//GEN-END:variables
}
