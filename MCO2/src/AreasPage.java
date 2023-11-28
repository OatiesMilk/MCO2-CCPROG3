import javax.swing.JFrame;

public class AreasPage extends JFrame {
    public AreasPage() {
        initComponents();
        this.setTitle("Area Options");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AreaOne = new javax.swing.JButton();
        AreaTwo = new javax.swing.JButton();
        AreaThree = new javax.swing.JButton();
        mainmenu_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(300, 300));
        setResizable(false);
        setSize(new java.awt.Dimension(300, 300));

        AreaOne.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AreaOne.setText("Area One");
        AreaOne.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        AreaOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AreaOneActionPerformed(evt);
            }
        });

        AreaTwo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AreaTwo.setText("Area Two");
        AreaTwo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        AreaTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AreaTwoActionPerformed(evt);
            }
        });

        AreaThree.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AreaThree.setText("Area Three");
        AreaThree.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        AreaThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AreaThreeActionPerformed(evt);
            }
        });

        mainmenu_button.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mainmenu_button.setText("Main Menu");
        mainmenu_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mainmenu_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainmenu_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mainmenu_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AreaOne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AreaTwo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AreaThree, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AreaOne)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AreaTwo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AreaThree)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                .addComponent(mainmenu_button)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AreaTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AreaTwoActionPerformed
        dispose();
        new AreaTwo();
    }//GEN-LAST:event_AreaTwoActionPerformed

    private void AreaOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AreaOneActionPerformed
        dispose();
        new AreaOne();
    }//GEN-LAST:event_AreaOneActionPerformed

    private void AreaThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AreaThreeActionPerformed
        dispose();
        new AreaThree();
    }//GEN-LAST:event_AreaThreeActionPerformed

    private void mainmenu_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainmenu_buttonActionPerformed
        dispose();
        new MainMenu();
    }//GEN-LAST:event_mainmenu_buttonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AreaOne;
    private javax.swing.JButton AreaThree;
    private javax.swing.JButton AreaTwo;
    private javax.swing.JButton mainmenu_button;
    // End of variables declaration//GEN-END:variables
}
