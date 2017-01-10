/*
* File:  CMIS141HW2AnthonyScheelRed.java
* Author: Anthony Scheel
* Date: August 7, 2016
* Purpose: Get the number of passengers on the Titanic and their fates
 */
package cmis141hw5anthonyscheelrainbow;

import java.io.*;
import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Titanic {

    ArrayList<ArrayList<String>> cruiserData;
    int totalPass = 0;

    // Throw exception if the filename for the text document is not found or provided
    public Titanic(String withLocation) throws FileNotFoundException {
        this.cruiserData = new ArrayList<ArrayList<String>>();
        FileReader fileReader = new FileReader(new File(withLocation));
        BufferedReader br = new BufferedReader(fileReader);

        String line = null;
        try {
            // if no more lines, readLine() returns null
            while ((line = br.readLine()) != null) {
                ArrayList<String> ins = new ArrayList<String>();
                for (String l : line.split("\t")) {
                    ins.add(l);
                }
                this.cruiserData.add(ins);
            }
            cruiserData.remove(cruiserData.size() - 1);
            totalPass = cruiserData.size();
        } catch (IOException ex) {
            Logger.getLogger(Titanic.class.getName()).log(Level.SEVERE, null, ex);
            exit(1);
        }
    }

    // Prints out data stored in cruiserData
    public void printRaw() {
        for (ArrayList<String> o : this.cruiserData) {
            for (String t : o) {
                System.out.print(o);
            }
            System.out.println();
        }
    }

    // Type of statistic to calculate
    public String printStatistic(Stat s) {
        String retVal = "";
        switch (s) {
            case TOTAL: // TOTAL NUMBER OF PASSENGERS
                retVal = String.format("Total Passengers: %d", totalPass);
                break;
            case DIED: // TOTAL DECEASED PASSENGERS
                int numP = 0;
                for (ArrayList<String> p : cruiserData) {
                    if (0 == Integer.parseInt(p.get(1))) {
                        numP++;
                    }
                }

                float percent = ((numP * 100) / totalPass);
                retVal = String.format("Passengers who died\n%d passengers | %.2f%%", numP, percent);
                break;
            case SURVIVED: // TOTAL SURVIVING PASSENGERS
                int numS = 0;
                for (ArrayList<String> p : cruiserData) {
                    if (1 == Integer.parseInt(p.get(1))) {
                        numS++;
                    }
                }

                float pSur = ((numS * 100) / totalPass);
                retVal = String.format("Passengers who survived\n%d passengers | %.2f%%", numS, pSur);
                break;
            case SURVIVECLASS: // TOTAL SURVIVING PASSENGERS BY CLASS
                int classA = 0,
                 classB = 0,
                 classC = 0;
                for (ArrayList<String> p : cruiserData) {
                    if (Integer.parseInt(p.get(1)) == 0) {
                        continue;
                    }
                    switch (Integer.parseInt(p.get(0))) {
                        case 1:
                            classA++;
                            break;
                        case 2:
                            classB++;
                            break;
                        case 3:
                            classC++;
                            break;
                    }
                }

                float perA = ((classA * 100) / totalPass);
                float perB = ((classB * 100) / totalPass);
                float perC = ((classC * 100) / totalPass);
                retVal = String.format("Passengers who survived by class\n"
                        + "1st Class: %d | %.2f%%\n"
                        + "2nd Class: %d | %.2f%%\n"
                        + "3rd Class: %d | %.2f%%\n",
                        classA, perA, classB, perB, classC, perC);
                break;
            case SURVIVGENDER: // TOTAL SURVIVING PASSENGERS BY GENDER
                int m = 0,
                 f = 0;
                for (ArrayList<String> p : cruiserData) {
                    if (Integer.parseInt(p.get(1)) == 0) {
                        continue;
                    }
                    if ("male".equals(p.get(3))) {
                        m++;
                    } else {
                        f++;
                    }
                }
                retVal = String.format("Passengers who survived by gender\nMale: %d\nFemale: %d\n", m, f);
                break;
            case YOUNG: // TOTAL SURVIVING PASSENGERS YOUNGER THAN 10
                int yCount = 0;
                for (ArrayList<String> p : cruiserData) {
                    if (Integer.parseInt(p.get(1)) == 0) {
                        continue;
                    }
                    try {
                        if (Integer.parseInt(p.get(4)) < 10) {
                            yCount++;
                        }
                    } catch (Exception e) {
                        continue;
                    }
                }
                retVal = String.format("Passengers who died younger than 10: %d", yCount);
                break;
            case FIRSTLETTER: // PASSENGERS BY FIRST LETTER OF LAST NAME
                String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
                for (String l : letters) {
                    int lCount = 0;
                    for (ArrayList<String> p : cruiserData) { // Cycle through each passenger
                        String[] name = p.get(2).split(" "); // Get last name
                        String fletter = (p.get(2).split(""))[0]; // Get first character of last name
                        if (fletter.equals(l)) {
                            lCount++; // Increment count on last match
                        }
                    }
                    retVal += String.format("Passengers with letter %s: %d\n", l, lCount); // Append to return value
                }
                break;
        }

        return retVal; // Returns formatted string to be printed out by interfacer
    }
}
