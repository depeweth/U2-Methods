import com.sun.org.apache.bcel.internal.generic.ARETURN;

import javax.swing.*;
import java.text.DecimalFormat;

public class CircleCalc {


    public static void main(String[] args) {

        double radius = getInput("Please enter the radius");

        double area = area(radius);

        double circumfrence = circumfrence(radius);

        JOptionPane.showMessageDialog(null, displayResults(area, circumfrence));
        //create and run the program

    }



    public static  double getInput(String message){
        return Double.parseDouble(JOptionPane.showInputDialog(message));



    }
    public static  double area(double radius){

        return Math.pow(radius, 2) * Math.PI;



    }

    public static double circumfrence(double radius) {

        return 2 * Math.PI * radius;
    }


    public static String displayResults(double area, double perimeter){

        DecimalFormat round = new DecimalFormat("#.##");
        String message = "The area is " + area;
        message += "\nThe circumfrence is: " + round.format(perimeter);

        return message;
    }
    //re-write the method to calculate a circle's area using parameters and return statement


    //re-write the method to calculate a circle's perimeter using parameters and return statement

}
