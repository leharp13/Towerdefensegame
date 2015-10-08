package tdgame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
//stuff for writing the high score to a txt file
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
//stuff for reading the high score list from a txt file
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author jakesemple
 */


class mainJPanel extends JPanel{
    public JButton easy = new JButton("Easy");
    public JButton medium = new JButton("Medium");
    public JButton hard = new JButton("Hard");
    private JTextField input = new JTextField("Default Name", 10);
    private JLabel scoreLabel = new JLabel("Scores");
    private JTextArea scores = new JTextArea();
    private JLabel instructions = new JLabel("Instructions");
    private JTextArea instructionArea = new JTextArea();
    private JLabel enterName = new JLabel("Enter Your name: ");
    private JLabel easyL = new JLabel("Easy");
    private JLabel mediumL = new JLabel("Medium");
    private JLabel hardL = new JLabel("Hard");
    private JLabel enterL = new JLabel("Enter");
   
    String highscorelist = "List of High scores.\n";
    
    mainJPanel(){
        setPreferredSize(new Dimension(800,600));
        JPanel topPanel = new JPanel();
        JPanel bottomPanel = new JPanel();

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Color.lightGray);
        
        bottomPanel.setLayout(new BoxLayout(bottomPanel, BoxLayout.X_AXIS));
        
        bottomPanel.setBackground(Color.lightGray);
      //  bottomPanel.setBackground(Color.lightGray);

       
        createTextArea();
        add(instructions);
        add(instructionArea);
        add(scoreLabel);
        add(scores);
        bottomPanel.add(enterName);
             bottomPanel.add(input);
//        buttonPanel.add(easyL);
        bottomPanel.add(easy);
//        buttonPanel.add(mediumL);
        bottomPanel.add(medium);
//        buttonPanel.add(hardL);
        bottomPanel.add(hard);
        //*********************************** this code will read and write the high scores
//<<<<<<< HEAD
//BufferedReader br = null;
//String highscorelist = "List of High scores.\n";
//String HighScoresList = ""; 
//     try{
//         
//         File file = new File("TDGameHighScore.txt");
//         //if the file doesnt exist , then create it
//         if(!file.exists())
//         {
//             file.createNewFile();
//         }
//       
//         while ((highscorelist = br.readLine()) != null) 
//         {
//             HighScoresList =  highscorelist + "/n";// this will need to be sorted before it is output
//         }		
//         
//        FileWriter fw = new FileWriter(file.getAbsoluteFile());
//        BufferedWriter bw = new BufferedWriter(fw);
//        br =  new BufferedReader(new FileReader("TDGameHighScore.txt"));
//        bw.write(highscorelist);
//   
//	bw.close();
//     } catch (IOException e)
//     {
//         e.printStackTrace();  
//     }
//=======
BufferedReader br = null;


     try{
         
         File file = new File("TDGameHighScore.txt");
         //if the file doesnt exist , then create it
         if(!file.exists())
         {
             file.createNewFile();
         }
               FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        br =  new BufferedReader(new FileReader("TDGameHighScore.txt"));
        bw.write(highscorelist);
         while ((highscorelist = br.readLine()) != null) 
         {
             highscorelist =  highscorelist + "/n";// this will need to be sorted before it is output
         }		

   
	bw.close();
     } catch (IOException e)
     {
         e.printStackTrace();  
     }
//>>>>>>> origin/master
//************************************************ this code will read and write high scores
//        topPanel.add(namePanel);
        topPanel.add(bottomPanel);
        this.add(topPanel);

    }
    public void createTextArea(){
        instructionArea.setEditable(false);
        instructionArea.setSize(5, 5);
        instructionArea.setText("Welcome , \nSelect a level of difficulty and a name to begin. \n\n"
                + " help! help! State College is under attack please help us defend it from the asterisks.\n"
                + "In this game you will place towers and destroy the enemies.\n"
                + "You will have 100 lives and 100 coins to purchase defences.\n"
                + "Each enimy will provide you with coins to help defeat stronger enemies.\n"
                + "I hope that you will accept this challenge and save our beloved town.");
        
        scores.setEditable(false);
        scores.setSize(5, 5);
        scores.setText("High Scores are/n "  + highscorelist);
        //scores.setText()
    }
       
 
           
           
    public String getName(){
        return enterName.getText();
    }

    public void easyGameMListener(MouseListener listener){
        easy.addMouseListener(listener);
    }
    public void mediumGameMListener(ActionListener listener){
        medium.addActionListener(listener);
    }
    public void hardGameMListener(ActionListener listener){
        hard.addActionListener(listener);
    }
   
    
    
}