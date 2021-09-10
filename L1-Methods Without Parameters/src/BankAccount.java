import javax.swing.*;

public class BankAccount {

    //create a program which simulates a bank account

    public static void main(String[] args) {


        System.exit(0);
    }

    /*write a method to simulate a deposit.
    Prompt the user to enter their balance and the deposit amount,
    then display the new balance. */

    public static void deposit() {
        double balance = Double.parseDouble(JOptionPane.showInputDialog("Please enter your balance amount");
        double deposit = Double.parseDouble(JOptionPane.showInputDialog("Please enter your deposit");

        balance += deposit;

        JOptionPane.showInputDialog(null, "Your new balance is: " + balance);
    }

    /*write a method to simulate a withdrawal.
    Prompt the user to enter their balance the withdrawal amount,
    then display the new balance.
     */


    public static void withdrawal() {
        double balance = Double.parseDouble(JOptionPane.showInputDialog("Please enter your balance amount");
        double withdrawal = Double.parseDouble(JOptionPane.showInputDialog("Please enter your deposit");

        balance -= withdrawal;

        JOptionPane.showMessageDialog(null, "Your new balance is; " + balance);


    }
}
