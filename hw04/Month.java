/////////////////////////////////
//Ralph Fernandez
//September 23, 2014
//hw04
//CSE002

import java.util.Scanner;

/** This class tells you the number of days based on the month number you enter.*/
public class Month{
    public static void main(String [] args){
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        
        
        System.out.print("Give an int giving the number of the month (1-12): ");
            
           int daysInMonth = 31;
           int nDaysInMonth = 30;
            if (myScanner.hasNextInt()) { //If you did not enter an Int
                int nMonth = myScanner.nextInt();
                if(nMonth == 1 || nMonth==3 || nMonth==5 || nMonth==7|| nMonth==8 || nMonth==10 || nMonth==12) //The months that have 31 days 
                    System.out.println("This month has " + daysInMonth); 
                if(nMonth==4 || nMonth==6 || nMonth==9 || nMonth==11) //The months that have 30 days
                    System.out.println("This month has " + nDaysInMonth);
                else if(nMonth>=13 || nMonth<=0 ) //If you did not enter a month between 1 and 12
                    System.out.println("You did not enter an int between 1-12"); 
                    
                if (nMonth == 2) { //Feburary
                    System.out.print("Enter an Int giving the year: ");
                    int nYear = myScanner.nextInt();
                    if (nYear % 100 ==0) {
                        if (nYear % 400 == 0){
                            System.out.println("This month has 29 days");
                        }
                        else{
                            System.out.println("This month has 28 days");
                        }
                    }
                    else if (nYear % 4 ==0) //If it is a leap year
                        System.out.println("This month has 29 days"); 
                    else System.out.println("This month has 28 days");
                    
                }
                
            } //End of myScanner
            else {
                System.out.print("You did not enter an Int");
                return;
            }
            
                    
    }
}