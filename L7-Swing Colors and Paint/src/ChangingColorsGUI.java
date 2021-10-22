import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangingColorsGUI {

    //Variables in a class are declared here,
    //but often not initialized

    JFrame window;
    JPanel panel;
    JButton colorClicker;
    JButton colorClicker2;
    JButton colorClicker3;
    Color panelBackground = new Color(33, 33, 33);
    Color buttonForeground = new Color(202, 217, 179);
    Color buttonBackground = new Color(109, 152, 134);
    Color buttonForeground2 = new Color(002, 27, 179);
    Color buttonBackground2 = new Color(109, 217, 134);
    Color buttonForeground3 = new Color(200, 27, 179);
    Color buttonBackground3 = new Color(109, 217, 24);
    /*
    This is a constructor and absolutely necessary for a class.
    This is where we will build the GUI, it must have the same
    name as the class.
    */

    public ChangingColorsGUI(){

        window = new JFrame("Color Changer");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(340, 127);
        window.setLocationRelativeTo(null);

        panel = new JPanel();
        colorClicker = new JButton("Change the Colors");
        colorClicker2 = new JButton("Change the Colors");
        colorClicker3 = new JButton("Change the Colors");

        //create a new Custom color
        //SEE GLOBALS


        //Set the colors of our buttons and panel
        panel.setBackground(panelBackground);
        colorClicker.setForeground(buttonForeground);
        colorClicker.setBackground(buttonBackground);
        colorClicker2.setForeground(buttonForeground2);
        colorClicker2.setBackground(buttonBackground2);
        colorClicker3.setForeground(buttonForeground3);
        colorClicker3.setBackground(buttonBackground3);

        panel.add(colorClicker);
        panel.add(colorClicker2);
        panel.add(colorClicker3);
        window.add(panel);

        window.setVisible(true);
    }

    //Add a listener to change the color when the button is clicked
    private class ColorChanger implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent){
            panel.setBackground(buttonForeground);
            colorClicker.setForeground(buttonBackground);
            colorClicker.setBackground(panelBackground);
        }
    }



}
