//////////////////////////////
//Ralph Fernandez
//hw03
//September 16,2014
//CSE002

import java.util.Scanner;
import java.text.DecimalFormat;

/**This class finds out the last four digits when you enter a number*/

public class FourDigits{
   
    public static void main(String [ ] args) {
       Scanner myScanner;
       myScanner = new Scanner (System.in);
       System.out.print ("Enter a double and I display the four digits to the right of the decimal point-");
       double nNumber = myScanner.nextDouble(); //The number you enter
       int number = (int)nNumber; //Int of the number you entered
       
       double newNumber = nNumber - number; //Number entered-whole number
       
       DecimalFormat decimal = new DecimalFormat ("0000");
       
       //Print
       System.out.println ("The four numbers are " + decimal.format(newNumber * 10000));
       
       
    }
}