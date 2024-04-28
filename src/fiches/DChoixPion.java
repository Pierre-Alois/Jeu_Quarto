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
        pPieces = new javax.swing.JPanel();
        b00000 = new javax.swing.JButton();
        b00001 = new javax.swing.JButton();
        b00010 = new javax.swing.JButton();
        b00011 = new javax.swing.JButton();
        b00100 = new javax.swing.JButton();
        b00101 = new javax.swing.JButton();
        b00110 = new javax.swing.JButton();
        b00111 = new javax.swing.JButton();
        b01000 = new javax.swing.JButton();
        b01001 = new javax.swing.JButton();
        b01010 = new javax.swing.JButton();
        b01011 = new javax.swing.JButton();
        b01100 = new javax.swing.JButton();
        b01101 = new javax.swing.JButton();
        b01110 = new javax.swing.JButton();
        b01111 = new javax.swing.JButton();
        b10000 = new javax.swing.JButton();
        b10001 = new javax.swing.JButton();
        b10010 = new javax.swing.JButton();
        b10011 = new javax.swing.JButton();
        b10100 = new javax.swing.JButton();
        b10101 = new javax.swing.JButton();
        b10110 = new javax.swing.JButton();
        b10111 = new javax.swing.JButton();
        b11000 = new javax.swing.JButton();
        b11001 = new javax.swing.JButton();
        b11010 = new javax.swing.JButton();
        b11011 = new javax.swing.JButton();
        b11100 = new javax.swing.JButton();
        b11101 = new javax.swing.JButton();
        b11110 = new javax.swing.JButton();
        b11111 = new javax.swing.JButton();
        bxxxxx = new javax.swing.JButton();
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
        setPreferredSize(new java.awt.Dimension(1360, 730));

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

        pPieces.setBackground(new java.awt.Color(255, 255, 255));

        b00000.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p00000.png"))); // NOI18N
        b00000.setPreferredSize(new java.awt.Dimension(150, 150));
        pPieces.add(b00000);

        b00001.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p00001.png"))); // NOI18N
        b00001.setPreferredSize(new java.awt.Dimension(150, 150));
        pPieces.add(b00001);

        b00010.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p00010.png"))); // NOI18N
        b00010.setPreferredSize(new java.awt.Dimension(150, 150));
        pPieces.add(b00010);

        b00011.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p00011.png"))); // NOI18N
        b00011.setPreferredSize(new java.awt.Dimension(150, 150));
        pPieces.add(b00011);

        b00100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p00100.png"))); // NOI18N
        b00100.setPreferredSize(new java.awt.Dimension(150, 150));
        pPieces.add(b00100);

        b00101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p00101.png"))); // NOI18N
        b00101.setPreferredSize(new java.awt.Dimension(150, 150));
        pPieces.add(b00101);

        b00110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p00110.png"))); // NOI18N
        b00110.setPreferredSize(new java.awt.Dimension(150, 150));
        pPieces.add(b00110);

        b00111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p00111.png"))); // NOI18N
        b00111.setPreferredSize(new java.awt.Dimension(150, 150));
        pPieces.add(b00111);

        b01000.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p01000.png"))); // NOI18N
        b01000.setPreferredSize(new java.awt.Dimension(150, 150));
        pPieces.add(b01000);

        b01001.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p01001.png"))); // NOI18N
        b01001.setPreferredSize(new java.awt.Dimension(150, 150));
        pPieces.add(b01001);

        b01010.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p01010.png"))); // NOI18N
        b01010.setPreferredSize(new java.awt.Dimension(150, 150));
        pPieces.add(b01010);

        b01011.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p01011.png"))); // NOI18N
        b01011.setPreferredSize(new java.awt.Dimension(150, 150));
        pPieces.add(b01011);

        b01100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p01100.png"))); // NOI18N
        b01100.setPreferredSize(new java.awt.Dimension(150, 150));
        pPieces.add(b01100);

        b01101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p01101.png"))); // NOI18N
        b01101.setPreferredSize(new java.awt.Dimension(150, 150));
        pPieces.add(b01101);

        b01110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p01110.png"))); // NOI18N
        b01110.setPreferredSize(new java.awt.Dimension(150, 150));
        pPieces.add(b01110);

        b01111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p01111.png"))); // NOI18N
        b01111.setPreferredSize(new java.awt.Dimension(150, 150));
        pPieces.add(b01111);

        b10000.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p10000.png"))); // NOI18N
        b10000.setPreferredSize(new java.awt.Dimension(150, 150));
        pPieces.add(b10000);

        b10001.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p10001.png"))); // NOI18N
        b10001.setPreferredSize(new java.awt.Dimension(150, 150));
        pPieces.add(b10001);

        b10010.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p10010.png"))); // NOI18N
        b10010.setPreferredSize(new java.awt.Dimension(150, 150));
        pPieces.add(b10010);

        b10011.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p10011.png"))); // NOI18N
        b10011.setPreferredSize(new java.awt.Dimension(150, 150));
        pPieces.add(b10011);

        b10100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p10100.png"))); // NOI18N
        b10100.setPreferredSize(new java.awt.Dimension(150, 150));
        pPieces.add(b10100);

        b10101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p10101.png"))); // NOI18N
        b10101.setPreferredSize(new java.awt.Dimension(150, 150));
        pPieces.add(b10101);

        b10110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p10110.png"))); // NOI18N
        b10110.setPreferredSize(new java.awt.Dimension(150, 150));
        pPieces.add(b10110);

        b10111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p10111.png"))); // NOI18N
        b10111.setPreferredSize(new java.awt.Dimension(150, 150));
        pPieces.add(b10111);

        b11000.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p11000.png"))); // NOI18N
        b11000.setPreferredSize(new java.awt.Dimension(150, 150));
        pPieces.add(b11000);

        b11001.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p11001.png"))); // NOI18N
        b11001.setPreferredSize(new java.awt.Dimension(150, 150));
        pPieces.add(b11001);

        b11010.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p11010.png"))); // NOI18N
        b11010.setPreferredSize(new java.awt.Dimension(150, 150));
        pPieces.add(b11010);

        b11011.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p11011.png"))); // NOI18N
        b11011.setPreferredSize(new java.awt.Dimension(150, 150));
        pPieces.add(b11011);

        b11100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p11100.png"))); // NOI18N
        b11100.setPreferredSize(new java.awt.Dimension(150, 150));
        pPieces.add(b11100);

        b11101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p11101.png"))); // NOI18N
        b11101.setPreferredSize(new java.awt.Dimension(150, 150));
        pPieces.add(b11101);

        b11110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p11110.png"))); // NOI18N
        b11110.setPreferredSize(new java.awt.Dimension(150, 150));
        pPieces.add(b11110);

        b11111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p11111.png"))); // NOI18N
        b11111.setPreferredSize(new java.awt.Dimension(150, 150));
        pPieces.add(b11111);

        bxxxxx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/pxxxxx.png"))); // NOI18N
        bxxxxx.setPreferredSize(new java.awt.Dimension(150, 150));
        pPieces.add(bxxxxx);

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbEntier)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbTranché))
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
                .addGap(21, 21, 21)
                .addComponent(cbJoker)
                .addContainerGap(19, Short.MAX_VALUE))
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
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pPieces, javax.swing.GroupLayout.PREFERRED_SIZE, 949, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lChoixPion)
                            .addGroup(layout.createSequentialGroup()
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
                                .addComponent(PanelTaille, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(PanelCoupe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(PanelJoker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bPoser)
                .addGap(224, 224, 224))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lChoixPion)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PanelTaille, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rbPlein)
                                    .addComponent(rbCarré)
                                    .addComponent(rbNoir))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rbBlanc)
                                    .addComponent(rbRond)
                                    .addComponent(rbTroué)))
                            .addComponent(PanelCoupe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PanelJoker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(bPoser)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(pPieces, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
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
    private javax.swing.JButton b00000;
    private javax.swing.JButton b00001;
    private javax.swing.JButton b00010;
    private javax.swing.JButton b00011;
    private javax.swing.JButton b00100;
    private javax.swing.JButton b00101;
    private javax.swing.JButton b00110;
    private javax.swing.JButton b00111;
    private javax.swing.JButton b01000;
    private javax.swing.JButton b01001;
    private javax.swing.JButton b01010;
    private javax.swing.JButton b01011;
    private javax.swing.JButton b01100;
    private javax.swing.JButton b01101;
    private javax.swing.JButton b01110;
    private javax.swing.JButton b01111;
    private javax.swing.JButton b10000;
    private javax.swing.JButton b10001;
    private javax.swing.JButton b10010;
    private javax.swing.JButton b10011;
    private javax.swing.JButton b10100;
    private javax.swing.JButton b10101;
    private javax.swing.JButton b10110;
    private javax.swing.JButton b10111;
    private javax.swing.JButton b11000;
    private javax.swing.JButton b11001;
    private javax.swing.JButton b11010;
    private javax.swing.JButton b11011;
    private javax.swing.JButton b11100;
    private javax.swing.JButton b11101;
    private javax.swing.JButton b11110;
    private javax.swing.JButton b11111;
    private javax.swing.JButton bPoser;
    private javax.swing.ButtonGroup bgCouleur;
    private javax.swing.ButtonGroup bgCoupe;
    private javax.swing.ButtonGroup bgDensité;
    private javax.swing.ButtonGroup bgGeo;
    private javax.swing.ButtonGroup bgTaille;
    private javax.swing.JButton bxxxxx;
    private javax.swing.JCheckBox cbJoker;
    private javax.swing.JLabel lChoixPion;
    private javax.swing.JPanel pPieces;
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
