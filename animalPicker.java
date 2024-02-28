
import java.util.Scanner;

public class animalPicker {

    public static void main(String args[]) {
        //variable decloration
        String cmd;

        Scanner scan = new Scanner( System.in );

        while (true) {
            System.out.println("What animal would you like to see: Dog or Cat?");// Askes the user to enter one of the animal names
            cmd = scan.nextLine();// Takes the user input

            switch (cmd.toLowerCase()) {
                case "dog":
                    System.out.println("DOG ASCII ART HERE");// Prints out dog ASCII art
                    System.out.println("^..^      /\r\n" + //
                                       "/_/\\_____/\r\n" + //
                                       "   /\\   /\\\r\n" + //
                                       "  /  \\ /  \\");
                    return; 
                case "cat":
                    System.out.println("CAT ASCII ART HERE");// Prints out cat ASCII art
                    System.out.print("|\\---/|\r\n"+
                                        "| o_o |\r\n"+
                                        " \\_^_/");
                    return; 
                default:
                    System.out.println("Not an option. Please enter 'dog' or 'cat'."); // Loops around untill you enter a valid option.
            }
        }
    }
}

