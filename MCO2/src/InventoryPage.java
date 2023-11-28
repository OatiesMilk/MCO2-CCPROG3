import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class InventoryPage extends JFrame {
    public InventoryPage() {
        initComponents();
        this.setTitle("Inventory");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
        for (Creatures creature : Creatures.owned_creatures_list) {
            // add the names of each creature (creature.creatureName) to the comboBox options
            comboBox.addItem(creature.creatureName);
            
            if (creature.activeCreature == true) {
                pokemon_type_label.setIcon(resizeIcon(creature.creatureTypePicture, 50, 50));
                pokemon_picture_label.setIcon(resizeIcon(creature.creaturePicture, 210, 210));
                family_label.setText(creature.creatureFamily);
                type_label.setText(creature.creatureType);
                creature_el.setText(String.valueOf(creature.creatureEL));
                creature_count.setText(String.valueOf(creature.creatureCount));
                comboBox.setSelectedItem(creature.creatureName);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        info_panel = new javax.swing.JPanel();
        familyLabel = new javax.swing.JLabel();
        family_label = new javax.swing.JLabel();
        typeLabel = new javax.swing.JLabel();
        type_label = new javax.swing.JLabel();
        creature_el_label = new javax.swing.JLabel();
        creature_el = new javax.swing.JLabel();
        creature_count_label = new javax.swing.JLabel();
        creature_count = new javax.swing.JLabel();
        pokemon_picture_label = new javax.swing.JLabel();
        mainmenuButton = new javax.swing.JButton();
        comboBox = new javax.swing.JComboBox<>();
        active_pokemon = new javax.swing.JButton();
        pokemon_type_label = new javax.swing.JLabel();
        inventory_gif = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(285, 498));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 600));

        panel.setPreferredSize(new java.awt.Dimension(500, 500));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        info_panel.setBackground(new java.awt.Color(153, 204, 255));
        info_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        info_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        familyLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        familyLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        familyLabel.setText("Family:");
        info_panel.add(familyLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        family_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        family_label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        family_label.setLabelFor(family_label);
        info_panel.add(family_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 50, 20));

        typeLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        typeLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        typeLabel.setText("Type:");
        info_panel.add(typeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 20));

        type_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        type_label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        info_panel.add(type_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 60, 20));

        creature_el_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        creature_el_label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        creature_el_label.setText("EL:");
        info_panel.add(creature_el_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 20, -1));

        creature_el.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        creature_el.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        info_panel.add(creature_el, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 20, 20));

        creature_count_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        creature_count_label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        creature_count_label.setText("Count:");
        info_panel.add(creature_count_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 20));

        creature_count.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        creature_count.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        info_panel.add(creature_count, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 20, 20));

        panel.add(info_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 120, 100));

        pokemon_picture_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pokemon_picture_label.setIcon(pokemon_picture_label.getIcon());
        panel.add(pokemon_picture_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 210, 210));

        mainmenuButton.setText("Main Menu");
        mainmenuButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mainmenuButton.setMaximumSize(new java.awt.Dimension(63, 22));
        mainmenuButton.setPreferredSize(new java.awt.Dimension(63, 22));
        mainmenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainmenuButtonActionPerformed(evt);
            }
        });
        panel.add(mainmenuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 75, -1));

        comboBox.setModel(comboBox.getModel());
        comboBox.setSelectedItem(comboBox.getSelectedItem());
        comboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        comboBox.setKeySelectionManager(null);
        comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxActionPerformed(evt);
            }
        });
        panel.add(comboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 25));

        active_pokemon.setText("Activate");
        active_pokemon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        active_pokemon.setPreferredSize(new java.awt.Dimension(80, 22));
        active_pokemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                active_pokemonActionPerformed(evt);
            }
        });
        panel.add(active_pokemon, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 120, 25));

        pokemon_type_label.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel.add(pokemon_type_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 50, 50));

        inventory_gif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/inventory-gif.gif"))); // NOI18N
        panel.add(inventory_gif, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 269, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Method to resize ImageIcon
    private ImageIcon resizeIcon(ImageIcon icon, int width, int height) {
        Image image = icon.getImage();
        Image resizedImage = image.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }
    
    private void mainmenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainmenuButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        new MainMenu();
    }//GEN-LAST:event_mainmenuButtonActionPerformed

    private void comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxActionPerformed
        String selected_pokemon = (String) comboBox.getSelectedItem();
        
        for (Creatures creature : Creatures.owned_creatures_list) {
            if (creature.creatureName.equalsIgnoreCase(selected_pokemon)) {
                pokemon_type_label.setIcon(resizeIcon(creature.creatureTypePicture, 50, 50));
                pokemon_picture_label.setIcon(resizeIcon(creature.creaturePicture, 200, 200));
                creature_el.setText(String.valueOf(creature.creatureEL));
                family_label.setText(creature.creatureFamily);
                creature_count.setText(String.valueOf(creature.creatureCount));
            }
        }
    }//GEN-LAST:event_comboBoxActionPerformed

    private void active_pokemonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_active_pokemonActionPerformed
        String selected_pokemon = (String) comboBox.getSelectedItem();
        
        // Deactivate all creatures
        for (Creatures creature : Creatures.owned_creatures_list) {
            creature.setActiveCreature(false);
        }
        
        for (int i = 0; i < Creatures.owned_creatures_list.size(); i++) {
            if (selected_pokemon.equalsIgnoreCase(Creatures.owned_creatures_list.get(i).creatureName)) {
                // activate the selected pokemon
                Creatures.owned_creatures_list.get(i).activeCreature = true;
                break;
            }
        }
    }//GEN-LAST:event_active_pokemonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton active_pokemon;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JLabel creature_count;
    private javax.swing.JLabel creature_count_label;
    private javax.swing.JLabel creature_el;
    private javax.swing.JLabel creature_el_label;
    private javax.swing.JLabel familyLabel;
    private javax.swing.JLabel family_label;
    private javax.swing.JPanel info_panel;
    private javax.swing.JLabel inventory_gif;
    private javax.swing.JButton mainmenuButton;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel pokemon_picture_label;
    private javax.swing.JLabel pokemon_type_label;
    private javax.swing.JLabel typeLabel;
    private javax.swing.JLabel type_label;
    // End of variables declaration//GEN-END:variables
}
