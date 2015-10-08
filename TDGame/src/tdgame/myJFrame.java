/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdgame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;


import javax.swing.*;



public final class myJFrame extends JFrame{

public static final int HEIGHT = 600;
public static final int WIDTH = 800;
mainJPanel first = new mainJPanel(); 
gamePanel new_game = new gamePanel();
GameSidePanel side = new GameSidePanel();

    
    myJFrame(){
        setTitle("Welcome to Tower Defense");
        setResizable(false);
        setLocationRelativeTo(null);
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.darkGray);
        init();


    }
    
    public void init(){
    setLayout(new BorderLayout());
    this.add(first, BorderLayout.CENTER);
    setVisible(true);
}
    public void switchView(){
    setLayout(new BorderLayout());
    this.add(new_game, BorderLayout.CENTER);
    this.add(side, BorderLayout.EAST);
    first.setVisible(false);
    new_game.setVisible(true);
    side.setVisible(true);
    }
    
    public void easyGameListener(ActionListener listener){
        first.easy.addActionListener(listener);
    }
    public void mediumGameListener(ActionListener listener){
        first.medium.addActionListener(listener);
    }
    public void hardGameListener(ActionListener listener){
        first.hard.addActionListener(listener);
    }
    void displayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}
