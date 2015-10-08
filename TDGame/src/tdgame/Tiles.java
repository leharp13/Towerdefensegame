/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdgame;

import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author jakesemple
 */
public class Tiles extends Rectangle{
   public int groundId;
   public int airId;
   
   public Tiles(int x, int y, int width, int height, int groundId, int airId){
       setBounds(x, y, width, height);
       this.groundId = groundId;
       this.airId = airId;
       
   }
   
   public void draw(Graphics g){
       g.drawRect(x, y, width, height);
       
       
   }
    
}
