/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tictactoe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.ImageIcon;
import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class NewJFrame extends javax.swing.JFrame {
    
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        start();        
    }  
    
    public void turn(){
        if(TTT_O.isSelected() && TTT_Gamer1_L.isSelected())
        {
            TTT_Turn.setText("Kolej gracza 1!");
        }else if(TTT_O.isSelected() && TTT_Gamer2_L.isSelected()){
            TTT_Turn.setText("Kolej gracza 2!");
        }else if(TTT_X.isSelected() && TTT_Gamer1_R.isSelected())
        {
            TTT_Turn.setText("Kolej gracza 1!");
        }else if(TTT_X.isSelected() && TTT_Gamer2_R.isSelected()){
            TTT_Turn.setText("Kolej gracza 2!");
        }
    }
    
    public final void end(){
        TTT_O.setEnabled(false);        
        TTT_X.setEnabled(false);        
        TTT_BTN1.setEnabled(false);
        TTT_BTN2.setEnabled(false);
        TTT_BTN3.setEnabled(false);
        TTT_BTN4.setEnabled(false);
        TTT_BTN5.setEnabled(false);
        TTT_BTN6.setEnabled(false);
        TTT_BTN7.setEnabled(false);
        TTT_BTN8.setEnabled(false);
        TTT_BTN9.setEnabled(false);
        TTT_Gamer1_L.setEnabled(false);
        TTT_Gamer2_L.setEnabled(false);
        TTT_Gamer1_R.setEnabled(false);
        TTT_Gamer2_R.setEnabled(false);
    }
    
        public final void start(){
        TTT_O.setSelected(true); 
        TTT_O.setEnabled(false);        
        TTT_X.setEnabled(false);
        
        TTT_BTN1.setEnabled(false);
        TTT_BTN2.setEnabled(false);
        TTT_BTN3.setEnabled(false);
        TTT_BTN4.setEnabled(false);
        TTT_BTN5.setEnabled(false);
        TTT_BTN6.setEnabled(false);
        TTT_BTN7.setEnabled(false);
        TTT_BTN8.setEnabled(false);
        TTT_BTN9.setEnabled(false);
    }
    
    public final void check()
    {
        String checked1 = TTT_BTN1.getText();
        String checked2 = TTT_BTN2.getText();
        String checked3 = TTT_BTN3.getText();
        String checked4 = TTT_BTN4.getText();
        String checked5 = TTT_BTN5.getText();
        String checked6 = TTT_BTN6.getText();
        String checked7 = TTT_BTN7.getText();
        String checked8 = TTT_BTN8.getText();
        String checked9 = TTT_BTN9.getText();
        
        if(checked1.equals("X") && checked2.equals("X") && checked3.equals("X"))
        {
            TTT_Result.setText("Winner is X!");
            end();
        }else if(checked1.equals("X") && checked4.equals("X") && checked7.equals("X"))
        {
            TTT_Result.setText("Winner is X!");
            end();
        }else if(checked1.equals("X") && checked5.equals("X") && checked9.equals("X"))
        {
            TTT_Result.setText("Winner is X!");
            end();
        }else if(checked2.equals("X") && checked5.equals("X") && checked8.equals("X"))
        {
            TTT_Result.setText("Winner is X!");
            end();
        }else if(checked3.equals("X") && checked6.equals("X") && checked9.equals("X"))
        {
            TTT_Result.setText("Winner is X!");
            end();
        }else if(checked4.equals("X") && checked5.equals("X") && checked6.equals("X"))
        {
            TTT_Result.setText("Winner is X!");
            end();
        }else if(checked7.equals("X") && checked8.equals("X") && checked9.equals("X"))
        {
            TTT_Result.setText("Winner is X!");
            end();
        }else if(checked3.equals("X") && checked5.equals("X") && checked7.equals("X"))
        {
            TTT_Result.setText("Winner is X!");
            end();
        }
        
        
        if(checked1.equals("O") && checked2.equals("O") && checked3.equals("O"))
        {
            TTT_Result.setText("Winner is O!");
            end();
        }else if(checked1.equals("O") && checked4.equals("O") && checked7.equals("O"))
        {
            TTT_Result.setText("Winner is O!");
            end();
        }else if(checked1.equals("O") && checked5.equals("O") && checked9.equals("O"))
        {
            TTT_Result.setText("Winner is O!");
            end();
        }else if(checked2.equals("O") && checked5.equals("O") && checked8.equals("O"))
        {
            TTT_Result.setText("Winner is O!");
            end();
        }else if(checked3.equals("O") && checked6.equals("O") && checked9.equals("O"))
        {
            TTT_Result.setText("Winner is O!");
            end();
        }else if(checked4.equals("O") && checked5.equals("O") && checked6.equals("O"))
        {
            TTT_Result.setText("Winner is O!");
            end();
        }else if(checked7.equals("O") && checked8.equals("O") && checked9.equals("O"))
        {
            TTT_Result.setText("Winner is O!");
            end();
        }else if(checked3.equals("O") && checked5.equals("O") && checked7.equals("O"))
        {
            TTT_Result.setText("Winner is O!");
            end();
        }
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TTT_Gamers = new javax.swing.ButtonGroup();
        TTT_Gamer_1 = new javax.swing.ButtonGroup();
        TTT_Gamer_2 = new javax.swing.ButtonGroup();
        TTT_Background = new javax.swing.JPanel();
        O = new javax.swing.JLabel();
        X = new javax.swing.JLabel();
        TTT_O = new javax.swing.JRadioButton();
        TTT_X = new javax.swing.JRadioButton();
        TTT_BTN1 = new javax.swing.JButton();
        TTT_BTN2 = new javax.swing.JButton();
        TTT_BTN3 = new javax.swing.JButton();
        TTT_BTN6 = new javax.swing.JButton();
        TTT_BTN5 = new javax.swing.JButton();
        TTT_BTN4 = new javax.swing.JButton();
        TTT_BTN9 = new javax.swing.JButton();
        TTT_BTN8 = new javax.swing.JButton();
        TTT_BTN7 = new javax.swing.JButton();
        TTT_Gamer1_L = new javax.swing.JRadioButton();
        TTT_Gamer2_L = new javax.swing.JRadioButton();
        TTT_Gamer2_R = new javax.swing.JRadioButton();
        TTT_Gamer1_R = new javax.swing.JRadioButton();
        TTT_BTNSTART = new javax.swing.JButton();
        TTT_BTNRESTART = new javax.swing.JButton();
        TTT_Result = new javax.swing.JLabel();
        TTT_Turn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TicTacToe");

        TTT_Background.setBackground(new java.awt.Color(51, 51, 51));

        O.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        O.setForeground(new java.awt.Color(204, 204, 204));
        O.setText("Kółko");

        X.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        X.setForeground(new java.awt.Color(204, 204, 204));
        X.setText("Krzyżyk");

        TTT_Gamers.add(TTT_O);

        TTT_Gamers.add(TTT_X);

        TTT_BTN1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        TTT_BTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TTT_BTN1ActionPerformed(evt);
            }
        });

        TTT_BTN2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        TTT_BTN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TTT_BTN2ActionPerformed(evt);
            }
        });

        TTT_BTN3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        TTT_BTN3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TTT_BTN3ActionPerformed(evt);
            }
        });

        TTT_BTN6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        TTT_BTN6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TTT_BTN6ActionPerformed(evt);
            }
        });

        TTT_BTN5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        TTT_BTN5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TTT_BTN5ActionPerformed(evt);
            }
        });

        TTT_BTN4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        TTT_BTN4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TTT_BTN4ActionPerformed(evt);
            }
        });

        TTT_BTN9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        TTT_BTN9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TTT_BTN9ActionPerformed(evt);
            }
        });

        TTT_BTN8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        TTT_BTN8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TTT_BTN8ActionPerformed(evt);
            }
        });

        TTT_BTN7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        TTT_BTN7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TTT_BTN7ActionPerformed(evt);
            }
        });

        TTT_Gamer_1.add(TTT_Gamer1_L);
        TTT_Gamer1_L.setText("Gracz 1");
        TTT_Gamer1_L.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TTT_Gamer1_LActionPerformed(evt);
            }
        });

        TTT_Gamer_2.add(TTT_Gamer2_L);
        TTT_Gamer2_L.setText("Gracz 2");
        TTT_Gamer2_L.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TTT_Gamer2_LActionPerformed(evt);
            }
        });

        TTT_Gamer_2.add(TTT_Gamer2_R);
        TTT_Gamer2_R.setText("Gracz 2");
        TTT_Gamer2_R.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TTT_Gamer2_RActionPerformed(evt);
            }
        });

        TTT_Gamer_1.add(TTT_Gamer1_R);
        TTT_Gamer1_R.setText("Gracz 1");
        TTT_Gamer1_R.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TTT_Gamer1_RActionPerformed(evt);
            }
        });

        TTT_BTNSTART.setBackground(new java.awt.Color(51, 51, 51));
        TTT_BTNSTART.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        TTT_BTNSTART.setForeground(new java.awt.Color(255, 255, 51));
        TTT_BTNSTART.setText("START");
        TTT_BTNSTART.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TTT_BTNSTARTActionPerformed(evt);
            }
        });

        TTT_BTNRESTART.setBackground(new java.awt.Color(51, 51, 51));
        TTT_BTNRESTART.setForeground(new java.awt.Color(255, 51, 51));
        TTT_BTNRESTART.setText("RESTART");
        TTT_BTNRESTART.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TTT_BTNRESTARTActionPerformed(evt);
            }
        });

        TTT_Result.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TTT_Result.setForeground(new java.awt.Color(255, 51, 51));
        TTT_Result.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        TTT_Turn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TTT_Turn.setForeground(new java.awt.Color(204, 255, 255));
        TTT_Turn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout TTT_BackgroundLayout = new javax.swing.GroupLayout(TTT_Background);
        TTT_Background.setLayout(TTT_BackgroundLayout);
        TTT_BackgroundLayout.setHorizontalGroup(
            TTT_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TTT_BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TTT_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TTT_BackgroundLayout.createSequentialGroup()
                        .addGroup(TTT_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TTT_BackgroundLayout.createSequentialGroup()
                                .addComponent(O)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TTT_O)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TTT_X))
                            .addGroup(TTT_BackgroundLayout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addGroup(TTT_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(TTT_BackgroundLayout.createSequentialGroup()
                                        .addGap(79, 79, 79)
                                        .addComponent(TTT_BTNSTART, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(TTT_Result, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TTT_Turn, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 23, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(X))
                    .addComponent(TTT_BTNRESTART, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(TTT_BackgroundLayout.createSequentialGroup()
                        .addGroup(TTT_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TTT_Gamer2_L)
                            .addComponent(TTT_Gamer1_L))
                        .addGap(40, 40, 40)
                        .addGroup(TTT_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TTT_BTN4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TTT_BTN7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TTT_BTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TTT_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TTT_BTN8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TTT_BTN2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TTT_BTN5, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TTT_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TTT_BTN9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TTT_BTN3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TTT_BTN6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addGroup(TTT_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TTT_Gamer1_R)
                            .addComponent(TTT_Gamer2_R, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        TTT_BackgroundLayout.setVerticalGroup(
            TTT_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TTT_BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TTT_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(TTT_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(X, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(O, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TTT_X, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TTT_O, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(TTT_BTNSTART))
                .addGap(13, 13, 13)
                .addComponent(TTT_Result, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TTT_Turn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TTT_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TTT_Gamer1_L)
                    .addGroup(TTT_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TTT_BTN2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TTT_BTN3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TTT_BTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TTT_Gamer1_R))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TTT_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(TTT_BackgroundLayout.createSequentialGroup()
                        .addGroup(TTT_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(TTT_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TTT_BTN4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TTT_BTN6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TTT_BTN5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TTT_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TTT_BTN7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TTT_BTN8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TTT_BTN9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(TTT_Gamer2_L)
                    .addComponent(TTT_Gamer2_R))
                .addGap(26, 26, 26)
                .addComponent(TTT_BTNRESTART)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TTT_Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TTT_Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void TTT_BTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TTT_BTN1ActionPerformed
        if(TTT_O.isSelected() && TTT_Gamer1_L.isSelected()){
            TTT_BTN1.setText("O");
        }else if(TTT_O.isSelected() && TTT_Gamer2_L.isSelected()){
            TTT_BTN1.setText("O");
        }else if(TTT_X.isSelected() && TTT_Gamer1_R.isSelected()){
            TTT_BTN1.setText("X");
        }else if(TTT_X.isSelected() && TTT_Gamer2_R.isSelected()){
            TTT_BTN1.setText("X");
        }
        
        if(TTT_O.isSelected()){
            TTT_X.setSelected(true);
        }else if(TTT_X.isSelected()){
            TTT_O.setSelected(true);
        }
        TTT_BTN1.setEnabled(false);
        
        check();
        turn();
    }//GEN-LAST:event_TTT_BTN1ActionPerformed

    private void TTT_BTN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TTT_BTN2ActionPerformed
        if(TTT_O.isSelected() && TTT_Gamer1_L.isSelected()){
            TTT_BTN2.setText("O");
        }else if(TTT_O.isSelected() && TTT_Gamer2_L.isSelected()){
            TTT_BTN2.setText("O");
        }else if(TTT_X.isSelected() && TTT_Gamer1_R.isSelected()){
            TTT_BTN2.setText("X");
        }else if(TTT_X.isSelected() && TTT_Gamer2_R.isSelected()){
            TTT_BTN2.setText("X");
        }
        
        if(TTT_O.isSelected()){
            TTT_X.setSelected(true);
        }else if(TTT_X.isSelected()){
            TTT_O.setSelected(true);
        }
        TTT_BTN2.setEnabled(false);
        
        check();
        turn();
    }//GEN-LAST:event_TTT_BTN2ActionPerformed

    private void TTT_BTN3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TTT_BTN3ActionPerformed
        if(TTT_O.isSelected() && TTT_Gamer1_L.isSelected()){
            TTT_BTN3.setText("O");
        }else if(TTT_O.isSelected() && TTT_Gamer2_L.isSelected()){
            TTT_BTN3.setText("O");
        }else if(TTT_X.isSelected() && TTT_Gamer1_R.isSelected()){
            TTT_BTN3.setText("X");
        }else if(TTT_X.isSelected() && TTT_Gamer2_R.isSelected()){
            TTT_BTN3.setText("X");
        }
        
        if(TTT_O.isSelected()){
            TTT_X.setSelected(true);
        }else if(TTT_X.isSelected()){
            TTT_O.setSelected(true);
        }
        TTT_BTN3.setEnabled(false);
        
        check();
        turn();
    }//GEN-LAST:event_TTT_BTN3ActionPerformed

    private void TTT_BTN4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TTT_BTN4ActionPerformed
        if(TTT_O.isSelected() && TTT_Gamer1_L.isSelected()){
            TTT_BTN4.setText("O");
        }else if(TTT_O.isSelected() && TTT_Gamer2_L.isSelected()){
            TTT_BTN4.setText("O");
        }else if(TTT_X.isSelected() && TTT_Gamer1_R.isSelected()){
            TTT_BTN4.setText("X");
        }else if(TTT_X.isSelected() && TTT_Gamer2_R.isSelected()){
            TTT_BTN4.setText("X");
        }
        
        if(TTT_O.isSelected()){
            TTT_X.setSelected(true);
        }else if(TTT_X.isSelected()){
            TTT_O.setSelected(true);
        }
        TTT_BTN4.setEnabled(false);
        
        check();
        turn();
    }//GEN-LAST:event_TTT_BTN4ActionPerformed

    private void TTT_BTN5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TTT_BTN5ActionPerformed
        if(TTT_O.isSelected() && TTT_Gamer1_L.isSelected()){
            TTT_BTN5.setText("O");
        }else if(TTT_O.isSelected() && TTT_Gamer2_L.isSelected()){
            TTT_BTN5.setText("O");
        }else if(TTT_X.isSelected() && TTT_Gamer1_R.isSelected()){
            TTT_BTN5.setText("X");
        }else if(TTT_X.isSelected() && TTT_Gamer2_R.isSelected()){
            TTT_BTN5.setText("X");
        }
        
        if(TTT_O.isSelected()){
            TTT_X.setSelected(true);
        }else if(TTT_X.isSelected()){
            TTT_O.setSelected(true);
        }
        TTT_BTN5.setEnabled(false);
        
        check();
        turn();
    }//GEN-LAST:event_TTT_BTN5ActionPerformed

    private void TTT_BTN6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TTT_BTN6ActionPerformed
        if(TTT_O.isSelected() && TTT_Gamer1_L.isSelected()){
            TTT_BTN6.setText("O");
        }else if(TTT_O.isSelected() && TTT_Gamer2_L.isSelected()){
            TTT_BTN6.setText("O");
        }else if(TTT_X.isSelected() && TTT_Gamer1_R.isSelected()){
            TTT_BTN6.setText("X");
        }else if(TTT_X.isSelected() && TTT_Gamer2_R.isSelected()){
            TTT_BTN6.setText("X");
        }
        
        if(TTT_O.isSelected()){
            TTT_X.setSelected(true);
        }else if(TTT_X.isSelected()){
            TTT_O.setSelected(true);
        }
        TTT_BTN6.setEnabled(false);
        
        check();
        turn();
    }//GEN-LAST:event_TTT_BTN6ActionPerformed

    private void TTT_BTN7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TTT_BTN7ActionPerformed
        if(TTT_O.isSelected() && TTT_Gamer1_L.isSelected()){
            TTT_BTN7.setText("O");
        }else if(TTT_O.isSelected() && TTT_Gamer2_L.isSelected()){
            TTT_BTN7.setText("O");
        }else if(TTT_X.isSelected() && TTT_Gamer1_R.isSelected()){
            TTT_BTN7.setText("X");
        }else if(TTT_X.isSelected() && TTT_Gamer2_R.isSelected()){
            TTT_BTN7.setText("X");
        }
        
        if(TTT_O.isSelected()){
            TTT_X.setSelected(true);
        }else if(TTT_X.isSelected()){
            TTT_O.setSelected(true);
        }
        TTT_BTN7.setEnabled(false);
        
        check();
        turn();
    }//GEN-LAST:event_TTT_BTN7ActionPerformed

    private void TTT_BTN8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TTT_BTN8ActionPerformed
        if(TTT_O.isSelected() && TTT_Gamer1_L.isSelected()){
            TTT_BTN8.setText("O");
        }else if(TTT_O.isSelected() && TTT_Gamer2_L.isSelected()){
            TTT_BTN8.setText("O");
        }else if(TTT_X.isSelected() && TTT_Gamer1_R.isSelected()){
            TTT_BTN8.setText("X");
        }else if(TTT_X.isSelected() && TTT_Gamer2_R.isSelected()){
            TTT_BTN8.setText("X");
        }
        
        if(TTT_O.isSelected()){
            TTT_X.setSelected(true);
        }else if(TTT_X.isSelected()){
            TTT_O.setSelected(true);
        }
        TTT_BTN8.setEnabled(false);
        
        check();
        turn();
    }//GEN-LAST:event_TTT_BTN8ActionPerformed

    private void TTT_BTN9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TTT_BTN9ActionPerformed
        if(TTT_O.isSelected() && TTT_Gamer1_L.isSelected()){
            TTT_BTN9.setText("O");
        }else if(TTT_O.isSelected() && TTT_Gamer2_L.isSelected()){
            TTT_BTN9.setText("O");
        }else if(TTT_X.isSelected() && TTT_Gamer1_R.isSelected()){
            TTT_BTN9.setText("X");
        }else if(TTT_X.isSelected() && TTT_Gamer2_R.isSelected()){
            TTT_BTN9.setText("X");
        }
        
        if(TTT_O.isSelected()){
            TTT_X.setSelected(true);
        }else if(TTT_X.isSelected()){
            TTT_O.setSelected(true);
        }
        TTT_BTN9.setEnabled(false);
        
        check();
        turn();
    }//GEN-LAST:event_TTT_BTN9ActionPerformed

    private void TTT_BTNSTARTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TTT_BTNSTARTActionPerformed
        TTT_BTNSTART.setEnabled(false);        
        
        TTT_O.setEnabled(false);
        TTT_X.setEnabled(false);
        
        TTT_Gamer1_L.setEnabled(false);
        TTT_Gamer2_L.setEnabled(false);
        TTT_Gamer1_R.setEnabled(false);
        TTT_Gamer2_R.setEnabled(false);
        
        TTT_BTN1.setEnabled(true);
        TTT_BTN2.setEnabled(true);
        TTT_BTN3.setEnabled(true);
        TTT_BTN4.setEnabled(true);
        TTT_BTN5.setEnabled(true);
        TTT_BTN6.setEnabled(true);
        TTT_BTN7.setEnabled(true);
        TTT_BTN8.setEnabled(true);
        TTT_BTN9.setEnabled(true);
        
        turn();
    }//GEN-LAST:event_TTT_BTNSTARTActionPerformed

    private void TTT_BTNRESTARTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TTT_BTNRESTARTActionPerformed
        TTT_O.setSelected(true); 
        TTT_O.setEnabled(false);        
        TTT_X.setEnabled(false);
        
        TTT_Gamer1_L.setEnabled(true);
        TTT_Gamer2_L.setEnabled(true);
        TTT_Gamer1_R.setEnabled(true);
        TTT_Gamer2_R.setEnabled(true);
        
        TTT_BTN1.setEnabled(false);
        TTT_BTN2.setEnabled(false);
        TTT_BTN3.setEnabled(false);
        TTT_BTN4.setEnabled(false);
        TTT_BTN5.setEnabled(false);
        TTT_BTN6.setEnabled(false);
        TTT_BTN7.setEnabled(false);
        TTT_BTN8.setEnabled(false);
        TTT_BTN9.setEnabled(false);
        
        TTT_BTN1.setText("");
        TTT_BTN2.setText("");
        TTT_BTN3.setText("");
        TTT_BTN4.setText("");
        TTT_BTN5.setText("");
        TTT_BTN6.setText("");
        TTT_BTN7.setText("");
        TTT_BTN8.setText("");
        TTT_BTN9.setText("");
        
        TTT_Result.setText("");
        TTT_Turn.setText("");
        TTT_BTNSTART.setEnabled(true);        
    }//GEN-LAST:event_TTT_BTNRESTARTActionPerformed

    private void TTT_Gamer1_LActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TTT_Gamer1_LActionPerformed
        TTT_Gamer2_R.setSelected(true);
    }//GEN-LAST:event_TTT_Gamer1_LActionPerformed

    private void TTT_Gamer1_RActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TTT_Gamer1_RActionPerformed
        TTT_Gamer2_L.setSelected(true);
    }//GEN-LAST:event_TTT_Gamer1_RActionPerformed

    private void TTT_Gamer2_LActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TTT_Gamer2_LActionPerformed
        TTT_Gamer1_R.setSelected(true);
    }//GEN-LAST:event_TTT_Gamer2_LActionPerformed

    private void TTT_Gamer2_RActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TTT_Gamer2_RActionPerformed
        TTT_Gamer1_L.setSelected(true);
    }//GEN-LAST:event_TTT_Gamer2_RActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
      
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel O;
    private javax.swing.JButton TTT_BTN1;
    private javax.swing.JButton TTT_BTN2;
    private javax.swing.JButton TTT_BTN3;
    private javax.swing.JButton TTT_BTN4;
    private javax.swing.JButton TTT_BTN5;
    private javax.swing.JButton TTT_BTN6;
    private javax.swing.JButton TTT_BTN7;
    private javax.swing.JButton TTT_BTN8;
    private javax.swing.JButton TTT_BTN9;
    private javax.swing.JButton TTT_BTNRESTART;
    private javax.swing.JButton TTT_BTNSTART;
    private javax.swing.JPanel TTT_Background;
    private javax.swing.JRadioButton TTT_Gamer1_L;
    private javax.swing.JRadioButton TTT_Gamer1_R;
    private javax.swing.JRadioButton TTT_Gamer2_L;
    private javax.swing.JRadioButton TTT_Gamer2_R;
    private javax.swing.ButtonGroup TTT_Gamer_1;
    private javax.swing.ButtonGroup TTT_Gamer_2;
    private javax.swing.ButtonGroup TTT_Gamers;
    private javax.swing.JRadioButton TTT_O;
    private javax.swing.JLabel TTT_Result;
    private javax.swing.JLabel TTT_Turn;
    private javax.swing.JRadioButton TTT_X;
    private javax.swing.JLabel X;
    // End of variables declaration//GEN-END:variables
}
