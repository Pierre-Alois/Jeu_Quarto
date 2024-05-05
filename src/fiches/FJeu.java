/*
Projet Java - Jeu Quarto
BERTIN Pierre-Aloïs - CALMET Pierre - SAID Gabriel
 */
package fiches;

public class FJeu extends javax.swing.JFrame {
    
    private final DChoixPion choix;
    private String refPion;
    private int taille;
    
    public FJeu() {
        
        initComponents();
        
        choix = new DChoixPion(this, false);
    }
    
    public void setRefPion(String refPion) {
        this.refPion = refPion;       
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pPlateau = new javax.swing.JPanel();
        lJoueur = new javax.swing.JLabel();
        bChoix = new javax.swing.JButton();
        lInstruction = new javax.swing.JLabel();
        bValider = new javax.swing.JButton();
        pSloggan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Plateau du Jeu");
        setMaximumSize(new java.awt.Dimension(700, 700));
        setMinimumSize(new java.awt.Dimension(100, 100));
        setPreferredSize(new java.awt.Dimension(1360, 735));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        pPlateau.setBackground(new java.awt.Color(246, 236, 221));
        pPlateau.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pPlateau.setToolTipText("");
        pPlateau.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pPlateau.setPreferredSize(new java.awt.Dimension(630, 630));

        javax.swing.GroupLayout pPlateauLayout = new javax.swing.GroupLayout(pPlateau);
        pPlateau.setLayout(pPlateauLayout);
        pPlateauLayout.setHorizontalGroup(
            pPlateauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 626, Short.MAX_VALUE)
        );
        pPlateauLayout.setVerticalGroup(
            pPlateauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 626, Short.MAX_VALUE)
        );

        lJoueur.setText("lJoueur");

        bChoix.setBackground(new java.awt.Color(255, 204, 51));
        bChoix.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        bChoix.setText("Choisir pion");
        bChoix.setPreferredSize(new java.awt.Dimension(130, 130));
        bChoix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bChoixActionPerformed(evt);
            }
        });

        lInstruction.setText("lInstruction");

        bValider.setBackground(new java.awt.Color(0, 204, 51));
        bValider.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        bValider.setText("Valider");
        bValider.setPreferredSize(new java.awt.Dimension(130, 130));
        bValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bValiderActionPerformed(evt);
            }
        });

        pSloggan.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        pSloggan.setText("Votre différence est votre plus grande force...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(pPlateau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(pSloggan)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 307, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lJoueur, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(193, 193, 193))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lInstruction)
                        .addGap(154, 154, 154))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bValider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bChoix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(183, 183, 183))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lInstruction)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lJoueur)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bChoix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(bValider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(262, 262, 262))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(pSloggan)
                .addGap(18, 18, 18)
                .addComponent(pPlateau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bChoixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bChoixActionPerformed
        choix.setTaille(taille);
        choix.setVisible(true);
    }//GEN-LAST:event_bChoixActionPerformed

    private void bValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bValiderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bValiderActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        int x = 100;
        int y = 78;
        if(taille == 0){
            pPlateau.setBounds(x, y, 474, 474);
        }else if(taille == 1){
            pPlateau.setBounds(x, y, 630, 630);
        }else if(taille == 2){
            pPlateau.setBounds(x, y, 586, 586);
        }
    }//GEN-LAST:event_formComponentShown

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
            @Override
            public void run() {
                new FJeu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bChoix;
    private javax.swing.JButton bValider;
    private javax.swing.JLabel lInstruction;
    private javax.swing.JLabel lJoueur;
    private javax.swing.JPanel pPlateau;
    private javax.swing.JLabel pSloggan;
    // End of variables declaration//GEN-END:variables
}