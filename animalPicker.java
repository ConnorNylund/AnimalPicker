
import java.util.Scanner;

public class animalPicker {

    public static void main(String args[]) {
        //variable decloration
        String cmd;

        Scanner scan = new Scanner( System.in );

            while (true) {
            System.out.println("What animal would you like to see: Dog or Cat or Fish or Bird or Frog?");// Askes the user to enter one of the animal names.
            cmd = scan.nextLine();// Takes the user input

            switch (cmd.toLowerCase()) {
                case "dog":
                    System.out.println("DOG ASCII ART HERE");// Prints out dog ASCII art.
                    System.out.println("^..^      /\r\n" + //
                                       "/_/\\_____/\r\n" + //
                                       "   /\\   /\\\r\n" + //
                                       "  /  \\ /  \\");
                    return; 
                case "cat":
                    System.out.println("CAT ASCII ART HERE");// Prints out cat ASCII art.
                    System.out.print("|\\---/|\r\n"+
                                        "| o_o |\r\n"+
                                        " \\_^_/");
                    return; 
                case "fish":
                    System.out.println("FISH ASCII ART HERE");// Prints out fish ASCII art.
                    System.out.println("|\\   \\\\\\\\__     o\r\n" + //
                                                "| \\_/    o \\    o \r\n" + //
                                                "> _   (( <_  oo  \r\n" + //
                                                "| / \\__+___/      \r\n" + //
                                                "|/     |/\r\n" + //
                                                "");
                    return;
                case "bird":
                    System.out.println("BIRD ASCII ART HERE");
                    System.out.println("   \\\\\n   (o>\n\\\\_//)\n \\_/_)\n  _|_");
                   return;
                case "frog":
                    System.out.println("   o ");
                    System.out.println(" _`O'_");
                return;
                default:
                    System.out.println("Not an option. Please enter 'dog' or 'cat' or 'fish' or 'bird'."); // Loops around until you enter a valid option.
            }
        }
    }
}


