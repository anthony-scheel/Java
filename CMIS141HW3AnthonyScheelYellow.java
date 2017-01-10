/*
* File:  CMIS141HW2AnthonyScheelYellow.java
* Author: Anthony Scheel
* Date: July 24, 2016
* Purpose: Build out a guitar
 */
package cmis141hw3anthonyscheelyellow;

public class CMIS141HW3AnthonyScheelYellow {

    int numStrings; // Gets the number of strings the guitar has
    char[] stringNote6String = {'E', 'A', 'D', 'G', 'B', 'E'}; // Creates an array for the notes of the guitar
    char[] stringNote12String; // Creates a second array for a 12 string guitar
    private boolean tuned; // Tunes the guitar
    private boolean playing; // Determines if the user is playing the guitar
    private boolean rythm; // Determines if the user is playing rythm guitar
    private boolean solo; // Determines if the user is playing a guitar solo

    // Guitar Brands as Constants
    public static final String IBANEZ = "Ibanez";
    public static final String GIBSON = "Gibson";
    public static final String JACKSON = "Jackson";
    public static final String EPIPHONE = "Epiphone";
    public static final String YAMAHA = "Yamaha";

    // Makes all of the methods false
    public CMIS141HW3AnthonyScheelYellow() {
        tuned = false;
        playing = false;
        rythm = false;
        solo = false;
    }

    // Method to tune the guitar
    public boolean tuneGuitar() {
        //tuned = true;
        System.out.println("Your guitar is now tuned.");
        return tuned = true;
    }

    // Method to play the guitar
    public boolean playGuitar() {
        //playing = true;
        System.out.println("You begin to play your guitar.");
        return playing = true;
    }

    // Method to stop playing the guitar
    public boolean cancelPlayGuitar() {
        //playing = false;
        System.out.println("You have stopped playing your guitar.\n");
        return playing = false;
    }

    // Method to play rythm guitar
    public boolean playRythm() {
        //rythm = true;
        System.out.println("You have begun playing backup rythm on your guitar.");
        return rythm = true;
    }

    // Method to stop playing rythm guitar
    public boolean cancelRythm() {
        //rythm = false;
        System.out.println("You stop playing backup rythm on your guitar.");
        return rythm = true;
    }

    // Method to play a guitar solo
    public boolean playSolo() {
        //solo = true;
        System.out.println("You begin to play a solo on your guitar!");
        return solo = true;
    }

    // Method to stop the guitar solo
    public boolean cancelSolo() {
        //solo = false;
        System.out.println("You finish playing your solo.");
        return solo = false;
    }

    // Method to play the e-string
    public void eString() {
        System.out.println(stringNote6String[0]);
    }

    // Method to play the a-string
    public void aString() {
        System.out.println(stringNote6String[1]);
    }

    // Method to play the d-string
    public void dString() {
        System.out.println(stringNote6String[2]);
    }

    // Method to play the g-string
    public void gString() {
        System.out.println(stringNote6String[3]);
    }

    // Method to play the b-string
    public void bString() {
        System.out.println(stringNote6String[4]);
    }
}
