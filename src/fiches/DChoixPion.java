/*
Projet Java - Jeu Quarto
BERTIN Pierre-Aloïs - CALMET Pierre - SAID Gabriel
 */
package fiches;

public class DChoixPion extends javax.swing.JDialog {
    
    private DInfos Infos;
    //private Fjeu Poser;
    private int taille;
    
       
    public DChoixPion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        //Infos = new DInfos(parent, modal);       
    }
    
    public int gettaille(){
        return taille;
    }
    
    public void ChoixPion(){
        if(Infos.tailledelagrille()==0){
            PanelTaille.setVisible(true);
            PanelCoupe.setVisible(false);
            PanelJoker.setVisible(false);
        }
        if(Infos.tailledelagrille() == 1){
            PanelTaille.setVisible(true);
            PanelCoupe.setVisible(true);
            PanelJoker.setVisible(false);                       
        }
        PanelTaille.setVisible(false);
        if(cbJoker.isSelected()){
            rbNoir.setEnabled(false);
            rbBlanc.setEnabled(false);
            rbCarré.setEnabled(false);
            rbRond.setEnabled(false);
            rbPlein.setEnabled(false);
            rbTroué.setEnabled(false);
            rbGrand.setEnabled(false);
            rbPetit.setEnabled(false);
            rbEntier.setEnabled(false);
            rbTranché.setEnabled(false);                      
        } else{
             
            rbNoir.setEnabled(true);
            rbBlanc.setEnabled(true);
            rbCarré.setEnabled(true);
            rbRond.setEnabled(true);
            rbPlein.setEnabled(true);
            rbTroué.setEnabled(true);
            rbGrand.setEnabled(true);
            rbPetit.setEnabled(true);
            rbEntier.setEnabled(true);
            rbTranché.setEnabled(true);
        }
        
    
}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgTaille = new javax.swing.ButtonGroup();
        bgCoupe = new javax.swing.ButtonGroup();
        bgDensité = new javax.swing.ButtonGroup();
        bgGeo = new javax.swing.ButtonGroup();
        bgCouleur = new javax.swing.ButtonGroup();
        lChoixPion = new javax.swing.JLabel();
        rbPlein = new javax.swing.JRadioButton();
        rbTroué = new javax.swing.JRadioButton();
        rbNoir = new javax.swing.JRadioButton();
        rbBlanc = new javax.swing.JRadioButton();
        rbCarré = new javax.swing.JRadioButton();
        rbRond = new javax.swing.JRadioButton();
        pPiece1 = new javax.swing.JPanel();
        pPiece2 = new javax.swing.JPanel();
        pPiece3 = new javax.swing.JPanel();
        pPiece4 = new javax.swing.JPanel();
        pPiece5 = new javax.swing.JPanel();
        pPiece6 = new javax.swing.JPanel();
        PanelTaille = new javax.swing.JPanel();
        rbPetit = new javax.swing.JRadioButton();
        rbGrand = new javax.swing.JRadioButton();
        PanelCoupe = new javax.swing.JPanel();
        rbEntier = new javax.swing.JRadioButton();
        rbTranché = new javax.swing.JRadioButton();
        PanelJoker = new javax.swing.JPanel();
        cbJoker = new javax.swing.JCheckBox();
        bPoser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lChoixPion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lChoixPion.setText("Choisissez un pion : ");

        bgDensité.add(rbPlein);
        rbPlein.setText("Plein");

        bgDensité.add(rbTroué);
        rbTroué.setText("Troué");

        bgCouleur.add(rbNoir);
        rbNoir.setText("Noir");
        rbNoir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNoirActionPerformed(evt);
            }
        });

        bgCouleur.add(rbBlanc);
        rbBlanc.setText("Blanc");

        bgGeo.add(rbCarré);
        rbCarré.setText("Carré");

        bgGeo.add(rbRond);
        rbRond.setText("Rond");

        pPiece1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pPiece1Layout = new javax.swing.GroupLayout(pPiece1);
        pPiece1.setLayout(pPiece1Layout);
        pPiece1Layout.setHorizontalGroup(
            pPiece1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pPiece1Layout.setVerticalGroup(
            pPiece1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        pPiece2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pPiece2Layout = new javax.swing.GroupLayout(pPiece2);
        pPiece2.setLayout(pPiece2Layout);
        pPiece2Layout.setHorizontalGroup(
            pPiece2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pPiece2Layout.setVerticalGroup(
            pPiece2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        pPiece3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pPiece3Layout = new javax.swing.GroupLayout(pPiece3);
        pPiece3.setLayout(pPiece3Layout);
        pPiece3Layout.setHorizontalGroup(
            pPiece3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pPiece3Layout.setVerticalGroup(
            pPiece3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        pPiece4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pPiece4Layout = new javax.swing.GroupLayout(pPiece4);
        pPiece4.setLayout(pPiece4Layout);
        pPiece4Layout.setHorizontalGroup(
            pPiece4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pPiece4Layout.setVerticalGroup(
            pPiece4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        pPiece5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pPiece5Layout = new javax.swing.GroupLayout(pPiece5);
        pPiece5.setLayout(pPiece5Layout);
        pPiece5Layout.setHorizontalGroup(
            pPiece5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pPiece5Layout.setVerticalGroup(
            pPiece5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        pPiece6.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pPiece6Layout = new javax.swing.GroupLayout(pPiece6);
        pPiece6.setLayout(pPiece6Layout);
        pPiece6Layout.setHorizontalGroup(
            pPiece6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pPiece6Layout.setVerticalGroup(
            pPiece6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        PanelTaille.setBackground(new java.awt.Color(255, 255, 255));

        bgTaille.add(rbPetit);
        rbPetit.setText("Petit");

        bgTaille.add(rbGrand);
        rbGrand.setSelected(true);
        rbGrand.setText("Grand");
        rbGrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbGrandActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelTailleLayout = new javax.swing.GroupLayout(PanelTaille);
        PanelTaille.setLayout(PanelTailleLayout);
        PanelTailleLayout.setHorizontalGroup(
            PanelTailleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTailleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelTailleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbGrand, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbPetit, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelTailleLayout.setVerticalGroup(
            PanelTailleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTailleLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(rbGrand)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbPetit)
                .addGap(30, 30, 30))
        );

        PanelCoupe.setBackground(new java.awt.Color(255, 255, 255));

        bgCoupe.add(rbEntier);
        rbEntier.setSelected(true);
        rbEntier.setText("Entier");

        bgCoupe.add(rbTranché);
        rbTranché.setText("Tranché");

        javax.swing.GroupLayout PanelCoupeLayout = new javax.swing.GroupLayout(PanelCoupe);
        PanelCoupe.setLayout(PanelCoupeLayout);
        PanelCoupeLayout.setHorizontalGroup(
            PanelCoupeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCoupeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelCoupeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbEntier, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbTranché, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelCoupeLayout.setVerticalGroup(
            PanelCoupeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCoupeLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(rbEntier)
                .addGap(18, 18, 18)
                .addComponent(rbTranché)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        PanelJoker.setBackground(new java.awt.Color(255, 255, 255));

        cbJoker.setText("Joker");
        cbJoker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbJokerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelJokerLayout = new javax.swing.GroupLayout(PanelJoker);
        PanelJoker.setLayout(PanelJokerLayout);
        PanelJokerLayout.setHorizontalGroup(
            PanelJokerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelJokerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbJoker, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        PanelJokerLayout.setVerticalGroup(
            PanelJokerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelJokerLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(cbJoker)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        bPoser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bPoser.setText("Poser Pion");
        bPoser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPoserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(rbNoir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rbBlanc, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbCarré, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbPlein, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbRond, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbTroué, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PanelTaille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PanelCoupe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(PanelJoker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(pPiece1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(pPiece2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(pPiece3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(pPiece4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(pPiece5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(pPiece6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lChoixPion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bPoser)
                        .addGap(46, 46, 46))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lChoixPion)
                .addGap(34, 34, 34)
                .addComponent(PanelTaille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbPlein)
                            .addComponent(rbCarré)
                            .addComponent(rbNoir))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbBlanc)
                            .addComponent(rbRond)
                            .addComponent(rbTroué))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(28, Short.MAX_VALUE)
                        .addComponent(bPoser)
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PanelJoker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PanelCoupe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pPiece2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pPiece1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pPiece3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pPiece4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pPiece5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pPiece6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbGrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbGrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbGrandActionPerformed

    private void rbNoirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNoirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbNoirActionPerformed

    private void cbJokerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbJokerActionPerformed
       
    }//GEN-LAST:event_cbJokerActionPerformed

    private void bPoserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPoserActionPerformed
        //this.setVisible(false);
        //Poser.setVisible(true);
    }//GEN-LAST:event_bPoserActionPerformed

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
            java.util.logging.Logger.getLogger(DChoixPion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DChoixPion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DChoixPion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DChoixPion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DChoixPion dialog = new DChoixPion(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter(){
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
    private javax.swing.JPanel PanelCoupe;
    private javax.swing.JPanel PanelJoker;
    private javax.swing.JPanel PanelTaille;
    private javax.swing.JButton bPoser;
    private javax.swing.ButtonGroup bgCouleur;
    private javax.swing.ButtonGroup bgCoupe;
    private javax.swing.ButtonGroup bgDensité;
    private javax.swing.ButtonGroup bgGeo;
    private javax.swing.ButtonGroup bgTaille;
    private javax.swing.JCheckBox cbJoker;
    private javax.swing.JLabel lChoixPion;
    private javax.swing.JPanel pPiece1;
    private javax.swing.JPanel pPiece2;
    private javax.swing.JPanel pPiece3;
    private javax.swing.JPanel pPiece4;
    private javax.swing.JPanel pPiece5;
    private javax.swing.JPanel pPiece6;
    private javax.swing.JRadioButton rbBlanc;
    private javax.swing.JRadioButton rbCarré;
    private javax.swing.JRadioButton rbEntier;
    private javax.swing.JRadioButton rbGrand;
    private javax.swing.JRadioButton rbNoir;
    private javax.swing.JRadioButton rbPetit;
    private javax.swing.JRadioButton rbPlein;
    private javax.swing.JRadioButton rbRond;
    private javax.swing.JRadioButton rbTranché;
    private javax.swing.JRadioButton rbTroué;
    // End of variables declaration//GEN-END:variables
}
