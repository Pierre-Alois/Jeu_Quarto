/*
Projet Java - Jeu Quarto
BERTIN Pierre-Aloïs - CALMET Pierre - SAID Gabriel
 */
package fiches;

public class DChoixPion extends javax.swing.JDialog {
    
    private DInfos Infos;
    private int taille;
    private javax.swing.JButton[] tab;
    
       
    public DChoixPion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();         
    }
    
    public int gettaille(){
        return taille;
    }
    
    public void ChoixPion(){
        switch (Infos.tailledelagrille()) {
            case 0:
                pTaille.setVisible(false);
                pCoupe.setVisible(false);
                pJoker.setVisible(true);
                break;
            case 1:
                pTaille.setVisible(true);
                pCoupe.setVisible(false);
                pJoker.setVisible(false);
                break;
            default:
                pTaille.setVisible(true);
                pCoupe.setVisible(true);
                pJoker.setVisible(false);
                break;
        }
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
        }else {
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
        
        javax.swing.JButton tab[] = new javax.swing.JButton[33];
        tab[0] = b00000;
        tab[1] = b00001;
        tab[2] = b00010;
        tab[3] = b00011;
        tab[4] = b00100;
        tab[5] = b00101;
        tab[6] = b00110;
        tab[7] = b00111;
        tab[8] = b01000;
        tab[9] = b01001;
        tab[10] = b01010;
        tab[11] = b01011;
        tab[12] = b01100;
        tab[13] = b01101;
        tab[14] = b01110;
        tab[15] = b01111;
        tab[16] = b10000;
        tab[17] = b10001;
        tab[18] = b10010;
        tab[19] = b10011;
        tab[20] = b10100;
        tab[21] = b10101;
        tab[22] = b10110;
        tab[23] = b10111;
        tab[24] = b11000;
        tab[25] = b11001;
        tab[26] = b11010;
        tab[27] = b11011;
        tab[28] = b11100;
        tab[29] = b11101;
        tab[30] = b11110;
        tab[31] = b11111;
        tab[32] = bxxxxx;
        this.tab = tab;
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
        pTaille = new javax.swing.JPanel();
        rbPetit = new javax.swing.JRadioButton();
        rbGrand = new javax.swing.JRadioButton();
        pCoupe = new javax.swing.JPanel();
        rbEntier = new javax.swing.JRadioButton();
        rbTranché = new javax.swing.JRadioButton();
        pJoker = new javax.swing.JPanel();
        cbJoker = new javax.swing.JCheckBox();
        bPoser = new javax.swing.JButton();
        lPion = new javax.swing.JLabel();
        bReinitialiser = new javax.swing.JButton();
        spPièces = new javax.swing.JScrollPane();
        pPièces = new javax.swing.JPanel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1360, 730));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        lChoixPion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lChoixPion.setText("Choisissez un pion : ");

        bgDensité.add(rbPlein);
        rbPlein.setText("Plein");

        bgDensité.add(rbTroué);
        rbTroué.setText("Troué");

        bgCouleur.add(rbNoir);
        rbNoir.setText("Noir");

        bgCouleur.add(rbBlanc);
        rbBlanc.setText("Blanc");

        bgGeo.add(rbCarré);
        rbCarré.setText("Carré");

        bgGeo.add(rbRond);
        rbRond.setText("Rond");

        pTaille.setBackground(new java.awt.Color(255, 255, 255));

        bgTaille.add(rbPetit);
        rbPetit.setText("Petit");

        bgTaille.add(rbGrand);
        rbGrand.setSelected(true);
        rbGrand.setText("Grand");

        javax.swing.GroupLayout pTailleLayout = new javax.swing.GroupLayout(pTaille);
        pTaille.setLayout(pTailleLayout);
        pTailleLayout.setHorizontalGroup(
            pTailleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTailleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pTailleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbGrand, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbPetit, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pTailleLayout.setVerticalGroup(
            pTailleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTailleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbGrand)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbPetit)
                .addGap(30, 30, 30))
        );

        pCoupe.setBackground(new java.awt.Color(255, 255, 255));

        bgCoupe.add(rbEntier);
        rbEntier.setSelected(true);
        rbEntier.setText("Entier");

        bgCoupe.add(rbTranché);
        rbTranché.setText("Tranché");

        javax.swing.GroupLayout pCoupeLayout = new javax.swing.GroupLayout(pCoupe);
        pCoupe.setLayout(pCoupeLayout);
        pCoupeLayout.setHorizontalGroup(
            pCoupeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCoupeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCoupeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbEntier, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbTranché, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pCoupeLayout.setVerticalGroup(
            pCoupeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCoupeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbEntier)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbTranché))
        );

        pJoker.setBackground(new java.awt.Color(255, 255, 255));

        cbJoker.setText("Joker");

        javax.swing.GroupLayout pJokerLayout = new javax.swing.GroupLayout(pJoker);
        pJoker.setLayout(pJokerLayout);
        pJokerLayout.setHorizontalGroup(
            pJokerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pJokerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbJoker, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        pJokerLayout.setVerticalGroup(
            pJokerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pJokerLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(cbJoker)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        bPoser.setBackground(new java.awt.Color(0, 204, 51));
        bPoser.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        bPoser.setForeground(new java.awt.Color(255, 255, 255));
        bPoser.setText("Poser Pion");
        bPoser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPoserActionPerformed(evt);
            }
        });

        lPion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lPion.setMaximumSize(new java.awt.Dimension(208, 429));
        lPion.setMinimumSize(new java.awt.Dimension(208, 429));
        lPion.setPreferredSize(new java.awt.Dimension(208, 429));

        bReinitialiser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bReinitialiser.setText("Réinitialiser");
        bReinitialiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bReinitialiserActionPerformed(evt);
            }
        });

        spPièces.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        pPièces.setBackground(new java.awt.Color(255, 255, 255));
        pPièces.setPreferredSize(new java.awt.Dimension(950, 950));

        b00000.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p00000.png"))); // NOI18N
        b00000.setPreferredSize(new java.awt.Dimension(150, 150));
        pPièces.add(b00000);

        b00001.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p00001.png"))); // NOI18N
        b00001.setPreferredSize(new java.awt.Dimension(150, 150));
        pPièces.add(b00001);

        b00010.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p00010.png"))); // NOI18N
        b00010.setPreferredSize(new java.awt.Dimension(150, 150));
        pPièces.add(b00010);

        b00011.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p00011.png"))); // NOI18N
        b00011.setPreferredSize(new java.awt.Dimension(150, 150));
        pPièces.add(b00011);

        b00100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p00100.png"))); // NOI18N
        b00100.setPreferredSize(new java.awt.Dimension(150, 150));
        pPièces.add(b00100);

        b00101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p00101.png"))); // NOI18N
        b00101.setPreferredSize(new java.awt.Dimension(150, 150));
        pPièces.add(b00101);

        b00110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p00110.png"))); // NOI18N
        b00110.setPreferredSize(new java.awt.Dimension(150, 150));
        pPièces.add(b00110);

        b00111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p00111.png"))); // NOI18N
        b00111.setPreferredSize(new java.awt.Dimension(150, 150));
        pPièces.add(b00111);

        b01000.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p01000.png"))); // NOI18N
        b01000.setPreferredSize(new java.awt.Dimension(150, 150));
        pPièces.add(b01000);

        b01001.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p01001.png"))); // NOI18N
        b01001.setPreferredSize(new java.awt.Dimension(150, 150));
        pPièces.add(b01001);

        b01010.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p01010.png"))); // NOI18N
        b01010.setPreferredSize(new java.awt.Dimension(150, 150));
        pPièces.add(b01010);

        b01011.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p01011.png"))); // NOI18N
        b01011.setPreferredSize(new java.awt.Dimension(150, 150));
        pPièces.add(b01011);

        b01100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p01100.png"))); // NOI18N
        b01100.setPreferredSize(new java.awt.Dimension(150, 150));
        pPièces.add(b01100);

        b01101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p01101.png"))); // NOI18N
        b01101.setPreferredSize(new java.awt.Dimension(150, 150));
        pPièces.add(b01101);

        b01110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p01110.png"))); // NOI18N
        b01110.setPreferredSize(new java.awt.Dimension(150, 150));
        pPièces.add(b01110);

        b01111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p01111.png"))); // NOI18N
        b01111.setPreferredSize(new java.awt.Dimension(150, 150));
        pPièces.add(b01111);

        b10000.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p10000.png"))); // NOI18N
        b10000.setPreferredSize(new java.awt.Dimension(150, 150));
        pPièces.add(b10000);

        b10001.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p10001.png"))); // NOI18N
        b10001.setPreferredSize(new java.awt.Dimension(150, 150));
        pPièces.add(b10001);

        b10010.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p10010.png"))); // NOI18N
        b10010.setPreferredSize(new java.awt.Dimension(150, 150));
        pPièces.add(b10010);

        b10011.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p10011.png"))); // NOI18N
        b10011.setPreferredSize(new java.awt.Dimension(150, 150));
        pPièces.add(b10011);

        b10100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p10100.png"))); // NOI18N
        b10100.setPreferredSize(new java.awt.Dimension(150, 150));
        pPièces.add(b10100);

        b10101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p10101.png"))); // NOI18N
        b10101.setPreferredSize(new java.awt.Dimension(150, 150));
        pPièces.add(b10101);

        b10110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p10110.png"))); // NOI18N
        b10110.setPreferredSize(new java.awt.Dimension(150, 150));
        pPièces.add(b10110);

        b10111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p10111.png"))); // NOI18N
        b10111.setPreferredSize(new java.awt.Dimension(150, 150));
        pPièces.add(b10111);

        b11000.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p11000.png"))); // NOI18N
        b11000.setPreferredSize(new java.awt.Dimension(150, 150));
        pPièces.add(b11000);

        b11001.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p11001.png"))); // NOI18N
        b11001.setPreferredSize(new java.awt.Dimension(150, 150));
        pPièces.add(b11001);

        b11010.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p11010.png"))); // NOI18N
        b11010.setPreferredSize(new java.awt.Dimension(150, 150));
        pPièces.add(b11010);

        b11011.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p11011.png"))); // NOI18N
        b11011.setPreferredSize(new java.awt.Dimension(150, 150));
        pPièces.add(b11011);

        b11100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p11100.png"))); // NOI18N
        b11100.setPreferredSize(new java.awt.Dimension(150, 150));
        pPièces.add(b11100);

        b11101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p11101.png"))); // NOI18N
        b11101.setPreferredSize(new java.awt.Dimension(150, 150));
        pPièces.add(b11101);

        b11110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p11110.png"))); // NOI18N
        b11110.setPreferredSize(new java.awt.Dimension(150, 150));
        pPièces.add(b11110);

        b11111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/p11111.png"))); // NOI18N
        b11111.setPreferredSize(new java.awt.Dimension(150, 150));
        pPièces.add(b11111);

        bxxxxx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_pions/pxxxxx.png"))); // NOI18N
        bxxxxx.setPreferredSize(new java.awt.Dimension(150, 150));
        pPièces.add(bxxxxx);

        spPièces.setViewportView(pPièces);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
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
                                .addComponent(pTaille, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pCoupe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(pJoker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bReinitialiser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bPoser)
                        .addGap(124, 124, 124))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(spPièces, javax.swing.GroupLayout.PREFERRED_SIZE, 972, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                        .addComponent(lPion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(bPoser)
                .addGap(47, 47, 47)
                .addComponent(lPion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lChoixPion)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pTaille, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
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
                            .addComponent(pCoupe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pJoker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(bReinitialiser)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(spPièces, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bPoserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPoserActionPerformed
        FJeu poser = new FJeu();
        poser.setVisible(true);
    }//GEN-LAST:event_bPoserActionPerformed

    private void bReinitialiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bReinitialiserActionPerformed
        // En cliquant sur ce bouton, on décoche tous les autres boutons, ce qui affiche ainsi toutes les pièces.
        rbBlanc.setSelected(false);
        rbNoir.setSelected(false);
        rbCarré.setSelected(false);
        rbRond.setSelected(false);
        rbPlein.setSelected(false);
        rbTroué.setSelected(false);
        cbJoker.setSelected(false);
        rbPetit.setSelected(false);
        rbTranché.setSelected(false);
        if(Infos.tailledelagrille()>0){
            rbGrand.setSelected(false);
            if(Infos.tailledelagrille()==2){
                rbEntier.setSelected(false);
            }
        }
    }//GEN-LAST:event_bReinitialiserActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        for(int i=0;i>33;i++){
            tab[i].setVisible(true);
        }
        if(!cbJoker.isSelected())
            tab[32].setVisible(false);
        
        if(rbBlanc.isSelected()){
            for(int i=1;i<=31;i+=2)
                tab[i].setVisible(false);
            
        }else if(rbNoir.isSelected()){
            for(int i=0;i<31;i+=2)
                tab[i].setVisible(false);
            
        }
        if(rbCarré.isSelected()){
            for(int i=2;i<32;i+=4){
                tab[i].setVisible(false);
                tab[i+1].setVisible(false);
            }
        }else if(rbRond.isSelected()){
            for(int i=0;i<32;i+=4){
                tab[i].setVisible(false);
                tab[i+1].setVisible(false);
            }
        }
        if(rbPlein.isSelected()){
            for(int i=4;i<32;i+=8){
                for(int j=0;j<5;j++)
                    tab[i+j].setVisible(false);
            }
        }else if(rbTroué.isSelected()){
            for(int i=0;i<32;i+=8){
                for(int j=0;j<5;j++)
                    tab[i+j].setVisible(false);
            }
        }
        if(rbGrand.isSelected()){
            for(int i=8;i<16;i++)
                tab[i].setVisible(false);
            for(int i=24;i<32;i++)
                tab[i].setVisible(false);
        }else if(rbPetit.isSelected()){
            for(int i=0;i<8;i++)
                tab[i].setVisible(false);
            for(int i=16;i<24;i++)
                tab[i].setVisible(false);
        }
        if(rbEntier.isSelected()){
            for(int i=31;i>15;i--)
                tab[i].setVisible(false);
        }else if(rbTranché.isSelected()){
            for(int i=0;i<16;i++)
                tab[i].setVisible(false);
        }
    }//GEN-LAST:event_formMouseClicked

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
    private javax.swing.JButton bReinitialiser;
    private javax.swing.ButtonGroup bgCouleur;
    private javax.swing.ButtonGroup bgCoupe;
    private javax.swing.ButtonGroup bgDensité;
    private javax.swing.ButtonGroup bgGeo;
    private javax.swing.ButtonGroup bgTaille;
    private javax.swing.JButton bxxxxx;
    private javax.swing.JCheckBox cbJoker;
    private javax.swing.JLabel lChoixPion;
    private javax.swing.JLabel lPion;
    private javax.swing.JPanel pCoupe;
    private javax.swing.JPanel pJoker;
    private javax.swing.JPanel pPièces;
    private javax.swing.JPanel pTaille;
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
    private javax.swing.JScrollPane spPièces;
    // End of variables declaration//GEN-END:variables
}
