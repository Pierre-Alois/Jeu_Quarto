/*
Projet Java - Jeu Quarto
BERTIN Pierre-Aloïs - CALMET Pierre - SAID Gabriel
 */
package fiches;

public class FAccueil extends javax.swing.JFrame {

    private DInfos infos;
    private DOrdi ordi;
    private DChoixPion pion;
    
    private int taille;
    
    public FAccueil(){
        initComponents();
        infos = new DInfos(this,false);
        ordi = new DOrdi(this, false);
        pion = new DChoixPion(this, false);
    }
    
    public int gettaille(){
        return pion.gettaille();
    }
    
    public void settaille(){
        this.taille = taille;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bCommencer = new javax.swing.JButton();
        bReprendre = new javax.swing.JButton();
        lTitre = new javax.swing.JLabel();
        mbAccueil = new javax.swing.JMenuBar();
        mFichier = new javax.swing.JMenu();
        mMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1360, 730));

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
        lTitre.setText("Quarto X OtrauQ");

        mFichier.setText("Fichier");
        mbAccueil.add(mFichier);

        mMenu.setText("Menu");
        mbAccueil.add(mMenu);

        setJMenuBar(mbAccueil);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(bCommencer)
                .addGap(5, 5, 5)
                .addComponent(bReprendre)
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lTitre)
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bCommencer)
                    .addComponent(bReprendre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lTitre)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCommencerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCommencerActionPerformed
        this.setVisible(false); 
        infos.setVisible(true);
    }//GEN-LAST:event_bCommencerActionPerformed

    private void bReprendreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bReprendreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bReprendreActionPerformed

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
            public void run() {
                new FAccueil().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCommencer;
    private javax.swing.JButton bReprendre;
    private javax.swing.JLabel lTitre;
    private javax.swing.JMenu mFichier;
    private javax.swing.JMenu mMenu;
    private javax.swing.JMenuBar mbAccueil;
    // End of variables declaration//GEN-END:variables
}
