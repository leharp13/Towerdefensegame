package tdgame;

import java.awt.*;
import javax.swing.*;


 

//int towerPlacement [][]={{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0}};
 class gamePanel extends JPanel {
             
    private JButton tile = new JButton("test");
    private JButton takenTile = new JButton();
    private Enemy enemies = new Enemy();
    private Towers towers = new Towers();
    
    JPanel gamePanel = new JPanel();


//            timer t1;
            
         public void paintComponent(Graphics g)
         {
             super.paintComponent(g);
             Image myImage = Toolkit.getDefaultToolkit().getImage("bg.png");
             g.drawImage(myImage, 0, 0, this);
             
             
         }
        int towerPlacement [][]={{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                {1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                {1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                {1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                {0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1},
                                {0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1},
                                {0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,1,1,0,0},
                                {0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,1,1,0,0},
                                {0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,1,1,0,0},
                                {0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1},
                                {0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,1,1,0,0},
                                {0,0,0,0,1,1,0,0,0,0,1,1,1,1,1,1,1,1,0,0},
                                {0,0,0,0,1,1,0,0,0,0,1,1,1,1,1,1,1,1,0,0},
                                {0,0,0,0,1,1,0,0,0,0,1,1,0,0,0,0,0,0,0,0},
                                {0,0,0,0,1,1,0,0,0,0,1,1,0,0,0,0,0,0,0,0},
                                {0,0,0,0,1,1,0,0,0,0,1,1,0,0,0,0,0,0,0,0},
                                {0,0,0,0,1,1,0,0,0,0,1,1,0,0,0,0,0,0,0,0},
                                {0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0},
                                {0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0},
                                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},};
     
      public void  checkplacement(int X, int Y) //X,Y are the possition in which the user clicks to place a tower 

      {
          try
          {
          for(int x=0; x<20;x++)
          {
              for(int y=0; y<24;y++)
              {
                  if(towerPlacement [X][Y] ==0) 
                  {

                      towerPlacement[x][y] =2;

                  }
                  else if (towerPlacement [x][y] ==1 || towerPlacement [x][y] == 2)
                  {
                      
                      throw new Exception();
                      }
                  }
              }
          }
          catch(Exception e)
          {
              System.out.println("you can not place a tower there");
              JOptionPane.showMessageDialog(null, "you can not place a tower in this location", "improper location",JOptionPane.WARNING_MESSAGE); 
          }
      }
       

    public gamePanel() {
    }

 }

          // when next round button is clicked 
        //spawn 10 enemies + 2* the round number at [5][1]
     // while enemies are visible
// move the first enemy until [6][5]with a half second delay
// move the rest of the enemys 
//when position hits [5][5]  move  to [20][5]
//when position hits [20][4] move to [20][10]
//when position hits [20][10] move to [14][10]
//when position hits [14][10] move to [14][16]
//when position hits [14][16] move to [7][16]
//when position hits [7][16] move to [7][19]
//when position hits [7][19] set enemies to invisible and decrease lives by each enemy
//1,,18
//