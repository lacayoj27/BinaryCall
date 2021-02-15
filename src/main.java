import java.util.Scanner;

public class main {


    /*

    You want to right a program that converts regular text into binary form.
    the program will be able to accept letters and numbers and convert them into
    binary form. If you want, you will be able to convert binary messages back into
    letter form.

    Currently, I'm trying to figure out the purpose for each class. I believe the
    functionality of this program should be segmented to each it's own category.
    having them work together using different types of data is the challenge.

    Maybe we can have one class deal with binary code, and another class
    deal with the menu for the program

    sciencefriday.com/educational-resources/write-your-name-in-binary-code/
     */

    public static void main(String[] args) {


        DisplayMenu Activate = new DisplayMenu();
        Activate.displayM1();


    }


}

class BinaryConversion {

    Scanner input2 = new Scanner(System.in);


    public static long charForBinary(char fromOption) {

        

        if (fromOption == 'A') {

            System.out.println("What would you like to type: ");

        }

        return 0;


    }


}

class DisplayMenu {


    BinaryConversion Activate1 = new BinaryConversion();

    public static char displayM1() {


        Scanner input1 = new Scanner(System.in);
        boolean x = true;

        while (x) {


            char options;


            System.out.println("Binary Call");
            System.out.println("A.Convert text to binary");
            System.out.println("B.Convert binary to text");
            System.out.println("C.Exit");
            options = input1.next().charAt(0);

            if (options == 'A') {




                /*Ask what you would want to type
                then convert to binary.
                display in binary
                display in text
                Return to main menu

                 */


            }

            if (options == 'C') {
                x = false;

            }


        }


    }


}
