/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdgame;

import java.awt.Graphics;

/**
 *
 * @author jakesemple
 */
public class Room {
    public int worldWidth = 20;
    public int worldHeight = 19;
    public int blockSize = 30;
    
    public Tiles[][] tiles;
    
    public Room(){
        define();
    }
    public void define(){
        tiles = new Tiles[worldHeight][worldWidth];
        for(int y=0; y<tiles.length; y++){
            for(int x=0; x<tiles[0].length;x++){
                tiles[y][x] = new Tiles(x*blockSize, y*blockSize, blockSize, blockSize, Value.groundGrass, Value.airAir );
            }
        }
    }
    
    public void physic(){
        
    }
    public void draw(Graphics g){
         for(int y=0; y<tiles.length; y++){
            for(int x=0; x<tiles[0].length;x++){
                tiles[y][x].draw(g);
            }
        }
    }
}
