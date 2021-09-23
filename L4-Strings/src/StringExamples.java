import java.util.Locale;

public class StringExamples {

    public static void main(String[] args) {
        String name = "pineapple";
        String greeting = "Hello";

        int stringSize = name.length();

//style 1
        System.out.println(name + " has " + stringSize + " letter");

        //style 2
        System.out.println(name + " has " + name.length() + " letter");

        System.out.println(greeting + " has " + greeting.length() + "letters");

        //create a program which captulizes the first letter of a name

        //Attempt 1
        //1. Get input
        //2. Isolate first letter
        //3. Capitulize first letter
        //4. Isolate the rest of the letters
        //5. put 3 and 4 together
        //6. display results

        System.out.println(capFirst(name));
    }

    public static String capFirst(String name){

        String letter = name.substring(0,1);
        letter = letter.toUpperCase();

        return letter + name.substring(1);


    }
}
