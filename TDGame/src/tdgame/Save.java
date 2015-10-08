/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdgame;
import java.io.*;
import java.util.*;
/**
 *
 * @author jakesemple
 */
public class Save {
    public void loadSave(File loadPath){
        try {
            Scanner loadScanner = new Scanner(loadPath);
            while (loadScanner.hasNext()) {
            for(int y=0;y<gamePanel.room.tiles.length;y++){
                for(int x=0;x<gamePanel.room.tiles[0].length;x++){
                gamePanel.room.tiles[y][x].groundId = loadScanner.nextInt();
            }
            }
            for(int y=0;y<gamePanel.room.tiles.length;y++){
                for(int x=0;x<gamePanel.room.tiles[0].length;x++){
                gamePanel.room.tiles[y][x].airId = loadScanner.nextInt();
            }
            }
        }
            loadScanner.close();
        }
        catch(Exception e){
            
        }
    }
}
