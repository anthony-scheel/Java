/*
* File:  CMIS141HW2AnthonyScheelYellowTest.java
* Author: Anthony Scheel
* Date: July 24, 2016
* Purpose: Build out a guitar
 */
package cmis141hw3anthonyscheelyellow;

// Importing the constants
import static cmis141hw3anthonyscheelyellow.CMIS141HW3AnthonyScheelYellow.EPIPHONE;
import static cmis141hw3anthonyscheelyellow.CMIS141HW3AnthonyScheelYellow.GIBSON;
import static cmis141hw3anthonyscheelyellow.CMIS141HW3AnthonyScheelYellow.IBANEZ;
import static cmis141hw3anthonyscheelyellow.CMIS141HW3AnthonyScheelYellow.JACKSON;
import static cmis141hw3anthonyscheelyellow.CMIS141HW3AnthonyScheelYellow.YAMAHA;

import java.io.IOException;

public class CMIS141HW3AnthonyScheelYellowTest {

    public static void main(String[] args)  throws IOException {
        System.out.println("Welcome to the Guitar Building Program.\n");
        
        // Creates the instances of the guitar array
        CMIS141HW3AnthonyScheelYellow[] guitarType = new CMIS141HW3AnthonyScheelYellow[5];

        // Array that creates the guitars
        for (int i = 0; i < guitarType.length; i++) {
            guitarType[i] = new CMIS141HW3AnthonyScheelYellow();
        }

        //First guitar
        guitarType[0].numStrings = 6;
        System.out.println("Your first guitar is an " + IBANEZ);
        guitarType[0].tuneGuitar();
        System.out.println("You start to strum the following string: ");
        guitarType[0].aString();
        guitarType[0].playGuitar();
        System.out.println("You play 'Nightmare' by Polyphia!");
        guitarType[0].playSolo();
        System.out.println("The crowd goes wild for your solo!");
        guitarType[0].cancelSolo();
        guitarType[0].cancelPlayGuitar();

        //Second guitar
        guitarType[1].numStrings = 6;
        System.out.println("Your second guitar is a " + GIBSON);
        guitarType[1].tuneGuitar();
        System.out.println("You start to strum the following string: ");
        guitarType[1].bString();
        guitarType[1].playGuitar();
        System.out.println("You start playing 'Killing in the Name' by Rage Against The Machine.");
        guitarType[1].playRythm();
        System.out.println("The crowd is going nuts!");
        guitarType[1].cancelRythm();
        guitarType[1].cancelPlayGuitar();

        //Third guitar
        guitarType[2].numStrings = 6;
        System.out.println("Your third guitar is a " + JACKSON);
        guitarType[2].tuneGuitar();
        System.out.println("You start to strum the following string: ");
        guitarType[2].eString();
        guitarType[2].playGuitar();
        System.out.println("You play 'Follow the Hollow' by Soilwork.");
        System.out.println("Since your other guitarist was sick you play both rythm and the solo.");
        guitarType[2].playRythm();
        guitarType[2].cancelRythm();
        guitarType[2].playSolo();
        guitarType[2].cancelSolo();
        guitarType[2].cancelPlayGuitar();

        //Fourth guitar
        guitarType[3].numStrings = 6;
        System.out.println("Your fourth guitar is a " + EPIPHONE);
        guitarType[3].tuneGuitar();
        System.out.println("You start to strum the following string: ");
        guitarType[3].dString();
        guitarType[3].playGuitar();
        System.out.println("You play 'Fat Lip' by Sum 41");
        guitarType[3].playRythm();
        guitarType[3].cancelRythm();
        guitarType[3].cancelPlayGuitar();

        //Fifth guitar utilizes stringNote12String to create a 12-String guitar
        guitarType[4].numStrings = 12;

        guitarType[4].stringNote12String = new char[12];
        guitarType[4].stringNote12String[0] = 'E';
        guitarType[4].stringNote12String[1] = 'e';
        guitarType[4].stringNote12String[2] = 'A';
        guitarType[4].stringNote12String[3] = 'a';
        guitarType[4].stringNote12String[4] = 'D';
        guitarType[4].stringNote12String[5] = 'd';
        guitarType[4].stringNote12String[6] = 'G';
        guitarType[4].stringNote12String[7] = 'g';
        guitarType[4].stringNote12String[8] = 'B';
        guitarType[4].stringNote12String[9] = 'b';
        guitarType[4].stringNote12String[10] = 'E';
        guitarType[4].stringNote12String[11] = 'e';

        System.out.println("Your fifth guitar is a 12 string " + YAMAHA);
        guitarType[4].tuneGuitar();
        System.out.println("You start to strum the following string: ");
        System.out.println(guitarType[4].stringNote12String[1]);
        guitarType[4].playGuitar();
        System.out.println("You play 'Welcome Home' by Coheed and Cambria");
        guitarType[4].playRythm();
        guitarType[4].cancelRythm();
        guitarType[4].cancelPlayGuitar();
    }
}
