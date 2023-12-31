/**
 * This class is my area one window
 */
import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class AreaOne extends javax.swing.JFrame {
    // icons
    private ImageIcon up_icon = new ImageIcon("src\\Images\\up-arrow.png");
    private ImageIcon down_icon = new ImageIcon("src\\Images\\down-arrow.png");
    private ImageIcon left_icon = new ImageIcon("src\\Images\\left-arrow.png");
    private ImageIcon right_icon = new ImageIcon("src\\Images\\right-arrow.png");
    private ImageIcon center_icon = new ImageIcon("src\\Images\\center-circle.png");
    private ImageIcon player_icon = new ImageIcon("src\\Images\\player-icon.png");
    
    // player positions
    int playerPosX = -1;
    int playerPosY = -1;
    
    // my board tiles
    JButton[][] tiles_list = new JButton[1][5];
    
    public AreaOne() {
        initAreaOne();
        
        // position the player at the starting position
        tile1.setIcon(resizeIcon(player_icon, 40, 40));
    }
    public AreaOne(int x, int y) {
        initAreaOne();
        
        // position the player
        tiles_list[x][y].setIcon(resizeIcon(player_icon, 40, 40));
    }
    
    public void initAreaOne() {
        initComponents();
        this.setTitle("Area One");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
        up_button.setIcon(resizeIcon(up_icon, 40, 40));
        down_button.setIcon(resizeIcon(down_icon, 40, 40));
        left_button.setIcon(resizeIcon(left_icon, 40, 40));
        right_button.setIcon(resizeIcon(right_icon, 40, 40));
        center_button.setIcon(resizeIcon(center_icon, 40, 40));
        
        for (Creatures creature : Creatures.owned_creatures_list) {
            if (creature.activeCreature == true) {
                pokemon_type_label.setIcon(resizeIcon(creature.creatureTypePicture, 40, 40));
                pokemon_picture_label.setIcon(resizeIcon(creature.creaturePicture, 180, 180));
                active_pokemon_label.setText(creature.creatureName);
                creature_el.setText(String.valueOf(creature.creatureEL));
            }
        }
        
        tiles_list[0][0] = tile1;
        tiles_list[0][1] = tile2;
        tiles_list[0][2] = tile3;
        tiles_list[0][3] = tile4;
        tiles_list[0][4] = tile5;
    }
    
    /**
     * 
     * @param icon
     * @param width
     * @param height
     * @return the resized image
     */
    private ImageIcon resizeIcon(ImageIcon icon, int width, int height) {
        Image image = icon.getImage();
        Image resizedImage = image.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }
    
    /**
     * 
     * @return an int: 1 for battle, 0 for no battle
     */
    private int encounterEnemy() {
        // Generate a random number between 0 and 99
        int randomChance = new Random().nextInt(100);

        // Check if the random chance is less than 40 (40% chance)
        if (randomChance < 40) {
            // encounter an enemy
            return 1;
        } else {
            // No enemy encounter
            return 0;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainmenu_button = new javax.swing.JButton();
        active_pokemon = new javax.swing.JLabel();
        active_pokemon_label = new javax.swing.JLabel();
        pokemon_panel = new javax.swing.JPanel();
        pokemon_type_label = new javax.swing.JLabel();
        pokemon_picture_label = new javax.swing.JLabel();
        board_panel = new javax.swing.JPanel();
        tile1 = new javax.swing.JButton();
        tile2 = new javax.swing.JButton();
        tile3 = new javax.swing.JButton();
        tile4 = new javax.swing.JButton();
        tile5 = new javax.swing.JButton();
        movement_panel = new javax.swing.JPanel();
        up_button = new javax.swing.JButton();
        down_button = new javax.swing.JButton();
        right_button = new javax.swing.JButton();
        left_button = new javax.swing.JButton();
        center_button = new javax.swing.JButton();
        creature_el_label = new javax.swing.JLabel();
        creature_el = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Area One");
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        mainmenu_button.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mainmenu_button.setText("Main Menu");
        mainmenu_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mainmenu_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainmenu_buttonActionPerformed(evt);
            }
        });

        active_pokemon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        active_pokemon.setText("Active Pokemon:");

        active_pokemon_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        pokemon_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pokemon_panelLayout = new javax.swing.GroupLayout(pokemon_panel);
        pokemon_panel.setLayout(pokemon_panelLayout);
        pokemon_panelLayout.setHorizontalGroup(
            pokemon_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pokemon_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pokemon_type_label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pokemon_picture_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pokemon_panelLayout.setVerticalGroup(
            pokemon_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pokemon_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pokemon_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pokemon_picture_label, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pokemon_type_label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        board_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout board_panelLayout = new javax.swing.GroupLayout(board_panel);
        board_panel.setLayout(board_panelLayout);
        board_panelLayout.setHorizontalGroup(
            board_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, board_panelLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(tile1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tile2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tile3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tile4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tile5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        board_panelLayout.setVerticalGroup(
            board_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(board_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(board_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tile5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(board_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tile4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tile3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tile2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tile1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        up_button.setBorder(null);
        up_button.setMaximumSize(new java.awt.Dimension(50, 50));
        up_button.setMinimumSize(new java.awt.Dimension(50, 50));
        up_button.setPreferredSize(new java.awt.Dimension(50, 50));

        down_button.setBorder(null);
        down_button.setMaximumSize(new java.awt.Dimension(50, 50));
        down_button.setMinimumSize(new java.awt.Dimension(50, 50));
        down_button.setPreferredSize(new java.awt.Dimension(50, 50));

        right_button.setBorder(null);
        right_button.setMaximumSize(new java.awt.Dimension(50, 50));
        right_button.setMinimumSize(new java.awt.Dimension(50, 50));
        right_button.setPreferredSize(new java.awt.Dimension(50, 50));
        right_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                right_buttonActionPerformed(evt);
            }
        });

        left_button.setBorder(null);
        left_button.setPreferredSize(new java.awt.Dimension(50, 50));
        left_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                left_buttonActionPerformed(evt);
            }
        });

        center_button.setBorder(null);
        center_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        center_button.setMaximumSize(new java.awt.Dimension(50, 50));
        center_button.setMinimumSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout movement_panelLayout = new javax.swing.GroupLayout(movement_panel);
        movement_panel.setLayout(movement_panelLayout);
        movement_panelLayout.setHorizontalGroup(
            movement_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, movement_panelLayout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(movement_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(up_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(down_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, movement_panelLayout.createSequentialGroup()
                        .addComponent(left_button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(center_button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(right_button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        movement_panelLayout.setVerticalGroup(
            movement_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(movement_panelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(up_button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(movement_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(movement_panelLayout.createSequentialGroup()
                        .addGroup(movement_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(left_button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(center_button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(down_button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(right_button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        creature_el_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        creature_el_label.setText("Evolution Level:");

        creature_el.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        creature_el.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(active_pokemon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(active_pokemon_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(pokemon_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(movement_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(mainmenu_button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(board_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(creature_el_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(creature_el)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainmenu_button)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(active_pokemon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(active_pokemon_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(creature_el_label)
                    .addComponent(creature_el))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pokemon_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(movement_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(board_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mainmenu_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainmenu_buttonActionPerformed
        dispose();
        new MainMenu();
    }//GEN-LAST:event_mainmenu_buttonActionPerformed

    private void right_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_right_buttonActionPerformed
        // Find the index of the tile with the player icon
        for (int i = 0; i < tiles_list.length; i++) {
            for (int j = 0; j < tiles_list[i].length - 1; j++) {
                if (tiles_list[i][j].getIcon() != null) {
                    playerPosX = i;
                    playerPosY = j;
                    break;
                }
            }
        }

        // Move the player icon one tile to the right if there is a tile to the right
        if (playerPosY != -1 && playerPosY + 1 < tiles_list[playerPosX].length) {
            // Remove the player icon from the current position
            tiles_list[playerPosX][playerPosY].setIcon(null);

            // Move the player icon to the right in the current row
            tiles_list[playerPosX][playerPosY + 1].setIcon(resizeIcon(player_icon, 40, 40));
            
            if (encounterEnemy() == 1) {
                // function call for battle phase
                new BattlePhase("one", playerPosX, playerPosY + 1);
                dispose();
            }
        }
    }//GEN-LAST:event_right_buttonActionPerformed

    private void left_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_left_buttonActionPerformed
        // Find the index of the tile with the player icon
        for (int i = 0; i < tiles_list.length; i++) {
            for (int j = 1; j < tiles_list[i].length; j++) {
                if (tiles_list[i][j].getIcon() != null) {
                    playerPosX = i;
                    playerPosY = j;
                    break;
                }
            }
        }

        // Move the player icon one tile to the left if there is a tile to the left
        if (playerPosY != -1 && playerPosY - 1 >= 0) {
            // Remove the player icon from the current position
            tiles_list[playerPosX][playerPosY].setIcon(null);

            // Move the player icon to the left in the current row
            tiles_list[playerPosX][playerPosY - 1].setIcon(resizeIcon(player_icon, 40, 40));
            
            if (encounterEnemy() == 1) {
                // function call for battle phase
                new BattlePhase("one", playerPosX, playerPosY - 1);
                dispose();
            }
        }
    }//GEN-LAST:event_left_buttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel active_pokemon;
    private javax.swing.JLabel active_pokemon_label;
    private javax.swing.JPanel board_panel;
    private javax.swing.JButton center_button;
    private javax.swing.JLabel creature_el;
    private javax.swing.JLabel creature_el_label;
    private javax.swing.JButton down_button;
    private javax.swing.JButton left_button;
    private javax.swing.JButton mainmenu_button;
    private javax.swing.JPanel movement_panel;
    private javax.swing.JPanel pokemon_panel;
    private javax.swing.JLabel pokemon_picture_label;
    private javax.swing.JLabel pokemon_type_label;
    private javax.swing.JButton right_button;
    private javax.swing.JButton tile1;
    private javax.swing.JButton tile2;
    private javax.swing.JButton tile3;
    private javax.swing.JButton tile4;
    private javax.swing.JButton tile5;
    private javax.swing.JButton up_button;
    // End of variables declaration//GEN-END:variables
}