//////////////////////////////////////
//Ralph Fernandez
//CSE002
//November 18, 2014
//hw10

import java.util.Scanner;

/** This class should use two methods. The method hasDups() should return true if
 * and only if the input array has at least one repeated entry. 
 * The method exactlyOneDup() returns true if and only if there 
 * is exactly one repeated entry (for example, exactlyOneDup() is 
 * true for {2, 7, 2}, false for {2, 2, 2, 3, 4} and false for 
 * { 2, 2, 3, 3})  */
 
public class FindDuplicates {

    public static boolean hasDups(int[] nNumber) {  //hasDups method
        int arrayLength = nNumber.length;  //Set arrayLength equal to the length of nNumber
        boolean ifDuplicate = false;  //Sets to false
        for (int x = 0; x < arrayLength; x++) { //Loop to determine whether it's a duplicate
            for (int y = 0; y < arrayLength; y++) {
                if(x!=y){ //When x does not equal y
                if (nNumber[x]==nNumber[y]) {
                    ifDuplicate = true;
                }
                }
            }
        }
        return ifDuplicate;  //Return the value, true or false 

    }

    public static boolean exactlyOneDup(int[] nNumber) {  //has exactlyOneDup method
        int arrayLength = nNumber.length; //Set arrayLength equal to the length of nNumber
        int numberOfDuplicates = 0;
        boolean oneDup = false; //Set to flase
        if (hasDups(nNumber)) { //If statement to determine if it is true
            for (int x = 0; x < arrayLength; x++) { //Loop to determine if one set of numbers in an array is equal to another set
                for (int y = 0; y < arrayLength; y++) {
                    if (x!=y) { //if x does not equal y
                        if(nNumber[x]==nNumber[y]){
                        numberOfDuplicates++;
                        }
                    }

                }
            }
        }
        if (numberOfDuplicates==2){ //Check if 2
            oneDup=true; //Set to true
        }
        return oneDup; //Return true
    }



    public static void main(String[] arg) {  //Provided Code From Prof. 
        Scanner scan = new Scanner(System.in);
        int num[] = new int[10];
        String answer = "";
        do {
            System.out.print("Enter 10 ints- ");
            for (int j = 0; j < 10; j++) {
                num[j] = scan.nextInt();
            }
            String out = "The array ";
            out += listArray(num); //return a string of the form "{2, 3, -9}"   
            if (hasDups(num)) {
                out += "has ";
            }
            else {
                out += "does not have ";
            }
            out += "duplicates.";
            System.out.println(out);
            out = "The array ";
            out += listArray(num);
            if (exactlyOneDup(num)) {
                out += "has ";
            }
            else {
                out += "does not have ";
            }
            out += "exactly one duplicate.";
            System.out.println(out);
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
            answer = scan.next();
        } while (answer.equals("Y") || answer.equals("y"));
    }

    public static String listArray(int num[]) {
        String out = "{";
        for (int j = 0; j < num.length; j++) {
            if (j > 0) {
                out += ", ";
            }
            out += num[j];
        }
        out += "} ";
        return out;
    }
}