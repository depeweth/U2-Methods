import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FeetToMeters {

    /* Create a program with two buttons. Clicking on the first button will prompt the user to enter a distance in feet and
    convert it to meters. Clicking on the second button will prompt the user to enter a distance in meters and convert to feet.
     */

    /*
find what meters to feet and feet to meters is
get buttons setted up
get them math
boom bananas
     */

    public static void main(String[] args) {

        JFrame window = new JFrame("This Is A Simple Window");
        JPanel panel = new JPanel();
        JButton feettometers = new JButton("Quote 1");
        JButton meterstofeet = new JButton("Quote 2");


        window.setSize(200, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //window centered on screen
        window.setLocationRelativeTo(null);


        panel.add(feettometers);
        panel.add(meterstofeet);

        window.add(panel);


        feettometers.addActionListener(new FeetToMetersListener());
        meterstofeet.addActionListener(new MetersToFeetListener());


        window.setVisible(true);
    }

    private static class FeetToMetersListener implements ActionListener {
        public void actionPerformed(ActionEvent e){

            double number = Double.parseDouble(JOptionPane.showInputDialog("Enter the Feet;"));

            double results = number / 3.28;

            JOptionPane.showMessageDialog(null, results + " in meters. ");
        }
    }

    private static class MetersToFeetListener implements ActionListener {
        public void actionPerformed(ActionEvent e){

            double number = Double.parseDouble(JOptionPane.showInputDialog("Enter the Meters;"));

            double results = number / 3.28;

            JOptionPane.showMessageDialog(null, results + " in feet. ");
        }
    }
}
