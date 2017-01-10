/*
* File:  CMIS141HW2AnthonyScheelRed.java
* Author: Anthony Scheel
* Date: July 31, 2016
* Purpose: This program creates a clock timer that gets and resets the time
 */
package cmis141hw4anthonyscheelred;

import java.time.LocalTime;

public final class Clock {

    private LocalTime startTime;
    private LocalTime stopTime;

    // Default constructor. Initializes startTime by using the start() method
    public Clock() {
        this.start();
    }

    // Initializes startTime with provided parameters
    public Clock(int hour, int min, int sec) {
        // returns LocalTime set to the specific time
        this.startTime = LocalTime.of(hour, min, sec, 0);
    }

    // Initializes startTime with provided parameters
    public Clock(LocalTime t) {
        this.startTime = t;
    }

    // Initializes start/stopTime with provided data
    public Clock(LocalTime startingTime, LocalTime endingTime) {
        this.startTime = startingTime;
        this.stopTime = endingTime;
    }

    // Setter for stopTime. Puts current time into val
    public void stop() {
        this.stopTime = LocalTime.now();
    }

    // Setter for stopTime. Puts custom time into val
    // Gets time to pass to private
    public void stopWithTime(LocalTime t) {
        this.stopTime = t;
    }

    // Setter for startTime. Puts current time into val
    public void start() {
        this.startTime = LocalTime.now();
    }

    // Getter for stopTime - startTime
    // returns Time in seconds
    public int getElapsedTime() {
        int startingTime = (this.startTime.getHour() * 3600) + (this.startTime.getMinute() * 60) + this.startTime.getSecond();
        int endingTime = (this.stopTime.getHour() * 3600) + (this.stopTime.getMinute() * 60) + this.stopTime.getSecond();
        return endingTime - startingTime;
    }

    @Override
    // returns elapsed seconds
    public String toString() {
        int time = this.getElapsedTime(); 
        return String.format("Elapsed time in seconds is: %d", time);
    }
}
