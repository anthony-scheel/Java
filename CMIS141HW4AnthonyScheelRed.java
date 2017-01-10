/*
* File:  CMIS141HW2AnthonyScheelRed.java
* Author: Anthony Scheel
* Date: July 31, 2016
* Purpose: This program creates a clock timer that gets and resets the time
 */
package cmis141hw4anthonyscheelred;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.LocalTime;

public final class CMIS141HW4AnthonyScheelRed {

    public static void main(String[] args) throws InterruptedException {

        int startHour, startMinute, startSecond; // Start times
        LocalTime startTime;
        int endHour, endMinute, endSecond; // End times
        LocalTime endTime;
        Clock userClock;

        // startTime 
        startHour = getValues("Enter hour to start", 0, 12);
        startMinute = getValues("Enter minute to start", 0, 60);
        startSecond = getValues("Enter second to start", 0, 60);
        startTime = LocalTime.of(startHour, startMinute, startSecond, 0);

        // endTime 
        endHour = getValues("Enter hour to end", 0, 23);
        endMinute = getValues("Enter minute to end", 0, 60);
        endSecond = getValues("Enter second to end", 0, 60);
        endTime = LocalTime.of(endHour, endMinute, endSecond, 0);

        // new clock
        userClock = new Clock(startTime, endTime);
        System.out.printf("\n\n\n%s\n", userClock);
    }

    public static int getValues(String toGet, int min, int max) {
        Scanner sc = new Scanner(System.in);
        
        // Error-handling boolean
        boolean shouldContinue = true;
        int in = min;

        do {
            System.out.printf("%s: ", toGet);
            try {
                in = sc.nextInt(); // If not int, catch
                if (in > max || in < min) {
                    System.out.printf("\nPlease enter a number in valid time range\n");
                } else {
                    shouldContinue = false;
                }
            } catch (InputMismatchException e) {
                System.out.printf("\nPlease enter an integer\n");
            }
        } while (shouldContinue);

        return in;
    }
}
