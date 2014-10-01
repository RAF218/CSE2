//////////////////////////////
//Ralph Fernandez
//September 30, 2014
//CSE002
//hw05

import java.util.Scanner;
import java.util.Random;

/** This class presents an expression to the user and ask the user to state the result of of the expression.*/
public class BoolaBoola {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        
        boolean nFirst; //Initialize first random boolean
        boolean nSecond; //Initialize second random boolean
        boolean nThird; //Initialize third random boolean
        int r; //Random
        String operator1; //Initialize first operator
        String operator2; //Initialize second operator
        boolean nLogic;
        
        Random number = new Random (); //Randomize first boolean
        r= number.nextInt(2);
        if (r==1) {
            nFirst= true;
        }
        else {
            nFirst= false;
        }
        
        r= number.nextInt(2); //Randomize second boolean
        if  (r==1)   {
            nSecond= true;
        }
        else {
            nSecond= false;
        }
        
        r= number.nextInt(2); //Randomize third boolean
        if (r==1)    {
            nThird= true;
        }
        else {
            nThird= false;
        }
        
        r=number.nextInt(2); //Randomize operator1
        if (r==1)   {
            operator1 = ("&&");
        } 
        else {
            operator1 = ("||");
        }
        
        r=number.nextInt(2); //Randomize operator2
        if (r==1)   {
            operator2 = ("&&");
        } 
        else {
            operator2 = ("||");
        }
        
        System.out.print("Does " +nFirst+operator1+nSecond+operator2+nThird+ " have the value true (T/t) or false (F/f)");
        String trueOrFalse = input.next();
        
        if(operator1.equals("||")) { //Calculates if the user entered the right answer
            nLogic = (nFirst || nSecond);
        }
        else {
            nLogic = (nFirst && nSecond);
        }
        
        if(operator2.equals("||")) {
            nLogic= (nLogic || nThird);
        }
        else {
            nLogic = (nLogic && nThird);
        }
        
        switch(trueOrFalse) {
            case("T"): //If True
            case("t"):
                if(nLogic == true) { //If logic is true when true
                    System.out.println("Correct!");
                }
                else { //If logic is false when the user entered true
                    System.out.println("Wrong; Try Again");
                }
                break;
            case("F"): //If False
            case("f"):
                if(nLogic == false) { //If logic is false when false
                    System.out.println("Correct!");
                }
                else { //If logic is true when the user entered false
                    System.out.println("Wrong; Try Again");
                }
                break;
            default: System.out.println("Wrong; Try Again"); //default
                    
        }
            
    }
}