/* 
*  File:    Toaster.java
*  Author:  Anthony Scheel
*  Date:    24 July 2016
*  Purpose: Make some toast!
*/

public class Toaster {

   // Variables
   private int bread;
   private int power;
   private int heat;

   // Constructor
   public Toaster (int bread, int power, int heat) {
   this.bread = bread;
   this.power = power;
   this.heat = heat;
   }

   // Default constructor
   public Toaster () {
   bread = 0;
   power = 0;
   heat = 0;
   }

   // Setter methods
   // setBread
   public void setBread(int bread) {
   this.bread = bread;
   }

   // setPower()
   public void setPower(int power) {
   this.power = power;
   }

   
   // setHeat()
   public void setHeat(int heat) {
   this.heat = heat;
   }

   // Getter methods
   // getBread
   public int getBread() {
   return bread;
   }

   // getPower
   public int getPower() {
   return power;
   }

   // getHeat
   public int getHeat() {
   return heat;

  }
}