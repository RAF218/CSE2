/////////////////////////////
//Ralph Fernandez
//hw03
//September 16, 2014
//CSE 002

import java.util.Scanner;

/**This class finds out the cubed root of a number the user inputs*/
public class Root{
    public static void main(String [ ] args) {
        Scanner myScanner;
        myScanner= new Scanner (System.in);
        
        System.out.print("Enter a double:");
        
        int nDouble = myScanner.nextInt ();
        
        double nGuess = nDouble/3; //The number divided by three
        double X = (nDouble); // The original number 
        double guess1;//formula 
        double guess2;//formula
        double guess3;//formula
        double guess4;//formula
        double Final;//Final formula
        
        //Reiterating the formula to make it more accurate
        guess1 = (2*(nGuess*nGuess*nGuess+nDouble)/(3*nGuess*nGuess));
        guess2 = ((2*guess1*guess1*guess1+nDouble)/(3*guess1*guess1));
        guess3 = ((2*guess2*guess2*guess2+nDouble)/(3*guess2*guess2));
        guess4 = ((2*guess3*guess3*guess3+nDouble)/(3*guess3*guess3));
        Final = ((2*guess4*guess4*guess4+nDouble)/(3*guess4*guess4));
        
        //Print
        System.out.println ("The cubed root is " +Final+ "!");
        System.out.println ("The answer cubed is " +Final + "* " + Final + "* " + Final + " =" + Final*Final*Final);
        
        
        
    }
}