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
            if (creature.activeCreature == true) {
                pokemon_type_label.setIcon(resizeIcon(creature.creatureTypePicture, 50, 50));
                pokemon_picture_label.setIcon(resizeIcon(creature.creaturePicture, 200, 200));
                family_label.setText(creature.creatureFamily);
                type_label.setText(creature.creatureType);
                creature_el.setText(String.valueOf(creature.creatureEL));
            }
            
            // add the names of each creature (creature.creatureName) to the comboBox options
            comboBox.addItem(creature.creatureName);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboBox = new javax.swing.JComboBox<>();
        panel = new javax.swing.JPanel();
        pokemon_type_label = new javax.swing.JLabel();
        familyLabel = new javax.swing.JLabel();
        family_label = new javax.swing.JLabel();
        pokemon_picture_label = new javax.swing.JLabel();
        typeLabel = new javax.swing.JLabel();
        type_label = new javax.swing.JLabel();
        mainmenuButton = new javax.swing.JButton();
        creature_el_label = new javax.swing.JLabel();
        creature_el = new javax.swing.JLabel();
        active_pokemon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(600, 600));

        comboBox.setModel(comboBox.getModel());
        comboBox.setSelectedItem(comboBox.getSelectedItem());
        comboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        comboBox.setKeySelectionManager(null);
        comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxActionPerformed(evt);
            }
        });

        panel.setPreferredSize(new java.awt.Dimension(500, 500));

        pokemon_type_label.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        familyLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        familyLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        familyLabel.setText("Family:");

        family_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        family_label.setLabelFor(family_label);

        pokemon_picture_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pokemon_picture_label.setIcon(pokemon_picture_label.getIcon());

        typeLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        typeLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        typeLabel.setText("Type:");

        type_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        mainmenuButton.setText("Main Menu");
        mainmenuButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mainmenuButton.setMaximumSize(new java.awt.Dimension(63, 22));
        mainmenuButton.setPreferredSize(new java.awt.Dimension(63, 22));
        mainmenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainmenuButtonActionPerformed(evt);
            }
        });

        creature_el_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        creature_el_label.setText("EL:");

        creature_el.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainmenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(pokemon_picture_label, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pokemon_type_label, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(familyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(typeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(family_label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(creature_el_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(creature_el, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(type_label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pokemon_type_label, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(familyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(family_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(creature_el_label)
                                .addComponent(creature_el, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(typeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(type_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(pokemon_picture_label, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mainmenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        active_pokemon.setText("Set as Active Pokemon");
        active_pokemon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        active_pokemon.setPreferredSize(new java.awt.Dimension(80, 22));
        active_pokemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                active_pokemonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(active_pokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboBox)
                    .addComponent(active_pokemon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                .addContainerGap())
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
    private javax.swing.JLabel creature_el;
    private javax.swing.JLabel creature_el_label;
    private javax.swing.JLabel familyLabel;
    private javax.swing.JLabel family_label;
    private javax.swing.JButton mainmenuButton;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel pokemon_picture_label;
    private javax.swing.JLabel pokemon_type_label;
    private javax.swing.JLabel typeLabel;
    private javax.swing.JLabel type_label;
    // End of variables declaration//GEN-END:variables
}
