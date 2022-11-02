import java.util.Scanner;

/**
 * Example program of a menu selection.
 * The user can select different menu
 * options by typing an integer from 1-6
 *
 * The program checks if the entered character is an integer
 * @author Enno Stassny
 * @version 1.0
 * @since 1.0
 */
public class Main
{
    public static void main(String[] args)
    {
        // The program runs until this boolean is false
        boolean keepRunning = true;

        // Scanning user input via the console
        Scanner scanner = new Scanner(System.in);

        // Show the user all available option to pick from
        printMenu();

        // This loop is always run at least once
        do
        {
            System.out.println("Bitte waelen sie einen Menupunkt aus");
            String line = scanner.nextLine();

            // Continues if the entered string is not an integer
            if (!isInteger(line))
                continue;

            // Switches the entered integer
            switch (Integer.parseInt(line)) // Default switch statement. See enhanced version below
            {
                case 1:
                    System.out.println("Sie haben Option 1 ausgewaehlt");
                    break; // Exists the switch-case
                case 2:
                    System.out.println("Sie haben Option 2 ausgewaehlt");
                    break;
                case 3:
                    System.out.println("Sie haben Option 3 ausgewaehlt");
                    break;
                case 4:
                    System.out.println("Sie haben Option 4 ausgewaehlt");
                    break;
                case 5:
                    System.out.println("Sie haben Option 5 ausgewaehlt");
                    break;
                case 6:
                    System.out.println("Sie haben Option 6 ausgewaehlt und damit das Program beendet!");
                    keepRunning = false;
                    break;
                default: // Executed if the user entered another number
                    System.out.println("Der ausgewaehlte Punkt (" + Integer.parseInt(line) +  ") ist nicht verfuegbar!");
                    // No break needed
            }
/*            -> Enhanced switch statement <-
            switch (Integer.parseInt(line))
            {
                case 1 -> System.out.println("Sie haben Option 1 ausgewaehlt");
                case 2 -> System.out.println("Sie haben Option 2 ausgewaehlt");
                case 3 -> System.out.println("Sie haben Option 3 ausgewaehlt");
                case 4 -> System.out.println("Sie haben Option 4 ausgewaehlt");
                case 5 -> System.out.println("Sie haben Option 5 ausgewaehlt");
                case 6 ->
                {
                    System.out.println("Sie haben Option 6 ausgewaehlt und damit das Program beendet!");
                    keepRunning = false;
                }
                default -> // Executed if the user entered another number
                        System.out.println("Der ausgewaehlte Punkt (" + Integer.parseInt(line) + ") ist nicht verfuegbar!");
            }
 */
        } while (keepRunning);
    }

    /**
     * Prints the available menu options to the user
     */
    private static void printMenu()
    {
        System.out.println("----- Menu -----");
        System.out.println("- (1) Option 1");
        System.out.println("- (2) Option 2");
        System.out.println("- (3) Option 3");
        System.out.println("- (4) Option 4");
        System.out.println("- (5) Option 5");
        System.out.println("- (6) Exit");
        System.out.println("----- Menu -----");
    }

    /**
     * Returns true if the string is an integer otherwise
     * false.
     *
     * This methode checks if a string is an integer
     * if the string is not an integer a help message
     * will be printed for the user
     *
     * @param str String to check
     * @return true/false
     */
    private static boolean isInteger(String str)
    {
        try
        {
            // Try to parse the string to an integer
            Integer.parseInt(str);
        } catch (NumberFormatException e) // If the parse was not possible
        {
            System.out.println("Bitte geben sie eine Zahl von 1-6 an!");
            return false;
        }
        return true;
    }
}