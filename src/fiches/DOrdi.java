/*
Projet Java - Jeu Quarto
BERTIN Pierre-Aloïs - CALMET Pierre - SAID Gabriel
 */
package fiches;

import javax.swing.JOptionPane;

public class DOrdi extends javax.swing.JDialog {
    
    private boolean retour = false; //Booléen faux précisant qu'aucun choix n'a été effectué
    
    public DOrdi(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public boolean retourCliqué(){
        return retour;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgNivOrdi = new javax.swing.ButtonGroup();
        lNivOrdi = new javax.swing.JLabel();
        rbFacile = new javax.swing.JRadioButton();
        rbDifficile = new javax.swing.JRadioButton();
        bCommencer = new javax.swing.JButton();
        bRetour = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Niveau de l'ordinateur");

        lNivOrdi.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        lNivOrdi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lNivOrdi.setText("Choisissez le niveau de l'ordinateur");

        bgNivOrdi.add(rbFacile);
        rbFacile.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        rbFacile.setForeground(new java.awt.Color(0, 204, 255));
        rbFacile.setText("Facile");
        rbFacile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFacileActionPerformed(evt);
            }
        });

        bgNivOrdi.add(rbDifficile);
        rbDifficile.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        rbDifficile.setForeground(new java.awt.Color(153, 0, 153));
        rbDifficile.setText("Difficile");
        rbDifficile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDifficileActionPerformed(evt);
            }
        });

        bCommencer.setBackground(new java.awt.Color(0, 204, 51));
        bCommencer.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        bCommencer.setForeground(new java.awt.Color(255, 255, 255));
        bCommencer.setText("Commencer partie");
        bCommencer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCommencerActionPerformed(evt);
            }
        });

        bRetour.setBackground(new java.awt.Color(255, 102, 102));
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
                .addGap(95, 95, 95)
                .addComponent(bRetour, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bCommencer, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(181, Short.MAX_VALUE)
                .addComponent(lNivOrdi)
                .addGap(191, 191, 191))
            .addGroup(layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(rbFacile)
                .addGap(58, 58, 58)
                .addComponent(rbDifficile)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lNivOrdi)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbFacile)
                    .addComponent(rbDifficile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bRetour, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCommencer, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bRetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRetourActionPerformed
       this.setVisible(false);
       this.retour = true;
       bgNivOrdi.clearSelection();
       this.getParent().setVisible(true);  // On réaffiche FAccueil,son parent
    }//GEN-LAST:event_bRetourActionPerformed
    
    // Bouton pour commencer la partie dès que le niveau de l'ordinateur a été choisi
    private void bCommencerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCommencerActionPerformed
        if(rbFacile.isSelected() || rbDifficile.isSelected()){ 
            this.setVisible(false);
            retour = false;
            this.getParent().setVisible(true);
        }
    }//GEN-LAST:event_bCommencerActionPerformed
    
    // Niveaux de l'ordinateur
    private void rbFacileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFacileActionPerformed
        String ordisy = "Vous avez seléctionné le mode facile, bonne chance ☺"; 
        if (rbFacile.isSelected() == true) {    // On informe le joueur du mode qu'il a choisi.
        JOptionPane.showMessageDialog(this,ordisy);
        }    
    }//GEN-LAST:event_rbFacileActionPerformed

    private void rbDifficileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDifficileActionPerformed
        String ordiff = """
                        Vous avez seléctionné le mode difficile,
                        malheureusement il faudra attendre notre mise à jour pour pouvoir y jouer,
                        vous êtes donc redirigés vers le mode facile, encore un peu de patience ☺""";
        if (rbDifficile.isSelected() == true) {    
        JOptionPane.showMessageDialog(this,ordiff);
        }
    }//GEN-LAST:event_rbDifficileActionPerformed

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
            java.util.logging.Logger.getLogger(DOrdi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DOrdi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DOrdi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DOrdi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                DOrdi dialog = new DOrdi(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton bCommencer;
    private javax.swing.JButton bRetour;
    private javax.swing.ButtonGroup bgNivOrdi;
    private javax.swing.JLabel lNivOrdi;
    private javax.swing.JRadioButton rbDifficile;
    private javax.swing.JRadioButton rbFacile;
    // End of variables declaration//GEN-END:variables
}
