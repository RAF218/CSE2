//////////////////
//Ralph Fernandez
//hw03
//September 16, 2014
//CSE 002

import java.util.Scanner;

/**This class finds the distance traveled and the MPH*/
public class Bicycle{
    
    public static void main(String [ ] args) {
        Scanner myScanner;
        myScanner= new Scanner (System.in);
        System.out.print("Enter the number of seconds: ");
        int nSeconds = myScanner.nextInt ();
        
        System.out.print("Enter the number of counts:");
        int nCounts = myScanner.nextInt ();
        
        double distance1; // Caclulates distance in miles
        double distance2; // Calculates MPH
        double wheelDiamter=27.0, // Wheel Diameter
        PI=3.14159, // PI
        inchesPerFoot=12, //Inches in a foot
        secondsPerMinute=60; // Seconds per minute
        double feetPerMile=5280; // Feet per mile
        
        //Distance Equations
        distance1 = nCounts*wheelDiamter*PI/inchesPerFoot/feetPerMile;
        distance2 = 60/(nSeconds/secondsPerMinute)*distance1;
        
        //Print
        System.out.println ("The distance was " + (int) (distance1*100)/100.0+ " and took " +nSeconds/secondsPerMinute+ " minutes");
        System.out.println ("The average MPH was " +(int) (distance2*100)/100.0+ " MPH");
        
    }
}