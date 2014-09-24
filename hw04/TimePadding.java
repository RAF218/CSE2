/////////////////////////////////////
//Ralph Fernandez
//September 23, 2014
//hw04
//CSE002

import java.util.Scanner;
import java.text.DecimalFormat;

/**This class puts the time entered into padding format*/
public class TimePadding{
    public static void main(String [] args) {
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        DecimalFormat d = new DecimalFormat("00");
        
        
        System.out.print("Enter the time in seconds: ");
        if (myScanner.hasNextInt()) {
        double nTime=myScanner.nextInt();
        
        double nHours= nTime/3600; //calculates the hours
        nTime = nTime%3600;
        double nMinutes = nTime/60; //calculates the minutes
        double nSeconds = nTime%60; //calculate the seconds
        
        if (nTime>0){ //If the time is greater than 0
            System.out.println("The time is " +d.format((int)(nHours))+":" +d.format((int)(nMinutes))+":"+d.format((int)(nSeconds))+".");
        }
        
        if (nTime<=0){ //If the time is less than or equal to 0
            System.out.println("You did not enter a positive Int");
            return;
        }
        
        } // End of Scanner
        else {
                System.out.print("You did not enter an Int");
                return;
        }
    
    }
}