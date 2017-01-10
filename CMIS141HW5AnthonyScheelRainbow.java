/*
* File:  CMIS141HW2AnthonyScheelRed.java
* Author: Anthony Scheel
* Date: August 7, 2016
* Purpose: Get the number of passengers on the Titanic and their fates
 */
package cmis141hw5anthonyscheelrainbow;

import java.io.FileNotFoundException;
import static java.lang.System.exit;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CMIS141HW5AnthonyScheelRainbow {

    static String[] questions = {
        "How many passengers were on the Titanic?",
        "How many passengers died on the Titanic?",
        "How many passengers survived the Titanic?",
        "How many passengers survived the Titanic by class?",
        "How many passengers survived the Titanic by gender?",
        "How many passengers died on the Titanic younger than 10?",
        "How many passengers were on the Titanic by first letter of last name?"
    };

    public static void main(String[] args) {

        try {
            Titanic tData = new Titanic("C:\\Users\\Anthony\\Desktop\\Java Programming\\Week 8\\titanic.txt.txt"); // Change this to your file location
            userInterface(tData);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CMIS141HW5AnthonyScheelRainbow.class.getName()).log(Level.SEVERE, null, ex);
            exit(1);
        }
    }

    public static void userInterface(Titanic t) {
        Scanner scan = new Scanner(System.in);
        decorations();
        System.out.print("\tTitanic Statistics\n");
        decorations();
        do {
            int i = 1;
            for (String p : questions) {
                System.out.printf("%d. %s\n", i, questions[i - 1]);
                i++;
            }
            System.out.println("Type 0 to end");
            System.out.printf("Make a selection [1-%d]: ", --i);

            int choice; // Choose between the different options

            try {
                choice = scan.nextInt();

                if (choice == 0) { // Closes the program
                    System.out.println("\n\nThank you for trying the Titanic program.");
                    exit(0);
                }

                if (choice > i || choice < 1) {
                    throw new InputMismatchException("Invalid choice.");
                }
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                continue;
            }
            Stat printVal = Stat.TOTAL; // Used to get the corresponding Stat enum

            if (choice == 1) {
                printVal = Stat.TOTAL;
            } else if (choice == 2) {
                printVal = Stat.DIED;
            } else if (choice == 3) {
                printVal = Stat.SURVIVED;
            } else if (choice == 4) {
                printVal = Stat.SURVIVECLASS;
            } else if (choice == 5) {
                printVal = Stat.SURVIVGENDER;
            } else if (choice == 6) {
                printVal = Stat.YOUNG;
            } else if (choice == 7) {
                printVal = Stat.FIRSTLETTER;
            }

            decorations(); // Prints asterisks for decoration
            System.out.printf("\n\n%s\n\n", t.printStatistic(printVal));
        } while (true);
    }

    // Asterisks for decoration
    public static void decorations() {
        for (int i = 0; i < 40; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
