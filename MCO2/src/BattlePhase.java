import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.Timer;

public class BattlePhase extends javax.swing.JFrame {
    // icons
    private ImageIcon attack_icon = new ImageIcon("src\\Images\\attack-icon.png");
    private ImageIcon swap_icon = new ImageIcon("src\\Images\\swap-icon.png");
    private ImageIcon run_icon = new ImageIcon("src\\Images\\run-icon.png");
    private ImageIcon capture_icon = new ImageIcon("src\\Images\\capture-icon.png");
    private ImageIcon health_icon = new ImageIcon("src\\Images\\health-icon.png");
    
    private ArrayList<Creatures> enemy_list_one = new ArrayList<>();
    private ArrayList<Creatures> enemy_list_two = new ArrayList<>();
    private ArrayList<Creatures> enemy_list_three = new ArrayList<>();
    
    private String area;
    private int playerPosX;
    private int playerPosY;
    
    private Creatures enemy;
    private int enemyHealth = 50;
    private int enemyRandomIndex;
    private int actionCounter = 3;
    
    public BattlePhase(int x, int y) {
        this.area = "one";
        this. playerPosX = x;
        this.playerPosY = y;
        initBattlePhase();
        activeCreatureDetails();
    }
    
    public BattlePhase(AreaTwo areaTwo, int x, int y) {
        this.area = "two";
        this. playerPosX = x;
        this.playerPosY = y;
        initBattlePhase();
        activeCreatureDetails();
    }
    public BattlePhase(AreaThree areaThree, int x, int y) {
        this.area = "three";
        this. playerPosX = x;
        this.playerPosY = y;
        initBattlePhase();
        activeCreatureDetails();
    }
    
    public final void initBattlePhase() {
        initComponents();
        this.setTitle("Battle Phase");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
        attack_button.setIcon(resizeIcon(attack_icon, 40, 40));
        swap_button.setIcon(resizeIcon(swap_icon, 20, 15));
        run_button.setIcon(resizeIcon(run_icon, 50, 50));
        capture_button.setIcon(resizeIcon(capture_icon, 35, 35));
        
        // adding the swap options
        for (Creatures swap_creature : Creatures.owned_creatures_list) {
            // add the names of each creature (swap_creature.creatureName) to the comboBox options
            comboBox.addItem(swap_creature.creatureName);
            
            if (swap_creature.activeCreature == true) {
                comboBox.setSelectedItem(swap_creature.creatureName);
            }
        }
        
        // initializing the health bar
        enemy_health_bar.setValue(enemyHealth);
        enemy_health_icon.setIcon(resizeIcon(health_icon, 50, 50));
        
        for (Creatures enemy : Creatures.creatures_list) {
            if (enemy.creatureEL == 1) {
                enemy_list_one.add(enemy);
            } 
            
            if (enemy.creatureEL == 1 || enemy.creatureEL == 2) {
                enemy_list_two.add(enemy);
            }
            
            if (enemy.creatureEL == 1 || enemy.creatureEL == 2 || enemy.creatureEL == 3) {
                enemy_list_three.add(enemy);
            }
        }
        
        if (area.equalsIgnoreCase("one")) {
            enemyRandomIndex = new Random().nextInt(enemy_list_one.size());
            enemy = enemy_list_one.get(enemyRandomIndex);
        } else if (area.equalsIgnoreCase("two")) {
            this.enemyRandomIndex = new Random().nextInt(enemy_list_two.size());
            enemy = enemy_list_two.get(enemyRandomIndex);
        } else if (area.equalsIgnoreCase("three")) {
            this.enemyRandomIndex = new Random().nextInt(enemy_list_three.size());
            enemy = enemy_list_three.get(enemyRandomIndex);
        }
        
        enemy_picture.setIcon(resizeIcon(enemy.creaturePicture, 200, 200));
        enemy_type_icon.setIcon(resizeIcon(enemy.creatureTypePicture, 50, 50));
        enemy_name.setText(enemy.creatureName);
        enemy_el.setText(String.valueOf(enemy.creatureEL));
        swap_status_label.setText("");
    }
    
    private void activeCreatureDetails() {
        for (Creatures creature : Creatures.owned_creatures_list) {
            if (creature.activeCreature == true) {
                creature_type_icon.setIcon(resizeIcon(creature.creatureTypePicture, 50, 50));
                creature_name.setText(creature.creatureName);
                creature_el.setText(String.valueOf(creature.creatureEL));
            }
        }
    }
    
    private void updateHealth() {
        enemy_health_bar.setValue(enemyHealth);
    }
    
    // method to resize ImageIcon
    private ImageIcon resizeIcon(ImageIcon icon, int width, int height) {
        Image image = icon.getImage();
        Image resizedImage = image.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        creature_info_panel = new javax.swing.JPanel();
        creature_type_icon = new javax.swing.JLabel();
        creature_name_label = new javax.swing.JLabel();
        creature_el_label = new javax.swing.JLabel();
        creature_name = new javax.swing.JLabel();
        creature_el = new javax.swing.JLabel();
        comboBox = new javax.swing.JComboBox<>();
        swap_button = new javax.swing.JButton();
        attack_button = new javax.swing.JButton();
        capture_button = new javax.swing.JButton();
        run_button = new javax.swing.JButton();
        swap_status_label = new javax.swing.JLabel();
        battle_panel = new javax.swing.JPanel();
        enemy_picture = new javax.swing.JLabel();
        enemy_health_bar = new javax.swing.JProgressBar();
        enemy_health_icon = new javax.swing.JLabel();
        enemy_type_icon = new javax.swing.JLabel();
        enemy_name_label = new javax.swing.JLabel();
        enemy_name = new javax.swing.JLabel();
        enemy_el_label = new javax.swing.JLabel();
        enemy_el = new javax.swing.JLabel();
        damage_label = new javax.swing.JLabel();
        capture_label = new javax.swing.JLabel();
        action_label = new javax.swing.JLabel();
        action_counter = new javax.swing.JLabel();
        enemy_runs_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        creature_name_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        creature_name_label.setText("Name:");

        creature_el_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        creature_el_label.setText("Evolution Level:");

        creature_name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        creature_name.setText("NAME");

        creature_el.setText("EL");

        comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxActionPerformed(evt);
            }
        });

        swap_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                swap_buttonActionPerformed(evt);
            }
        });

        attack_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attack_buttonActionPerformed(evt);
            }
        });

        capture_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capture_buttonActionPerformed(evt);
            }
        });

        run_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                run_buttonActionPerformed(evt);
            }
        });

        swap_status_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        swap_status_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        swap_status_label.setPreferredSize(new java.awt.Dimension(50, 20));

        javax.swing.GroupLayout creature_info_panelLayout = new javax.swing.GroupLayout(creature_info_panel);
        creature_info_panel.setLayout(creature_info_panelLayout);
        creature_info_panelLayout.setHorizontalGroup(
            creature_info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(creature_info_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(creature_type_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(creature_info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(creature_info_panelLayout.createSequentialGroup()
                        .addComponent(creature_name_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(creature_name, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(creature_info_panelLayout.createSequentialGroup()
                        .addComponent(creature_el_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(creature_el, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(creature_info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(swap_status_label, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(swap_button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(attack_button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(capture_button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(run_button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        creature_info_panelLayout.setVerticalGroup(
            creature_info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(creature_info_panelLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(creature_info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(run_button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(capture_button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(attack_button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(creature_info_panelLayout.createSequentialGroup()
                        .addGroup(creature_info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(swap_button, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(creature_info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(creature_name_label)
                                .addComponent(creature_name)
                                .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(creature_info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(swap_status_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(creature_info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(creature_el_label)
                                .addComponent(creature_el))))
                    .addComponent(creature_type_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        battle_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        enemy_picture.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        enemy_health_bar.setBackground(new java.awt.Color(153, 153, 153));
        enemy_health_bar.setForeground(new java.awt.Color(255, 51, 51));
        enemy_health_bar.setMaximum(50);
        enemy_health_bar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        enemy_health_bar.setBorderPainted(false);
        enemy_health_bar.setOpaque(true);

        enemy_name_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        enemy_name_label.setText("Name:");

        enemy_name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        enemy_name.setText("NAME");

        enemy_el_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        enemy_el_label.setText("Evolution Level:");

        enemy_el.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        enemy_el.setText("EL");

        damage_label.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        damage_label.setPreferredSize(new java.awt.Dimension(50, 50));

        capture_label.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        capture_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        capture_label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        capture_label.setPreferredSize(new java.awt.Dimension(200, 25));

        action_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        action_label.setText("Action Counter:");

        action_counter.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        action_counter.setText("3");

        enemy_runs_label.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        enemy_runs_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enemy_runs_label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout battle_panelLayout = new javax.swing.GroupLayout(battle_panel);
        battle_panel.setLayout(battle_panelLayout);
        battle_panelLayout.setHorizontalGroup(
            battle_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, battle_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(battle_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(capture_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enemy_picture, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enemy_runs_label, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(battle_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(battle_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, battle_panelLayout.createSequentialGroup()
                        .addComponent(enemy_type_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(battle_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(battle_panelLayout.createSequentialGroup()
                                .addComponent(enemy_el_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(enemy_el, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(battle_panelLayout.createSequentialGroup()
                                .addComponent(enemy_name_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(enemy_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(25, 25, 25)))
                        .addGap(91, 91, 91)
                        .addComponent(enemy_health_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(battle_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enemy_health_bar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(damage_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))
                    .addGroup(battle_panelLayout.createSequentialGroup()
                        .addComponent(action_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(action_counter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(214, 214, 214))))
        );
        battle_panelLayout.setVerticalGroup(
            battle_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, battle_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(battle_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(battle_panelLayout.createSequentialGroup()
                        .addGroup(battle_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enemy_name_label)
                            .addComponent(enemy_name))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(battle_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enemy_el_label)
                            .addComponent(enemy_el)))
                    .addComponent(enemy_type_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enemy_health_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(battle_panelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(enemy_health_bar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(damage_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(enemy_runs_label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(capture_label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enemy_picture, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(battle_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(action_label)
                    .addComponent(action_counter))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(battle_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(creature_info_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(battle_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(creature_info_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxActionPerformed
        String selected_pokemon = (String) comboBox.getSelectedItem();

        for (Creatures creature : Creatures.owned_creatures_list) {
            if (creature.creatureName.equalsIgnoreCase(selected_pokemon)) {
                creature_type_icon.setIcon(resizeIcon(creature.creatureTypePicture, 50, 50));
                creature_name.setText(creature.creatureName);
                creature_el.setText(String.valueOf(creature.creatureEL));
            }
        }
    }//GEN-LAST:event_comboBoxActionPerformed

    private void swap_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_swap_buttonActionPerformed
        String selected_pokemon = (String) comboBox.getSelectedItem();
        swap_status_label.setText("Creature swapped!");
        Timer timer1 = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                swap_status_label.setText("");
            }
        });
        timer1.setRepeats(false);
        timer1.start();

        if (actionCounter > 0) {
            // Deactivate all creatures
            for (Creatures creature : Creatures.owned_creatures_list) {
                creature.setActiveCreature(false);
            }
            
            for (Creatures creature : Creatures.owned_creatures_list) {
                if (selected_pokemon.equalsIgnoreCase(creature.creatureName)) {
                    creature.setActiveCreature(true);
                    creature_type_icon.setIcon(resizeIcon(creature.creatureTypePicture, 50, 50));
                    creature_name.setText(creature.creatureName);
                    creature_el.setText(String.valueOf(creature.creatureEL));
                }
            }
            actionCounter -= 1;
            action_counter.setText(String.valueOf(actionCounter));

            if (actionCounter == 0) {
                action_counter.setText("No more actions left!");
                enemy_runs_label.setText("Enemy running away!");

                Timer timer = new Timer(2000, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (area.equalsIgnoreCase("one")) {
                            new AreaOne(playerPosX, playerPosY);
                        } else if (area.equalsIgnoreCase("two")) {
                            new AreaTwo(playerPosX, playerPosY);
                        } else if (area.equalsIgnoreCase("three")) {
                            new AreaThree(playerPosX, playerPosY);
                        }

                        dispose();
                    }
                });
                timer.setRepeats(false);
                timer.start();
            }
        }
    }//GEN-LAST:event_swap_buttonActionPerformed

    private void attack_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attack_buttonActionPerformed
        int randomNum = 0;

        if (actionCounter > 0) {
            for (Creatures creature : Creatures.owned_creatures_list) {
                if (creature.activeCreature == true) {
                    randomNum = (new Random().nextInt(10) + 1) * creature.creatureEL;

                    if (enemy.creatureType.equalsIgnoreCase("fire")) {
                        if (creature.creatureType.equalsIgnoreCase("water")) {
                            randomNum *= 1.5;
                        }
                    } else if (enemy.creatureType.equalsIgnoreCase("water")) {
                        if (creature.creatureType.equalsIgnoreCase("grass")) {
                            randomNum *= 1.5;
                        }
                    } else if (enemy.creatureType.equalsIgnoreCase("grass")) {
                        if (creature.creatureType.equalsIgnoreCase("fire")) {
                            randomNum *= 1.5;
                        }
                    }
                    break;
                }
            }

            enemyHealth -= randomNum;
            damage_label.setText("- " + String.valueOf(randomNum));
            updateHealth();
            actionCounter -= 1;
            action_counter.setText(String.valueOf(actionCounter));

            // make the damage_label not visible after a delay
            Timer timer = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    damage_label.setText("");
                }
            });
            timer.setRepeats(false);
            timer.start();

            if (enemyHealth <= 0 || actionCounter == 0) {
                if (enemyHealth <= 0 && actionCounter >= 0) {
                    if (area.equalsIgnoreCase("one")) {
                        enemy_runs_label.setText("You killed the enemy!");

                        Timer timer1 = new Timer(1000, new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                new AreaOne(playerPosX, playerPosY);
                                dispose();
                            }
                        });
                        timer1.setRepeats(false);
                        timer1.start();

                    } else if (area.equalsIgnoreCase("two")) {
                        enemy_runs_label.setText("You killed the enemy!");

                        Timer timer1 = new Timer(1000, new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                new AreaTwo(playerPosX, playerPosY);
                                dispose();
                            }
                        });
                        timer1.setRepeats(false);
                        timer1.start();

                    } else if (area.equalsIgnoreCase("three")) {
                        enemy_runs_label.setText("You killed the enemy!");

                        Timer timer1 = new Timer(1000, new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                new AreaThree(playerPosX, playerPosY);
                                dispose();
                            }
                        });
                        timer1.setRepeats(false);
                        timer1.start();
                    }
                    
                } else if (actionCounter == 0 && enemyHealth > 0) {
                    enemy_runs_label.setText("Enemy running away!");

                    Timer timer1 = new Timer(2000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if (area.equalsIgnoreCase("one")) {
                                new AreaOne(playerPosX, playerPosY);
                            } else if (area.equalsIgnoreCase("two")) {
                                new AreaTwo(playerPosX, playerPosY);
                            } else if (area.equalsIgnoreCase("three")) {
                                new AreaThree(playerPosX, playerPosY);
                            }

                            dispose();
                        }
                    });
                    timer1.setRepeats(false);
                    timer1.start();
                }
            }
        }
    }//GEN-LAST:event_attack_buttonActionPerformed

    private void capture_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capture_buttonActionPerformed
        boolean captureResult;
        boolean creatureFound = false;
        int chance = 40 + 50 - enemyHealth;
        int randomNum = new Random().nextInt(100);
        
        if (actionCounter > 0) {
            actionCounter -= 1;
            action_counter.setText(String.valueOf(actionCounter));
            
            if (randomNum < chance) {
                // add the captured enemy to your owned creatures list
                
                for (Creatures creature : Creatures.owned_creatures_list) {
                    if (enemy.creatureName.equalsIgnoreCase(creature.creatureName)) {
                        creature.creatureCount += 1;
                        creatureFound = true;
                        break;
                    }
                }
                
                if (!creatureFound) {
                    Creatures.owned_creatures_list.add(enemy);
                }
                
                captureResult = true;
            } else {
                captureResult = false;
            }

            if (captureResult == true || actionCounter >= 0) {
                if ((actionCounter == 0) == true && captureResult == false) {
                    capture_label.setText("Capture Failed!");
                    action_counter.setText("No more actions left!");
                    enemy_runs_label.setText("Enemy running away!");
                } else if ((actionCounter == 0) == true && captureResult == true) {
                    action_counter.setText("No more actions left!");
                    capture_label.setText("Capture Success!");
                } else if (captureResult == false) {
                    capture_label.setText("Capture Failed!");
                    Timer timer = new Timer(1000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            capture_label.setText("");
                        }
                    });
                    timer.setRepeats(false);
                    timer.start();
                } else if (captureResult == true) {
                    capture_label.setText("Capture Success!");
                }
                
                if (captureResult == true || actionCounter == 0) {
                    // start a timer to see the capture result before exiting the battle phase
                    Timer timer = new Timer(1000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if (area.equalsIgnoreCase("one")) {
                                new AreaOne(playerPosX, playerPosY);
                            } else if (area.equalsIgnoreCase("two")) {
                                new AreaTwo(playerPosX, playerPosY);
                            } else if (area.equalsIgnoreCase("three")) {
                                new AreaThree(playerPosX, playerPosY);
                            }

                            dispose();
                        }
                    });
                    timer.setRepeats(false);
                    timer.start();
                }
            }
        }
    }//GEN-LAST:event_capture_buttonActionPerformed

    private void run_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_run_buttonActionPerformed
        if (area.equalsIgnoreCase("one")) {
            new AreaOne(playerPosX, playerPosY);
        } else if (area.equalsIgnoreCase("two")) {
            new AreaTwo(playerPosX, playerPosY);
        } else if (area.equalsIgnoreCase("three")) {
            new AreaThree(playerPosX, playerPosY);
        }

        dispose();
    }//GEN-LAST:event_run_buttonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel action_counter;
    private javax.swing.JLabel action_label;
    private javax.swing.JButton attack_button;
    private javax.swing.JPanel battle_panel;
    private javax.swing.JButton capture_button;
    private javax.swing.JLabel capture_label;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JLabel creature_el;
    private javax.swing.JLabel creature_el_label;
    private javax.swing.JPanel creature_info_panel;
    private javax.swing.JLabel creature_name;
    private javax.swing.JLabel creature_name_label;
    private javax.swing.JLabel creature_type_icon;
    private javax.swing.JLabel damage_label;
    private javax.swing.JLabel enemy_el;
    private javax.swing.JLabel enemy_el_label;
    private javax.swing.JProgressBar enemy_health_bar;
    private javax.swing.JLabel enemy_health_icon;
    private javax.swing.JLabel enemy_name;
    private javax.swing.JLabel enemy_name_label;
    private javax.swing.JLabel enemy_picture;
    private javax.swing.JLabel enemy_runs_label;
    private javax.swing.JLabel enemy_type_icon;
    private javax.swing.JButton run_button;
    private javax.swing.JButton swap_button;
    private javax.swing.JLabel swap_status_label;
    // End of variables declaration//GEN-END:variables
}