/*
Projet Java - Jeu Quarto
BERTIN Pierre-Aloïs - CALMET Pierre - SAID Gabriel
 */
package fiches;

public class FJeu extends javax.swing.JFrame {
    
    private DChoixPion choix;
    private String refPion;
    
    public FJeu() {
        
        initComponents();
        choix = new DChoixPion(this,false);      
    }

    public void setRefPion(String refPion) {
        this.refPion = refPion;       
    }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pPlateau = new javax.swing.JPanel();
        lJoueur = new javax.swing.JLabel();
        lInstruction = new javax.swing.JLabel();
        bChoix = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Plateau du Jeu");
        setMaximumSize(new java.awt.Dimension(700, 700));
        setMinimumSize(new java.awt.Dimension(100, 100));
        setPreferredSize(new java.awt.Dimension(1360, 735));

        pPlateau.setBackground(new java.awt.Color(246, 236, 221));
        pPlateau.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pPlateau.setToolTipText("");
        pPlateau.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout pPlateauLayout = new javax.swing.GroupLayout(pPlateau);
        pPlateau.setLayout(pPlateauLayout);
        pPlateauLayout.setHorizontalGroup(
            pPlateauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 466, Short.MAX_VALUE)
        );
        pPlateauLayout.setVerticalGroup(
            pPlateauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 418, Short.MAX_VALUE)
        );

        getContentPane().add(pPlateau, java.awt.BorderLayout.CENTER);
        getContentPane().add(lJoueur, java.awt.BorderLayout.PAGE_START);
        getContentPane().add(lInstruction, java.awt.BorderLayout.PAGE_END);

        bChoix.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        bChoix.setText("Choisir pion");
        bChoix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bChoixActionPerformed(evt);
            }
        });
        getContentPane().add(bChoix, java.awt.BorderLayout.LINE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bChoixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bChoixActionPerformed
        this.setVisible(false);
        choix.setVisible(true);
    }//GEN-LAST:event_bChoixActionPerformed

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
            java.util.logging.Logger.getLogger(FJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FJeu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bChoix;
    private javax.swing.JLabel lInstruction;
    private javax.swing.JLabel lJoueur;
    private javax.swing.JPanel pPlateau;
    // End of variables declaration//GEN-END:variables
}