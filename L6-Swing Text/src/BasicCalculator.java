import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasicCalculator {

    /* Create a calculator program with two text fields
    and 4 buttons, one for each of the arithmetic operations.

    The user will enter numbers, could be decimals, then click
    on one of the buttons and the answer will display on the calculator.

    NO POP-UPS
     */

    static JTextField inputNumberField1, inputNumberField2;
    static JLabel resultLabel;



    public static void main(String[] args) {
        JFrame window = new JFrame("Simple Calculator");
        JPanel panel = new JPanel();
        JLabel Label1 = new JLabel("Enter a number: ");
        JLabel Label2 = new JLabel("Enter a number: ");
        JTextField inputNumberField1 = new JTextField(10);
        JTextField inputNumberField2 = new JTextField(10);

        JButton Mbutton = new JButton("Multiple");
        JButton Dbutton = new JButton("Divide");
        JButton Abutton = new JButton("Add");
        JButton Sbutton = new JButton("Subtract");

        JLabel resultLabel = new JLabel("0.00");

        window.setSize(300, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        Abutton.addActionListener(new addListener());
        Sbutton.addActionListener(new subListener());
        Mbutton.addActionListener(new multListener());
        Dbutton.addActionListener(new divListener());


        panel.add(Label1);
        panel.add(inputNumberField1);
        panel.add(Label2);
        panel.add(inputNumberField2);

       panel.add(resultLabel);

        panel.add(Mbutton);
        panel.add(Dbutton);
        panel.add(Abutton);
        panel.add(Sbutton);




        window.add(panel);

        window.setVisible(true);

    }

    private static class addListener implements ActionListener{

        public void actionPerformed(ActionEvent actionEvent) {
            double number1 = Double.parseDouble(inputNumberField1.getText());
            double number2 = Double.parseDouble(inputNumberField2.getText());


            resultLabel.setText(String.valueOf(number1+number2));
        }
    }

    private static class subListener implements ActionListener{

        public void actionPerformed(ActionEvent actionEvent) {
            double number1 = Double.parseDouble(inputNumberField1.getText());
            double number2 = Double.parseDouble(inputNumberField2.getText());


            resultLabel.setText(String.valueOf(number1-number2));
        }
    }

    private static class multListener implements ActionListener{

        public void actionPerformed(ActionEvent actionEvent) {
            double number1 = Double.parseDouble(inputNumberField1.getText());
            double number2 = Double.parseDouble(inputNumberField2.getText());


            resultLabel.setText(String.valueOf(number1*number2));
        }
    }

    private static class divListener implements ActionListener{

        public void actionPerformed(ActionEvent actionEvent) {
            double number1 = Double.parseDouble(inputNumberField1.getText());
            double number2 = Double.parseDouble(inputNumberField2.getText());


            resultLabel.setText(String.valueOf(number1/number2));
        }
    }


}
