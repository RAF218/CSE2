///////////////////////////////
//Ralph Fernandez
//September 23, 2014
//hw04
//CSE002

import java.util.Scanner;

/** This class calculates the tax rate based on ones income.*/
public class IncomeTax{
    public static void main(String [] args){
        
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        
        
        System.out.print("Enter an int giving the number in the thousands-");
            if (myScanner.hasNextInt()) { //You did not enter a positve Int
            int nTax = myScanner.nextInt(); 
            
            if(nTax <=0) //If int is a negative number
                System.out.print("You did not enter a positive number");
            else if(0<nTax && nTax<=20) //If int is greater than 0 and less then 20
                System.out.print("The tax rate on $" +nTax*1000+ " is 5.0%, and the tax is $ "+(int)(nTax*0.05*1000)); 
            else if(20<nTax && nTax<=40) //If int is greater than 20 and less then 40
                System.out.print("The tax rate on $" +nTax*1000+ " is 7.0%, and the tax is $ " +(int)(nTax*0.07*1000)); 
            else if(40<nTax && nTax<=70) //If int is greater than 40 and less then 70
                System.out.print("The tax rate on $" +nTax*1000+ " is 12.0%, and the tax is $ "+(int)(nTax*0.12*1000)); 
            else  if(nTax >70) //If int is greater than 70
                System.out.print("The tax rate on $" +nTax*1000+ " is 14.0%, and the tax is $ "+(int)(nTax*0.14*1000));
            else {
                System.out.println("You did not enter an Int");
                return;
            }
            
                
            } // End of scanner  
            else {
                System.out.print("You did not enter an Int");
                return;
            }
            
    }
}