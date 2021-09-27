import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quotes {

    /*Create a GUI program with three buttons.
    Each button displays one of your favorite quotes.
    Hint: Use \n to make a new line.
     */
    public static void main(String[] args)
        {
            JFrame window = new JFrame("This Is A Simple Window");
            JPanel panel = new JPanel();
            JButton button = new JButton("Quote 1");
            JButton button2 = new JButton("Quote 2");
            JButton button3 = new JButton("Quote 3");

            window.setSize(800, 600);
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            //window centered on screen
            window.setLocationRelativeTo(null);

            button.addActionListener(new ButtonListener1());
            button2.addActionListener(new ButtonListener2());
            button3.addActionListener(new ButtonListener3());

            panel.add(button);
            panel.add(button2);
            panel.add(button3);
            window.add(panel);



            window.setVisible(true);

        }

        private static class ButtonListener1 implements ActionListener {

            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, ("no hear"));
            }

        }
        private static class ButtonListener2 implements ActionListener{
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "no see");
            }

        }
        private static class ButtonListener3 implements ActionListener{
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "no say");
            }

        }


    }

