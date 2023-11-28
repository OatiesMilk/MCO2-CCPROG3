import javax.swing.JFrame;

public class MainMenu extends JFrame {
    public MainMenu() {
        initComponents();
        this.setTitle("Main Menu");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        inventoryButton = new javax.swing.JButton();
        areasButton = new javax.swing.JButton();
        evolutionButton = new javax.swing.JButton();
        mainmenu_gif = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(463, 392));

        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inventoryButton.setText("Inventory");
        inventoryButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        inventoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventoryButtonActionPerformed(evt);
            }
        });
        panel.add(inventoryButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 100, 25));

        areasButton.setText("Areas");
        areasButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        areasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areasButtonActionPerformed(evt);
            }
        });
        panel.add(areasButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 37, 100, 25));

        evolutionButton.setText("Evolution");
        evolutionButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        evolutionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evolutionButtonActionPerformed(evt);
            }
        });
        panel.add(evolutionButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 68, 100, 25));

        mainmenu_gif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mainmenu-gif.gif"))); // NOI18N
        panel.add(mainmenu_gif, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 463, 392));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inventoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventoryButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        new InventoryPage();
    }//GEN-LAST:event_inventoryButtonActionPerformed

    private void evolutionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evolutionButtonActionPerformed
        dispose();
        new EvolutionPage();
    }//GEN-LAST:event_evolutionButtonActionPerformed

    private void areasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areasButtonActionPerformed
        dispose();
        new AreasPage();
    }//GEN-LAST:event_areasButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton areasButton;
    private javax.swing.JButton evolutionButton;
    private javax.swing.JButton inventoryButton;
    private javax.swing.JLabel mainmenu_gif;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
