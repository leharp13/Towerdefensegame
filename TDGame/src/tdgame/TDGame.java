/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdgame;

/**
 *
 * @author lehar
 */
public class TDGame {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
       myJFrame theFrame = new myJFrame();
       mainJPanel menu = new mainJPanel();
       menu theMenu = new menu();
//       gamePanel new_game = new gamePanel();
       menuController cont = new menuController(theFrame, theMenu);
       menu.setVisible(true);
//       new_game.setVisible(false);
       
//       gameView game = new gameView();
//       game.setVisible(true);
       
      
    }
    
}