import javax.swing.*;
import java.awt.*;

public class ArtworkGUI {

    //DECLARE VARIABLES
    JFrame frame;

    public ArtworkGUI(){
    frame = new JFrame("Simple Drawing");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        //ADD THE PANEL TO THE FRAME
        JPanel panel = new MyDrawing();

        frame.add(panel);
        frame.setVisible(true);
    }
        //CREATE THE GUI

    private class MyDrawing extends JPanel
    {
        public MyDrawing(){
            //Set the background color
            setBackground(Color.pink);
        }


        public void paintComponent(Graphics g){

            super.paintComponent(g);


            Color myGray = new Color(158,164,173);
            Color myBlue = new Color(47,159,245);


            g.setColor(myGray);
            g.fillRect(20,20,250,250);
            g.fillRect(310,290,250,250);
            g.fillRect(20,290,250,250);
            g.fillRect(310,20,250,250);

            g.setColor(Color.pink);
            g.fillRect(45,45,200,200);
            g.fillRect(335,45,200,200);
            g.fillRect(335,315,200,200);
            g.fillRect(45,315,200,200);

            g.setColor(myGray);
            g.fillRect(70,70,150,150);
            g.fillRect(360,70,150,150);
            g.fillRect(360,340,150,150);
            g.fillRect(70,340,150,150);

            g.setColor(Color.pink);
            g.fillRect(95,95,100,100);
            g.fillRect(385,95,100,100);
            g.fillRect(95,365,100,100);
            g.fillRect(385,365,100,100);

            g.setColor(myBlue);
            g.fillRect(270,270,40,20);
            g.drawRect(45,45,490,470);
            g.drawRect(95,95,390,370);
            g.drawRect(220,220,140,120);
            g.drawRect(195,195,190,170);
            g.drawRect(245,245,90,70);

        }
    }
}
