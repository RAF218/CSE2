//////////////////////////////////
//Ralph Fernandez
//September 14, 2014
//CSE002
//hw06

import java.util.Scanner;

/** This class tells you the root of a double.*/
public class Root{
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        
        System.out.println("Enter a double to determine its root:"); //Prompts the users to enter a double
            Double nNumber = input.nextDouble();
    
    double low = 0; //low
    double high = 1+nNumber; //high
    double middle = 0.0;  //sets middle to 0

        while((high-low)>(0.0000001*(1+nNumber))) { //tolerence for stopping the loop
            middle = ((low+high)/2); //calculates middle
            if ((middle*middle)>nNumber) {
                
                high=middle; //Sets high equal to middle, changing the high boundary 
                    
            }
            else {
                low=middle; //Sets low equal to middle, changing the low boundary
            }
        }
        System.out.println("Your root is"+middle);//Prints root
    }
}