import javax.swing.*;
import java.text.DecimalFormat;

public class CircleCalc {

    area();


    circumfrence();

    public static void main(String[] args) {

        System.exit(0);
        //call the area method

        //call the circumference method
        public static void area(){
            double radius = Double.parseDouble(JOptionPane.showInputDialog("What is the raidus of the circle?"));

            double area Math.PI * Math.pow(radius, 2);

            JOptionPane.showMessageDialog(null, "The area is " + round.format( area));
        }

        public static void circumfrence(){
            double radius = Double.parseDouble(JOptionPane.showInputDialog("What is the raidus of the circle?"));

            double circumfrence = 2 * Math.PI * radius;

            JOptionPane.showMessageDialog(null, "The area is " + circumfrence);

        }
    }

    //write a method to calculate a circle's area


    //write a method to calculate a circle's circumference

}
