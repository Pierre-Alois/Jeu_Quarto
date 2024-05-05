/*
Projet Java - Jeu Quarto
BERTIN Pierre-Aloïs - CALMET Pierre - SAID Gabriel
 */
package fiches;

import java.util.ArrayList;
import javax.swing.ImageIcon;

public class FJeu extends javax.swing.JFrame {
    
    private final DChoixPion choix;
    private String refPion;
    private int taille;
    private final javax.swing.JButton[] tab;
    private ArrayList<String> coord;
    private String coordTemp;
    
    public FJeu() {
        initComponents();
        
        choix = new DChoixPion(this, false);
        
        // <editor-fold defaultstate="collapsed" desc="Définition tableau des 25 boutons (tab)">
        javax.swing.JButton[] tab = new javax.swing.JButton[25];
        tab[0] = b11;
        tab[1] = b12;
        tab[2] = b13;
        tab[3] = b14;
        tab[4] = b15;
        tab[5] = b21;
        tab[6] = b22;
        tab[7] = b23;
        tab[8] = b24;
        tab[9] = b25;
        tab[10] = b31;
        tab[11] = b32;
        tab[12] = b33;
        tab[13] = b34;
        tab[14] = b35;
        tab[15] = b41;
        tab[16] = b42;
        tab[17] = b43;
        tab[18] = b44;
        tab[19] = b45;
        tab[20] = b51;
        tab[21] = b52;
        tab[22] = b53;
        tab[23] = b54;
        tab[24] = b55;
        this.tab = tab;// </editor-fold>
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
        b11 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        b13 = new javax.swing.JButton();
        b14 = new javax.swing.JButton();
        b15 = new javax.swing.JButton();
        b21 = new javax.swing.JButton();
        b22 = new javax.swing.JButton();
        b23 = new javax.swing.JButton();
        b24 = new javax.swing.JButton();
        b25 = new javax.swing.JButton();
        b31 = new javax.swing.JButton();
        b32 = new javax.swing.JButton();
        b33 = new javax.swing.JButton();
        b34 = new javax.swing.JButton();
        b35 = new javax.swing.JButton();
        b41 = new javax.swing.JButton();
        b42 = new javax.swing.JButton();
        b43 = new javax.swing.JButton();
        b44 = new javax.swing.JButton();
        b45 = new javax.swing.JButton();
        b51 = new javax.swing.JButton();
        b52 = new javax.swing.JButton();
        b53 = new javax.swing.JButton();
        b54 = new javax.swing.JButton();
        b55 = new javax.swing.JButton();
        lJoueur = new javax.swing.JLabel();
        bChoix = new javax.swing.JButton();
        lInstruction = new javax.swing.JLabel();
        bValider = new javax.swing.JButton();
        pSlogan = new javax.swing.JLabel();
        lPion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Plateau du Jeu");
        setMaximumSize(new java.awt.Dimension(700, 700));
        setMinimumSize(new java.awt.Dimension(1360, 730));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        pPlateau.setBackground(new java.awt.Color(246, 236, 221));
        pPlateau.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pPlateau.setToolTipText("");
        pPlateau.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pPlateau.setMaximumSize(new java.awt.Dimension(600, 600));
        pPlateau.setMinimumSize(new java.awt.Dimension(450, 450));
        pPlateau.setPreferredSize(new java.awt.Dimension(550, 550));
        pPlateau.setLayout(new java.awt.GridLayout(5, 5));

        b11.setBackground(new java.awt.Color(248, 189, 155));
        b11.setBorder(null);
        b11.setMaximumSize(new java.awt.Dimension(150, 150));
        b11.setMinimumSize(new java.awt.Dimension(110, 110));
        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });
        pPlateau.add(b11);

        b12.setBackground(new java.awt.Color(88, 60, 55));
        b12.setBorder(null);
        b12.setMaximumSize(new java.awt.Dimension(150, 150));
        b12.setMinimumSize(new java.awt.Dimension(110, 110));
        b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b12ActionPerformed(evt);
            }
        });
        pPlateau.add(b12);

        b13.setBackground(new java.awt.Color(248, 189, 155));
        b13.setBorder(null);
        b13.setMaximumSize(new java.awt.Dimension(150, 150));
        b13.setMinimumSize(new java.awt.Dimension(110, 110));
        b13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b13ActionPerformed(evt);
            }
        });
        pPlateau.add(b13);

        b14.setBackground(new java.awt.Color(88, 60, 55));
        b14.setBorder(null);
        b14.setMaximumSize(new java.awt.Dimension(150, 150));
        b14.setMinimumSize(new java.awt.Dimension(110, 110));
        b14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b14ActionPerformed(evt);
            }
        });
        pPlateau.add(b14);

        b15.setBackground(new java.awt.Color(248, 189, 155));
        b15.setBorder(null);
        b15.setMaximumSize(new java.awt.Dimension(150, 150));
        b15.setMinimumSize(new java.awt.Dimension(110, 110));
        b15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b15ActionPerformed(evt);
            }
        });
        pPlateau.add(b15);

        b21.setBackground(new java.awt.Color(88, 60, 55));
        b21.setBorder(null);
        b21.setMaximumSize(new java.awt.Dimension(150, 150));
        b21.setMinimumSize(new java.awt.Dimension(110, 110));
        b21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b21ActionPerformed(evt);
            }
        });
        pPlateau.add(b21);

        b22.setBackground(new java.awt.Color(248, 189, 155));
        b22.setBorder(null);
        b22.setMaximumSize(new java.awt.Dimension(150, 150));
        b22.setMinimumSize(new java.awt.Dimension(110, 110));
        b22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b22ActionPerformed(evt);
            }
        });
        pPlateau.add(b22);

        b23.setBackground(new java.awt.Color(88, 60, 55));
        b23.setBorder(null);
        b23.setMaximumSize(new java.awt.Dimension(150, 150));
        b23.setMinimumSize(new java.awt.Dimension(110, 110));
        b23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b23ActionPerformed(evt);
            }
        });
        pPlateau.add(b23);

        b24.setBackground(new java.awt.Color(248, 189, 155));
        b24.setBorder(null);
        b24.setMaximumSize(new java.awt.Dimension(150, 150));
        b24.setMinimumSize(new java.awt.Dimension(110, 110));
        b24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b24ActionPerformed(evt);
            }
        });
        pPlateau.add(b24);

        b25.setBackground(new java.awt.Color(88, 60, 55));
        b25.setBorder(null);
        b25.setMaximumSize(new java.awt.Dimension(150, 150));
        b25.setMinimumSize(new java.awt.Dimension(110, 110));
        b25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b25ActionPerformed(evt);
            }
        });
        pPlateau.add(b25);

        b31.setBackground(new java.awt.Color(248, 189, 155));
        b31.setBorder(null);
        b31.setMaximumSize(new java.awt.Dimension(150, 150));
        b31.setMinimumSize(new java.awt.Dimension(110, 110));
        b31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b31ActionPerformed(evt);
            }
        });
        pPlateau.add(b31);

        b32.setBackground(new java.awt.Color(88, 60, 55));
        b32.setBorder(null);
        b32.setMaximumSize(new java.awt.Dimension(150, 150));
        b32.setMinimumSize(new java.awt.Dimension(110, 110));
        b32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b32ActionPerformed(evt);
            }
        });
        pPlateau.add(b32);

        b33.setBackground(new java.awt.Color(248, 189, 155));
        b33.setBorder(null);
        b33.setMaximumSize(new java.awt.Dimension(150, 150));
        b33.setMinimumSize(new java.awt.Dimension(110, 110));
        b33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b33ActionPerformed(evt);
            }
        });
        pPlateau.add(b33);

        b34.setBackground(new java.awt.Color(88, 60, 55));
        b34.setBorder(null);
        b34.setMaximumSize(new java.awt.Dimension(150, 150));
        b34.setMinimumSize(new java.awt.Dimension(110, 110));
        b34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b34ActionPerformed(evt);
            }
        });
        pPlateau.add(b34);

        b35.setBackground(new java.awt.Color(248, 189, 155));
        b35.setBorder(null);
        b35.setMaximumSize(new java.awt.Dimension(150, 150));
        b35.setMinimumSize(new java.awt.Dimension(110, 110));
        b35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b35ActionPerformed(evt);
            }
        });
        pPlateau.add(b35);

        b41.setBackground(new java.awt.Color(88, 60, 55));
        b41.setBorder(null);
        b41.setMaximumSize(new java.awt.Dimension(150, 150));
        b41.setMinimumSize(new java.awt.Dimension(110, 110));
        b41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b41ActionPerformed(evt);
            }
        });
        pPlateau.add(b41);

        b42.setBackground(new java.awt.Color(248, 189, 155));
        b42.setBorder(null);
        b42.setMaximumSize(new java.awt.Dimension(150, 150));
        b42.setMinimumSize(new java.awt.Dimension(110, 110));
        b42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b42ActionPerformed(evt);
            }
        });
        pPlateau.add(b42);

        b43.setBackground(new java.awt.Color(88, 60, 55));
        b43.setBorder(null);
        b43.setMaximumSize(new java.awt.Dimension(150, 150));
        b43.setMinimumSize(new java.awt.Dimension(110, 110));
        b43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b43ActionPerformed(evt);
            }
        });
        pPlateau.add(b43);

        b44.setBackground(new java.awt.Color(248, 189, 155));
        b44.setBorder(null);
        b44.setMaximumSize(new java.awt.Dimension(150, 150));
        b44.setMinimumSize(new java.awt.Dimension(110, 110));
        b44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b44ActionPerformed(evt);
            }
        });
        pPlateau.add(b44);

        b45.setBackground(new java.awt.Color(88, 60, 55));
        b45.setBorder(null);
        b45.setMaximumSize(new java.awt.Dimension(150, 150));
        b45.setMinimumSize(new java.awt.Dimension(110, 110));
        b45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b45ActionPerformed(evt);
            }
        });
        pPlateau.add(b45);

        b51.setBackground(new java.awt.Color(248, 189, 155));
        b51.setBorder(null);
        b51.setMaximumSize(new java.awt.Dimension(150, 150));
        b51.setMinimumSize(new java.awt.Dimension(110, 110));
        b51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b51ActionPerformed(evt);
            }
        });
        pPlateau.add(b51);

        b52.setBackground(new java.awt.Color(88, 60, 55));
        b52.setBorder(null);
        b52.setMaximumSize(new java.awt.Dimension(150, 150));
        b52.setMinimumSize(new java.awt.Dimension(110, 110));
        b52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b52ActionPerformed(evt);
            }
        });
        pPlateau.add(b52);

        b53.setBackground(new java.awt.Color(248, 189, 155));
        b53.setBorder(null);
        b53.setMaximumSize(new java.awt.Dimension(150, 150));
        b53.setMinimumSize(new java.awt.Dimension(110, 110));
        b53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b53ActionPerformed(evt);
            }
        });
        pPlateau.add(b53);

        b54.setBackground(new java.awt.Color(88, 60, 55));
        b54.setBorder(null);
        b54.setMaximumSize(new java.awt.Dimension(150, 150));
        b54.setMinimumSize(new java.awt.Dimension(110, 110));
        b54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b54ActionPerformed(evt);
            }
        });
        pPlateau.add(b54);

        b55.setBackground(new java.awt.Color(248, 189, 155));
        b55.setBorder(null);
        b55.setMaximumSize(new java.awt.Dimension(150, 150));
        b55.setMinimumSize(new java.awt.Dimension(110, 110));
        b55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b55ActionPerformed(evt);
            }
        });
        pPlateau.add(b55);

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

        pSlogan.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        pSlogan.setText("Votre différence est votre plus grande force...");

        lPion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lPion.setMaximumSize(new java.awt.Dimension(208, 429));
        lPion.setMinimumSize(new java.awt.Dimension(208, 429));
        lPion.setPreferredSize(new java.awt.Dimension(208, 429));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pPlateau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pSlogan))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lJoueur, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(220, 220, 220))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lPion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bValider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bChoix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(183, 183, 183))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(lInstruction)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lInstruction)
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bChoix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(bValider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lPion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(140, 140, 140))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pSlogan)
                            .addComponent(lJoueur))
                        .addGap(18, 18, 18)
                        .addComponent(pPlateau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bChoixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bChoixActionPerformed
        choix.setTaille(taille);
        choix.setVisible(true);
    }//GEN-LAST:event_bChoixActionPerformed
    
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        int x = 100;
        int y = 78;
        if(taille == 0){
            pPlateau.setBounds(x, y, pPlateau.getMinimumSize().width, pPlateau.getMinimumSize().height);
            for(int i=24;i>=0;i-=5){
                for(int j=0;j<5;j++){
                    if(i-j > 12 || (i-j+1) % 5 == 0 || (i-j+1) % 5 == 4){
                        pPlateau.remove(tab[i-j]);
                    }else{
                        tab[i-j].setBounds(150*(4-j), 150*(i % 4), 150, 150);
                    }
                }
            }
        }else if(taille == 1){
            pPlateau.setBounds(x, y, pPlateau.getMaximumSize().width, pPlateau.getMaximumSize().height);
            for(int i=24;i>=0;i-=5){
                for(int j=0;j<5;j++){
                    if(i-j > 18 || (i-j+1) % 5 == 0){
                        pPlateau.remove(tab[i-j]);
                    }else{
                        tab[i-j].setBounds(150*(4-j), 150*(i % 4), 150, 150);
                    }
                }
            }
        }else if(taille == 2){
            pPlateau.setBounds(x, y, pPlateau.getPreferredSize().width, pPlateau.getPreferredSize().height);
        }
    }//GEN-LAST:event_formComponentShown
    
    // <editor-fold defaultstate="collapsed" desc="ActionPerformed des 25 boutons">
    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b11ActionPerformed
        System.out.println("b11");
        if(!coord.contains("11") && bChoix.getText().equalsIgnoreCase("Valider")){
            coordTemp = "11";
            if(taille != 2){
                b11.setIcon(new ImageIcon("src/images_pions/p" + refPion + ".png"));
            }else{
                b11.setIcon(new ImageIcon("src/images_pions/tp" + refPion + ".png"));
            }
        }
    }//GEN-LAST:event_b11ActionPerformed

    private void b12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b12ActionPerformed
        System.out.println("b12");
        if(!coord.contains("12") && bChoix.getText().equalsIgnoreCase("Valider")){
            coordTemp = "12";
            if(taille != 2){
                b12.setIcon(new ImageIcon("src/images_pions/p" + refPion + ".png"));
            }else{
                b12.setIcon(new ImageIcon("src/images_pions/tp" + refPion + ".png"));
            }
        }
    }//GEN-LAST:event_b12ActionPerformed

    private void b13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b13ActionPerformed
        System.out.println("b13");
        if(!coord.contains("13") && bChoix.getText().equalsIgnoreCase("Valider")){
            coordTemp = "13";
            if(taille != 2){
                b13.setIcon(new ImageIcon("src/images_pions/p" + refPion + ".png"));
            }else{
                b13.setIcon(new ImageIcon("src/images_pions/tp" + refPion + ".png"));
            }
        }
    }//GEN-LAST:event_b13ActionPerformed

    private void b14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b14ActionPerformed
        System.out.println("b14");
        if(!coord.contains("14") && bChoix.getText().equalsIgnoreCase("Valider")){
            coordTemp = "14";
            if(taille != 2){
                b14.setIcon(new ImageIcon("src/images_pions/p" + refPion + ".png"));
            }else{
                b14.setIcon(new ImageIcon("src/images_pions/tp" + refPion + ".png"));
            }
        }
    }//GEN-LAST:event_b14ActionPerformed

    private void b15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b15ActionPerformed
        System.out.println("b15");
        if(!coord.contains("15") && bChoix.getText().equalsIgnoreCase("Valider")){
            coordTemp = "15";
            if(taille != 2){
                b15.setIcon(new ImageIcon("src/images_pions/p" + refPion + ".png"));
            }else{
                b15.setIcon(new ImageIcon("src/images_pions/tp" + refPion + ".png"));
            }
        }
    }//GEN-LAST:event_b15ActionPerformed

    private void b21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b21ActionPerformed
        System.out.println("b21");
        if(!coord.contains("21") && bChoix.getText().equalsIgnoreCase("Valider")){
            coordTemp = "21";
            if(taille != 2){
                b21.setIcon(new ImageIcon("src/images_pions/p" + refPion + ".png"));
            }else{
                b21.setIcon(new ImageIcon("src/images_pions/tp" + refPion + ".png"));
            }
        }
    }//GEN-LAST:event_b21ActionPerformed

    private void b22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b22ActionPerformed
        System.out.println("b22");
        if(!coord.contains("22") && bChoix.getText().equalsIgnoreCase("Valider")){
            coordTemp = "22";
            if(taille != 2){
                b22.setIcon(new ImageIcon("src/images_pions/p" + refPion + ".png"));
            }else{
                b22.setIcon(new ImageIcon("src/images_pions/tp" + refPion + ".png"));
            }
        }
    }//GEN-LAST:event_b22ActionPerformed

    private void b23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b23ActionPerformed
        System.out.println("b23");
        if(!coord.contains("23") && bChoix.getText().equalsIgnoreCase("Valider")){
            coordTemp = "23";
            if(taille != 2){
                b23.setIcon(new ImageIcon("src/images_pions/p" + refPion + ".png"));
            }else{
                b23.setIcon(new ImageIcon("src/images_pions/tp" + refPion + ".png"));
            }
        }
    }//GEN-LAST:event_b23ActionPerformed

    private void b24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b24ActionPerformed
        System.out.println("b24");
        if(!coord.contains("24") && bChoix.getText().equalsIgnoreCase("Valider")){
            coordTemp = "24";
            if(taille != 2){
                b24.setIcon(new ImageIcon("src/images_pions/p" + refPion + ".png"));
            }else{
                b24.setIcon(new ImageIcon("src/images_pions/tp" + refPion + ".png"));
            }
        }
    }//GEN-LAST:event_b24ActionPerformed

    private void b25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b25ActionPerformed
        System.out.println("b25");
        if(!coord.contains("25") && bChoix.getText().equalsIgnoreCase("Valider")){
            coordTemp = "25";
            if(taille != 2){
                b25.setIcon(new ImageIcon("src/images_pions/p" + refPion + ".png"));
            }else{
                b25.setIcon(new ImageIcon("src/images_pions/tp" + refPion + ".png"));
            }
        }
    }//GEN-LAST:event_b25ActionPerformed

    private void b31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b31ActionPerformed
        System.out.println("b31");
        if(!coord.contains("31") && bChoix.getText().equalsIgnoreCase("Valider")){
            coordTemp = "31";
            if(taille != 2){
                b31.setIcon(new ImageIcon("src/images_pions/p" + refPion + ".png"));
            }else{
                b31.setIcon(new ImageIcon("src/images_pions/tp" + refPion + ".png"));
            }
        }
    }//GEN-LAST:event_b31ActionPerformed

    private void b32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b32ActionPerformed
        System.out.println("b32");
        if(!coord.contains("32") && bChoix.getText().equalsIgnoreCase("Valider")){
            coordTemp = "32";
            if(taille != 2){
                b32.setIcon(new ImageIcon("src/images_pions/p" + refPion + ".png"));
            }else{
                b32.setIcon(new ImageIcon("src/images_pions/tp" + refPion + ".png"));
            }
        }
    }//GEN-LAST:event_b32ActionPerformed

    private void b33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b33ActionPerformed
        System.out.println("b33");
        if(!coord.contains("33") && bChoix.getText().equalsIgnoreCase("Valider")){
            coordTemp = "33";
            if(taille != 2){
                b33.setIcon(new ImageIcon("src/images_pions/p" + refPion + ".png"));
            }else{
                b33.setIcon(new ImageIcon("src/images_pions/tp" + refPion + ".png"));
            }
        }
    }//GEN-LAST:event_b33ActionPerformed

    private void b34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b34ActionPerformed
        System.out.println("b34");
        if(!coord.contains("34") && bChoix.getText().equalsIgnoreCase("Valider")){
            coordTemp = "34";
            if(taille != 2){
                b34.setIcon(new ImageIcon("src/images_pions/p" + refPion + ".png"));
            }else{
                b34.setIcon(new ImageIcon("src/images_pions/tp" + refPion + ".png"));
            }
        }
    }//GEN-LAST:event_b34ActionPerformed

    private void b35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b35ActionPerformed
        System.out.println("b35");
        if(!coord.contains("35") && bChoix.getText().equalsIgnoreCase("Valider")){
            coordTemp = "35";
            if(taille != 2){
                b35.setIcon(new ImageIcon("src/images_pions/p" + refPion + ".png"));
            }else{
                b35.setIcon(new ImageIcon("src/images_pions/tp" + refPion + ".png"));
            }
        }
    }//GEN-LAST:event_b35ActionPerformed

    private void b41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b41ActionPerformed
        System.out.println("b41");
        if(!coord.contains("41") && bChoix.getText().equalsIgnoreCase("Valider")){
            coordTemp = "41";
            if(taille != 2){
                b41.setIcon(new ImageIcon("src/images_pions/p" + refPion + ".png"));
            }else{
                b41.setIcon(new ImageIcon("src/images_pions/tp" + refPion + ".png"));
            }
        }
    }//GEN-LAST:event_b41ActionPerformed

    private void b42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b42ActionPerformed
        System.out.println("b42");
        if(!coord.contains("42") && bChoix.getText().equalsIgnoreCase("Valider")){
            coordTemp = "42";
            if(taille != 2){
                b42.setIcon(new ImageIcon("src/images_pions/p" + refPion + ".png"));
            }else{
                b42.setIcon(new ImageIcon("src/images_pions/tp" + refPion + ".png"));
            }
        }
    }//GEN-LAST:event_b42ActionPerformed

    private void b43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b43ActionPerformed
        System.out.println("b43");
        if(!coord.contains("43") && bChoix.getText().equalsIgnoreCase("Valider")){
//            coordTemp = "43";
            if(taille != 2){
                b43.setIcon(new ImageIcon("src/images_pions/p" + refPion + ".png"));
            }else{
                b43.setIcon(new ImageIcon("src/images_pions/tp" + refPion + ".png"));
            }
        }
    }//GEN-LAST:event_b43ActionPerformed

    private void b44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b44ActionPerformed
        System.out.println("b44");
        if(!coord.contains("44") && bChoix.getText().equalsIgnoreCase("Valider")){
            coordTemp = "44";
            if(taille != 2){
                b44.setIcon(new ImageIcon("src/images_pions/p" + refPion + ".png"));
            }else{
                b44.setIcon(new ImageIcon("src/images_pions/tp" + refPion + ".png"));
            }
        }
    }//GEN-LAST:event_b44ActionPerformed

    private void b45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b45ActionPerformed
        System.out.println("b45");
        if(!coord.contains("45") && bChoix.getText().equalsIgnoreCase("Valider")){
            coordTemp = "45";
            if(taille != 2){
                b45.setIcon(new ImageIcon("src/images_pions/p" + refPion + ".png"));
            }else{
                b45.setIcon(new ImageIcon("src/images_pions/tp" + refPion + ".png"));
            }
        }
    }//GEN-LAST:event_b45ActionPerformed

    private void b51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b51ActionPerformed
        System.out.println("b51");
        if(!coord.contains("51") && bChoix.getText().equalsIgnoreCase("Valider")){
            coordTemp = "51";
            if(taille != 2){
                b51.setIcon(new ImageIcon("src/images_pions/p" + refPion + ".png"));
            }else{
                b51.setIcon(new ImageIcon("src/images_pions/tp" + refPion + ".png"));
            }
        }
    }//GEN-LAST:event_b51ActionPerformed

    private void b52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b52ActionPerformed
        System.out.println("b52");
        if(!coord.contains("52") && bChoix.getText().equalsIgnoreCase("Valider")){
            coordTemp = "52";
            if(taille != 2){
                b52.setIcon(new ImageIcon("src/images_pions/p" + refPion + ".png"));
            }else{
                b52.setIcon(new ImageIcon("src/images_pions/tp" + refPion + ".png"));
            }
        }
    }//GEN-LAST:event_b52ActionPerformed

    private void b53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b53ActionPerformed
        System.out.println("b53");
        if(!coord.contains("53") && bChoix.getText().equalsIgnoreCase("Valider")){
            coordTemp = "53";
            if(taille != 2){
                b53.setIcon(new ImageIcon("src/images_pions/p" + refPion + ".png"));
            }else{
                b53.setIcon(new ImageIcon("src/images_pions/tp" + refPion + ".png"));
            }
        }
    }//GEN-LAST:event_b53ActionPerformed

    private void b54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b54ActionPerformed
        System.out.println("b54");
        if(!coord.contains("54") && bChoix.getText().equalsIgnoreCase("Valider")){
            coordTemp = "54";
            if(taille != 2){
                b54.setIcon(new ImageIcon("src/images_pions/p" + refPion + ".png"));
            }else{
                b54.setIcon(new ImageIcon("src/images_pions/tp" + refPion + ".png"));
            }
        }
    }//GEN-LAST:event_b54ActionPerformed

    private void b55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b55ActionPerformed
        System.out.println("b55");
        if(!coord.contains("55") && bChoix.getText().equalsIgnoreCase("Valider")){
            coordTemp = "55";
            if(taille != 2){
                b55.setIcon(new ImageIcon("src/images_pions/p" + refPion + ".png"));
            }else{
                b55.setIcon(new ImageIcon("src/images_pions/tp" + refPion + ".png"));
            }
        }
    }//GEN-LAST:event_b55ActionPerformed
    // </editor-fold>
    
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
    private javax.swing.JButton b11;
    private javax.swing.JButton b12;
    private javax.swing.JButton b13;
    private javax.swing.JButton b14;
    private javax.swing.JButton b15;
    private javax.swing.JButton b21;
    private javax.swing.JButton b22;
    private javax.swing.JButton b23;
    private javax.swing.JButton b24;
    private javax.swing.JButton b25;
    private javax.swing.JButton b31;
    private javax.swing.JButton b32;
    private javax.swing.JButton b33;
    private javax.swing.JButton b34;
    private javax.swing.JButton b35;
    private javax.swing.JButton b41;
    private javax.swing.JButton b42;
    private javax.swing.JButton b43;
    private javax.swing.JButton b44;
    private javax.swing.JButton b45;
    private javax.swing.JButton b51;
    private javax.swing.JButton b52;
    private javax.swing.JButton b53;
    private javax.swing.JButton b54;
    private javax.swing.JButton b55;
    private javax.swing.JButton bChoix;
    private javax.swing.JButton bValider;
    private javax.swing.JLabel lInstruction;
    private javax.swing.JLabel lJoueur;
    private javax.swing.JLabel lPion;
    private javax.swing.JPanel pPlateau;
    private javax.swing.JLabel pSlogan;
    // End of variables declaration//GEN-END:variables
}