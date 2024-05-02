/*
Projet Java - Jeu Quarto
BERTIN Pierre-Aloïs - CALMET Pierre - SAID Gabriel
 */
package fiches;

public class DInfos extends javax.swing.JDialog {
    
    private DOrdi Ordi;
    private DChoixPion Pion;

    public DInfos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Ordi = new DOrdi(parent,modal);
        Pion = new DChoixPion(parent, modal);
    }
    
    public int tailledelagrille(){
        return cbTGrille.getSelectedIndex();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lInfos = new javax.swing.JLabel();
        LnomJ1 = new javax.swing.JLabel();
        lnomJ2 = new javax.swing.JLabel();
        lTGrille = new javax.swing.JLabel();
        tfJ1 = new javax.swing.JTextField();
        tfJ2 = new javax.swing.JTextField();
        cbTGrille = new javax.swing.JComboBox<>();
        bCommencer = new javax.swing.JButton();
        bRetour = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mode de jeu");

        lInfos.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        lInfos.setForeground(new java.awt.Color(0, 102, 204));
        lInfos.setText("Rentrez vos informations : ");

        LnomJ1.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        LnomJ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LnomJ1.setText("Pseudo Joueur 1");

        lnomJ2.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        lnomJ2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lnomJ2.setText("Pseudo Joueur 2");

        lTGrille.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        lTGrille.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTGrille.setText("Taille de la grille");

        tfJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfJ1ActionPerformed(evt);
            }
        });

        tfJ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfJ2ActionPerformed(evt);
            }
        });

        cbTGrille.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbTGrille.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3*3", "4*4", "5*5" }));

        bCommencer.setBackground(new java.awt.Color(204, 0, 0));
        bCommencer.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        bCommencer.setForeground(new java.awt.Color(255, 255, 255));
        bCommencer.setText("Commencer partie");
        bCommencer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCommencerActionPerformed(evt);
            }
        });

        bRetour.setBackground(new java.awt.Color(209, 75, 33));
        bRetour.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        bRetour.setText("Retour");
        bRetour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRetourActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(LnomJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(lnomJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lTGrille, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 43, Short.MAX_VALUE)
                .addComponent(tfJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(tfJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(cbTGrille, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(bRetour, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bCommencer, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lInfos)
                .addGap(213, 213, 213))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lInfos)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lTGrille, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lnomJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LnomJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbTGrille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tfJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCommencer, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bRetour, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bRetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRetourActionPerformed
        this.setVisible(false);
        this.getParent().setVisible(true);
    }//GEN-LAST:event_bRetourActionPerformed

    private void tfJ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfJ2ActionPerformed

    }//GEN-LAST:event_tfJ2ActionPerformed

    private void bCommencerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCommencerActionPerformed
        String nom1 = tfJ1.getText(); // On récupère les Strings écrites pas les joueurs
        String nom2 = tfJ2.getText();
        
        // Choix de l'ordinateur
        if (nom1.length() !=0 && nom2.length() == 0){
            this.setVisible(false);
            Ordi.setVisible(true);    
        }
        // Manque d'information ou confusion
        else if(nom1.length() == 0 && nom2.length() !=0 || nom1.length() == 0 
               && nom2.length() == 0 || nom1.length() == nom2.length()){
            this.setVisible(true);           
        }
        // Partie avec 2 joueurs
        else{
            this.setVisible(false);
            FJeu grille = new FJeu();
            grille.setVisible(true); 
        }
    }//GEN-LAST:event_bCommencerActionPerformed

    private void tfJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfJ1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfJ1ActionPerformed

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
            java.util.logging.Logger.getLogger(DInfos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DInfos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DInfos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DInfos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DInfos dialog = new DInfos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LnomJ1;
    private javax.swing.JButton bCommencer;
    private javax.swing.JButton bRetour;
    private javax.swing.JComboBox<String> cbTGrille;
    private javax.swing.JLabel lInfos;
    private javax.swing.JLabel lTGrille;
    private javax.swing.JLabel lnomJ2;
    private javax.swing.JTextField tfJ1;
    private javax.swing.JTextField tfJ2;
    // End of variables declaration//GEN-END:variables
}
