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


        BinaryConversion Activate = new BinaryConversion();
        Activate.displayMenu();
        Activate.responseFromMenu();
        Activate.messageFromUser();



    }


}


class BinaryConversion {


    public static void displayMenu() {

        System.out.println("-----------------------Binary Call----------------------------");
        System.out.println("-------------------A.Convert text to binary-------------------");
        System.out.println("-------------------B.Convert binary to text-------------------");
        System.out.println("-------------------C.Exit Program-----------------------------");


    }

    public static char responseFromMenu() {


        char optionPick;


        Scanner input1 = new Scanner(System.in);
        System.out.println("Input: ");
        optionPick = input1.next().charAt(0);


        return optionPick;


    }

    public static String messageFromUser() {

        String Message1;

        Scanner input2 = new Scanner(System.in);
        System.out.println("Type in message your willing to convert to binary");
        return Message1 = input2.nextLine();


    }

    public static void convertStringIntoBinary(String message)
    {




    }


//    public static char displayM1() {
//
//
//        Scanner input1 = new Scanner(System.in);
//        boolean x = true;
//
//        while (x) {
//
//
//            char options;
//
//
//            System.out.println("Binary Call");
//            System.out.println("A.Convert text to binary");
//            System.out.println("B.Convert binary to text");
//            System.out.println("C.Exit");
//            options = input1.next().charAt(0);
//
//            if (options == 'A') {
//
//
//
//
//                /*Ask what you would want to type
//                then convert to binary.
//                display in binary
//                display in text
//                Return to main menu
//
//                 */
//
//
//            }
//
//            if (options == 'C') {
//                x = false;
//
//            }
//
//
//        }
//
//
//    }
//

}
