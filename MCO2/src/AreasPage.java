/**
 * This class is my areas option window
 */
import javax.swing.JFrame;

public class AreasPage extends JFrame {
    /**
     * This is my default constructor
     */
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

        panel = new javax.swing.JPanel();
        AreaOne = new javax.swing.JButton();
        AreaTwo = new javax.swing.JButton();
        AreaThree = new javax.swing.JButton();
        mainmenu_button = new javax.swing.JButton();
        areaspage_gif = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(640, 480));

        panel.setPreferredSize(new java.awt.Dimension(640, 480));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AreaOne.setText("Area One");
        AreaOne.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        AreaOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AreaOneActionPerformed(evt);
            }
        });
        panel.add(AreaOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 25));

        AreaTwo.setText("Area Two");
        AreaTwo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        AreaTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AreaTwoActionPerformed(evt);
            }
        });
        panel.add(AreaTwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, 25));

        AreaThree.setText("Area Three");
        AreaThree.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        AreaThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AreaThreeActionPerformed(evt);
            }
        });
        panel.add(AreaThree, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 100, 25));

        mainmenu_button.setText("Main Menu");
        mainmenu_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mainmenu_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainmenu_buttonActionPerformed(evt);
            }
        });
        panel.add(mainmenu_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 100, 25));

        areaspage_gif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/areaspage-gif.gif"))); // NOI18N
        panel.add(areaspage_gif, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    private javax.swing.JLabel areaspage_gif;
    private javax.swing.JButton mainmenu_button;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
