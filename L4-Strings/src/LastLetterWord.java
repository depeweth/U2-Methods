import javax.swing.*;

public class LastLetterWord {

    /*
    Create a program that takes the last 3 letters of each String
    and outputs them as one string.

    Use a method to find and return the last three letters and a string parameter.

    Ex:  Goodbye, Hello, Morning -> byelloing
    */

    /*
    get input
    isolate last 3 letters
    put the 3 words last 3 letters together
     */

    public static void main(String[] args) {


        String word1 = JOptionPane.showInputDialog("Enter Word 1: ");
        String word2 = JOptionPane.showInputDialog("Enter Word 2: ");
        String word3 = JOptionPane.showInputDialog("Enter Word 3: ");

        String output = lastThree(word1) + lastThree(word2) + lastThree(word3);

        JOptionPane.showMessageDialog(null, output);
    }

    public static String lastThree(String word){

        String newWord;

        if(word.length() <=3) {
            newWord = word;
        }else{
            newWord = word.substring(word.length()-3);
        }

        return newWord;
    }

}
